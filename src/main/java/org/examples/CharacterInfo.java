package org.examples;

import org.API.core.JsonObject;
import org.API.core.Languages;
import org.API.core.MihomoAPI;
import org.API.utils.Utils;

import java.io.IOException;

public class CharacterInfo {
    public static void main(String[] args) throws IOException, InterruptedException {
        MihomoAPI api = new MihomoAPI("801671759", Languages.jp);
        JsonObject result = api.getResult();

        for (final JsonObject.Characters character : result.characters) {
            System.out.println("Name:" + character.name);
            System.out.println("HP:" + Utils.extractHP(character));
            System.out.println("ATK: " + Utils.extractATK(character));
            System.out.println("DEF: " + Utils.extractDEF(character));
            System.out.println("SPD: " + Utils.extractSPD(character));
            System.out.println("CRIT RATE: " + Utils.extractCritRate(character) * 100);
            System.out.println("CRIT DMG: " + Utils.extractCritDmg(character) * 100);

            System.out.println("--------------------");
        }
    }
}
