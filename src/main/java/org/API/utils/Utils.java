package org.API.utils;

import org.API.utils.extract.*;
import org.API.core.JsonObject;

public class Utils {
    public static int extractHP(final JsonObject.Characters character) {
        return (int) new ExtractHP(character).TotalValue();
    }

    public static int extractATK(final JsonObject.Characters character) {
        return (int) new ExtractATK(character).TotalValue();
    }

    public static int extractDEF(final JsonObject.Characters character) {
        return (int) new ExtractDEF(character).TotalValue();
    }

    public static int extractSPD(final JsonObject.Characters character) {
        return (int) new ExtractSPD(character).TotalValue();
    }


    public static double extractCritRate(final JsonObject.Characters character) {
        return new ExtractCritRate(character).TotalValue();
    }

    public static double extractCritDmg(final JsonObject.Characters character) {
        return new ExtractCritDmg(character).TotalValue();
    }

}
