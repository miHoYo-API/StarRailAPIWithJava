package org.API;

import org.API.core.MihomoAPI;
import org.API.core.jsonObject;

import java.io.IOException;

public class Sample {
    public static void main(String[] args) throws IOException, InterruptedException {
        MihomoAPI mihomoAPI = new MihomoAPI();
        mihomoAPI.setUID("801671759");

        jsonObject result = mihomoAPI.getResult();
        System.out.println("UID: " + result.player.uid);
        System.out.println("NickName: " + result.player.nickname);
        System.out.println("Icon: " + mihomoAPI.getIconUrl(result.player.avatar.icon));
        System.out.println("achievement: " + result.player.space_info.achievement_count);

        System.out.println("\n----- Characters -----\n");

        for (final jsonObject.Characters character : result.characters){
            System.out.println("Name: " + character.name);
            System.out.println("Level: " + character.level);

            for (final var relic : character.relics) {
                System.out.println("- relicName: " + relic.name + " | " + relic.main_affix.name + ": " + relic.main_affix.display);

                StringBuilder sb = new StringBuilder();
                for (final var relic2 : relic.sub_affix) {
                    sb.append("    - ").append(relic2.name).append(":").append(relic2.display).append("\n");
                }
                System.out.print(sb.toString());
            }
        }
    }
}