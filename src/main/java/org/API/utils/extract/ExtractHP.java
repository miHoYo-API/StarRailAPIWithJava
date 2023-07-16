package org.API.utils.extract;

import org.API.core.JsonObject;
import org.API.utils.extract.core.Extract;

public class ExtractHP implements Extract {
    private final JsonObject.Characters character;

    public ExtractHP(JsonObject.Characters character) {
        this.character = character;
    }

    @Override
    public double TotalValue() {
        return this.status() + this.relic();
    }

    @Override
    public double status() {
        return this.character.attributes.stream().filter(s -> s.field.equals("hp")).toList().get(0).value;
    }

    @Override
    public double weapon() {
        return this.character.light_cone.attributes.get(0).value;
    }

    @Override
    public double relic() {
        return this.character.additions.stream().filter(s -> s.field.equals("hp")).toList().get(0).value;
    }
}
