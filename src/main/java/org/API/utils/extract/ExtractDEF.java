package org.API.utils.extract;

import org.API.core.JsonObject;
import org.API.utils.extract.core.Extract;

public class ExtractDEF implements Extract {
    private final JsonObject.Characters character;

    public ExtractDEF(JsonObject.Characters character) {
        this.character = character;
    }

    @Override
    public double TotalValue() {
        return this.status() + this.relic();
    }

    @Override
    public double status() {
        return this.character.attributes.stream().filter(s -> s.field.equals("def")).toList().get(0).value;
    }

    @Override
    public double weapon() {
        return this.character.light_cone.attributes.get(2).value;
    }

    @Override
    public double relic() {
        return this.character.additions.stream().filter(s -> s.field.equals("def")).toList().get(0).value;
    }
}
