package org.API.core;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class MihomoAPI {
    private final String BASE_URL = "https://api.mihomo.me/sr_info_parsed/";
    private final String ASSET_URL = "https://raw.githubusercontent.com/Mar-7th/StarRailRes/master/";
    private String UID;
    private final Languages languages;

    public MihomoAPI() {
        this.UID = null;
        this.languages = Languages.jp;
    }

    public MihomoAPI(Languages languages) {
        this.languages = languages;
    }

    public MihomoAPI(final String UID, final Languages languages) {
        this(languages);
        this.UID = UID;
    }

    public void setUID(final String UID) {
        this.UID = UID;
    }

    private boolean nullCheck() {
        return this.UID != null && this.languages != null;
    }

    private String makeHeader() {
        return String.format("%s?lang=%s", this.UID, this.languages);
    }

    private JSONObject connect() throws IOException, InterruptedException {
        if (!nullCheck()) throw new IllegalArgumentException();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(this.BASE_URL.concat(makeHeader())))
                .setHeader("Content-Type", "application/json")
                .GET()
                .build();
        StringBuilder sb = new StringBuilder();

        var response = client.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        return new JSONObject(response.body());
    }

    public JsonObject getResult() throws IOException, InterruptedException {
        String connect = connect().toString();
        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper.readValue(connect, JsonObject.class);
    }

    public String getIconUrl(final String icon) {
        return this.ASSET_URL.concat(icon);
    }

    public String getUrl() {
        return this.BASE_URL.concat(makeHeader());
    }

    public Languages getLang() {
        return this.languages;
    }


}
