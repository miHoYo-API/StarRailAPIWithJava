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
        for (final var i : this.character.additions) {
            if (!i.field.equals("def")) continue;
            return i.value;
        }
        return 0.;
    }

    @Override
    public double weapon() {
        return this.character.light_cone.attributes.get(2).value;
    }

    @Override
    public double relic() {
        for (final var i : this.character.additions) {
            if (!i.field.equals("def")) continue;
            return i.value;
        }
        return 0.;
    }
}
