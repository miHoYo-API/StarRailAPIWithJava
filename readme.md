<div align="center">
    <h1>Java Star rail API</h1>
    <p>2.0.0 version</p>
</div>

# Requirements
- [jackson-core](https://github.com/FasterXML/jackson)
- [jackson-databind](https://github.com/FasterXML/jackson-databind)
- [json](https://mvnrepository.com/artifact/org.json/json/20190722)


# [Sample Code](https://github.com/wuliao97/StarrailAPI-With-Java/blob/master/src/main/java/org/examples/CharacterInfo.java)
```Java
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

```

# output
```
Name:ゼーレ
HP:4104
ATK: 1917
DEF: 726
SPD: 9
CRIT RATE: 115.83200180530531
CRIT DMG: 195.476002222858
--------------------
Name:銀狼
HP:1411
ATK: 2138
DEF: 436
SPD: 4
CRIT RATE: 34.8080006614327
CRIT DMG: 79.0560008492317
--------------------
Name:羅刹
HP:2908
ATK: 2251
DEF: 252
SPD: 72
CRIT RATE: 22.496000370010698
CRIT DMG: 54.561600415035606
--------------------

Process finished with exit code 0

```
