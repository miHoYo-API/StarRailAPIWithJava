package org.API.utils.extract;

import org.API.core.JsonObject;
import org.API.utils.extract.core.Extract;

public class ExtractCritDmg implements Extract {
    private final JsonObject.Characters character;

    public ExtractCritDmg(JsonObject.Characters character) {
        this.character = character;
    }

    @Override
    public double TotalValue() {
        return this.status() + this.relic();
    }

    @Override
    public double status() {
        for (final var i : this.character.additions) {
            if (!i.field.equals("crit_dmg")) continue;
            return i.value;
        }
        return 0.;
    }

    @Override
    public double weapon() {
        JsonObject.Characters.LightCone.Properties properties = this.character.light_cone.properties.get(0);
        return properties.field.equals("crit_dmg") ? properties.value : 0;
    }

    @Override
    public double relic() {
        for (final var i : this.character.additions) {
            if (!i.field.equals("crit_rate")) continue;
            return i.value;
        }
        return 0.;
    }
}
