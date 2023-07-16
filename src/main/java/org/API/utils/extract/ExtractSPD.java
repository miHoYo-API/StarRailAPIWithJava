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
        return this.character.attributes.stream().filter(s -> s.field.equals("spd")).toList().get(0).value;
    }

    @Override
    public double weapon() {
        return 0;
    }

    @Override
    public double relic() {
        return this.character.additions.stream().filter(s -> s.field.equals("spd")).toList().get(0).value;
    }
}
