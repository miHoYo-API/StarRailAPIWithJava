package org.examples;

import org.API.core.JsonObject;
import org.API.core.Languages;
import org.API.core.MihomoAPI;

import java.io.IOException;

public class CharacterImages {
    public static void main(String[] args) throws IOException, InterruptedException {
        var api = new MihomoAPI("801671759", Languages.jp);
        JsonObject result = api.getResult();
        JsonObject.Characters character = result.characters.get(0);

        System.out.println("Name: " + character.name);
        System.out.println("Preview: " + api.getIconUrl(character.preview));
        System.out.println("Portrait: " + api.getIconUrl(character.portrait));

        System.out.println("Rank Icons");
        for (final var icon : character.rank_icons) {
            System.out.println("    - " + api.getIconUrl(icon));
        }

        System.out.println("Path: " + api.getIconUrl(character.path.icon));
        System.out.println("Element: " + api.getIconUrl(character.element.icon));

        System.out.println("Skills");
        for (final var skill : character.skills) {
            System.out.println("    - " + api.getIconUrl(skill.icon));
        }

        System.out.println("Skill Trees");
        for (final var skill : character.skill_trees) {
            System.out.println("    - " + api.getIconUrl(skill.icon));
        }

        System.out.println("Light Cone");
        System.out.println("    - " + api.getIconUrl(character.light_cone.icon));
        System.out.println("    - " + api.getIconUrl(character.light_cone.preview));
        System.out.println("    - " + api.getIconUrl(character.light_cone.portrait));
        System.out.println("    - Path Icon: " + api.getIconUrl(character.light_cone.path.icon));

        System.out.println("    - Attributes Icon");
        for (final var attribute : character.light_cone.attributes) {
            System.out.println("        - " + api.getIconUrl(attribute.icon));
        }

        System.out.println("    - Properties Icon");
        for (final var property : character.light_cone.properties) {
            System.out.println("        - " + api.getIconUrl(property.icon));
        }

        System.out.println("Relics");
        for (final var relic : character.relics) {
            System.out.println("    - " + api.getIconUrl(relic.icon));
        }

        System.out.println("Relic Sets");
        for (final var relic_set : character.relic_sets) {
            System.out.println("    - " + api.getIconUrl(relic_set.icon));

            for (final var property : relic_set.properties) {
                System.out.println("        - " + api.getIconUrl(property.icon));
            }
        }

        System.out.println("Attributes");
        for (final var attribute : character.attributes) {
            System.out.println("    - " + api.getIconUrl(attribute.icon));
        }

        System.out.println("Additions");
        for (final var additional : character.additions) {
            System.out.println("    - " + api.getIconUrl(additional.icon));
        }

        System.out.println("Properties");
        for (final var property : character.properties) {
            System.out.println("    - " + api.getIconUrl(property.icon));
        }

    }
}
