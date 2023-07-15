# Requirements
- jackson-core
- jackson-databind
- json


# Sample Code
```Java
package org.API;

import org.API.core.MihomoAPI;
import org.API.core.jsonObject;

import java.io.IOException;

public class Sample {
    public static void main(String[] args) throws IOException, InterruptedException {
        MihomoAPI mihomoAPI = new MihomoAPI();
        mihomoAPI.setUID("801671759");

        jsonObject result = mihomoAPI.getResult();
        System.out.println("UID: " + result.player.uid);
        System.out.println("NickName: " + result.player.nickname);
        System.out.println("Icon: " + mihomoAPI.getIconUrl(result.player.avatar.icon));
        System.out.println("achievement: " + result.player.space_info.achievement_count);

        System.out.println("\n----- Characters -----\n");

        for (final jsonObject.Characters character : result.characters){
            System.out.println("Name: " + character.name);
            System.out.println("Level: " + character.level);

            for (final var relic : character.relics) {
                System.out.println("- relicName: " + relic.name + " | " + relic.main_affix.name + ": " + relic.main_affix.display);

                StringBuilder sb = new StringBuilder();
                for (final var relic2 : relic.sub_affix) {
                    sb.append("    - ").append(relic2.name).append(":").append(relic2.display).append("\n");
                }
                System.out.print(sb.toString());
            }
        }
    }
}
```

# output
```
UID: 801671759
NickName: Ennui
Icon: https://raw.githubusercontent.com/Mar-7th/StarRailRes/master/icon/avatar/1102.png
achievement: 206

----- Characters -----

Name: ゼーレ
Level: 80
- relicName: 天才の超距離センシング | HP: 705
    - HP:15.1%
    - 会心率:6.1%
    - 会心ダメージ:12.9%
    - 効果抵抗:4.3%
- relicName: 天才の周波数変動キャッチャー | 攻撃力: 352
    - 防御力:42
    - 速度:4
    - 会心ダメージ:18.7%
    - 撃破特効:5.1%
- relicName: 天才のメタバース深潜 | 会心率: 32.3%
    - HP:76
    - 防御力:19
    - 防御力:4.3%
    - 会心ダメージ:21.3%
- relicName: 天才の引力漫歩 | HP: 43.2%
    - HP:33
    - 防御力:63
    - 会心率:5.8%
    - 会心ダメージ:16.8%
- relicName: サルソットの移動都市 | 量子属性与ダメージ: 38.8%
    - HP:76
    - 会心率:5.5%
    - 効果命中:12.5%
    - 効果抵抗:3.4%
- relicName: サルソットの明暗境界線 | 撃破特効: 64.8%
    - 防御力:19
    - 防御力:9.7%
    - 会心率:8.7%
    - 会心ダメージ:16.8%
Name: 銀狼
Level: 80
- relicName: 天才の超距離センシング | HP: 705
    - 防御力:82
    - 防御力:5.3%
    - 速度:2
    - 会心率:8.1%
- relicName: 天才の周波数変動キャッチャー | 攻撃力: 352
    - 防御力:5.3%
    - 会心率:8.7%
    - 会心ダメージ:12.3%
    - 効果命中:8.6%
- relicName: 天才のメタバース深潜 | 会心率: 32.3%
    - 攻撃力:35
    - 攻撃力:7.7%
    - 会心ダメージ:17.4%
    - 撃破特効:11.0%
- relicName: カンパニーの巨構本部 | 量子属性与ダメージ: 38.8%
    - 防御力:35
    - 攻撃力:7.3%
    - 効果命中:3.4%
    - 撃破特効:18.1%
Name: 羅刹
Level: 80
- relicName: 過客の迎春かんざし | HP: 705
    - 攻撃力:38
    - 攻撃力:11.6%
    - 速度:5
    - 効果抵抗:8.2%
- relicName: 過客の游龍腕甲 | 攻撃力: 45
    - 攻撃力:2.7%
    - 効果抵抗:3.1%
    - 撃破特効:4.1%
- relicName: 過客の刺繍の解れた外套 | 会心率: 30.5%
    - HP:71
    - 速度:5
    - 会心ダメージ:5.1%
    - 撃破特効:11.0%
- relicName: 過客の冥途遊歴 | 速度: 23
    - HP:11.6%
    - 防御力:5.3%
    - 会心ダメージ:5.8%
    - 撃破特効:11.6%
- relicName: サルソットの移動都市 | 炎属性与ダメージ: 38.8%
    - 攻撃力:76
    - 速度:2
    - 会心率:6.4%
    - 会心ダメージ:6.4%

Process finished with exit code 0

```