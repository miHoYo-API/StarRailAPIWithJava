package org.API.utils.extract;

import org.API.core.JsonObject;
import org.API.utils.extract.core.Extract;

public class ExtractSPD implements Extract {
    private final JsonObject.Characters character;

    public ExtractSPD(JsonObject.Characters character) {
        this.character = character;
    }


    @Override
    public double TotalValue() {
        return this.status() + this.relic();
    }

    @Override
    public double status() {
        for (final var i : this.character.additions) {
            if (!i.field.equals("spd")) continue;
            return i.value;
        }
        return 0.;
    }

    @Override
    public double weapon() {
        return 0;
    }

    @Override
    public double relic() {
        for (final var i : this.character.additions) {
            if (!i.field.equals("spd")) continue;
            return i.value;
        }
        return 0.;
    }
}
