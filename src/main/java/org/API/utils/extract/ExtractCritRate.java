package org.API.utils.extract;

import org.API.core.JsonObject;
import org.API.utils.extract.core.Extract;

public class ExtractCritRate implements Extract {
    private final JsonObject.Characters character;

    public ExtractCritRate(JsonObject.Characters character) {
        this.character = character;
    }

    @Override
    public double TotalValue() {
        return this.status() + this.relic();
    }

    @Override
    public double status() {
        return this.character.attributes.stream().filter(s -> s.field.equals("crit_rate")).toList().get(0).value;
    }

    @Override
    public double weapon() {
        JsonObject.Characters.LightCone.Properties properties = this.character.light_cone.properties.get(0);
        return properties.field.equals("crit_rate") ? properties.value : 0;
    }

    @Override
    public double relic() {
        return this.character.additions.stream().filter(s -> s.field.equals("crit_rate")).toList().get(0).value;
    }
}
