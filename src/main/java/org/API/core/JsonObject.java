package org.API.core;

import java.util.List;

public class JsonObject {

    public Player player;
    public static class Player {
        public String uid;
        public String nickname;
        public int level;
        public int world_level;
        public int friend_count;

        public Avatar avatar;

        public static class Avatar {
            public String id;
            public String name;
            public String icon;
        }

        public String signature;
        public boolean is_display;

        public SpaceInfo space_info;
        public static class SpaceInfo {
            public ChallengeData challenge_data;
            public static class ChallengeData {
                public int maze_group_id;
                public int maze_group_index;
                public int pre_maze_group_index;
            }

            public int pass_area_progress;
            public int light_cone_count;
            public int avatar_count;
            public int achievement_count;
        }
    }

    public List<Characters> characters;
    public static class Characters {
        public String id;
        public String name;
        public int rarity;
        public int rank;
        public int level;
        public int promotion;
        public String icon;
        public String preview;
        public String portrait;
        public List<String> rank_icons;

        public Path path;
        public static class Path {
            public String id;
            public String name;
            public String icon;
        }

        public Element element;
        public static class Element {
            public String id;
            public String name;
            public String color;
            public String icon;
        }

        public List<Skills> skills;
        public static class Skills {
            public String id;
            public String name;
            public int level;
            public int max_level;

            public Element element;
            public static class Element {
                public String id;
                public String name;
                public String color;
                public String icon;
            }

            public String type;
            public String type_text;
            public String effect;
            public String simple_desc;
            public String desc;
            public String icon;
        }

        public List<SkillTrees> skillTrees;
        public static class SkillTrees {
            public String id;
            public int level;
            public String icon;
        }

        public LightCone light_cone;
        public static class LightCone {
            public String id;
            public String name;
            public int rarity;
            public int rank;
            public int level;
            public int promotion;
            public String icon;
            public String preview;
            public String portrait;

            public Path path;

            public static class Path {
                public String id;
                public String name;
                public String icon;
            }

            public List<Attributes> attributes;
            public static class Attributes {
                public String field;
                public String name;
                public String icon;
                public double value;
                public String display;
                public boolean percent;
            }

            public List<Properties> properties;
            public static class Properties {
                public String type;
                public String field;
                public String name;
                public String icon;
                public double value;
                public String display;
                public boolean percent;
            }
        }

        public List<Relics> relics;
        public static class Relics {
            public String id;
            public String name;
            public String set_id;
            public String set_name;
            public int rarity;
            public int level;
            public String icon;

            public MainAffix main_affix;
            public static class MainAffix {
                public String type;
                public String field;
                public String name;
                public String icon;
                public double value;
                public String display;
                public boolean percent;
            }

            public List<SubAffix> sub_affix;
            public static class SubAffix {
                public String type;
                public String field;
                public String name;
                public String icon;
                public double value;
                public String display;
                public boolean percent;
                public int count;
                public int step;
            }
        }

        public List<RelicsSets> relic_sets;
        public static class RelicsSets {
            public String id;
            public String name;
            public String icon;
            public int num;
            public String desc;

            public List<Properties> properties;

            public static class Properties {
                public String type;
                public String field;
                public String name;
                public String icon;
                public double value;
                public String display;
                public boolean percent;
            }
        }

            public List<Attributes> attributes;
            public static class Attributes {
                public String field;
                public String name;
                public String icon;
                public double value;
                public String display;
                public boolean percent;
            }

            public List<Additions> additions;
            public static class Additions {
                public String field;
                public String name;
                public String icon;
                public double value;
                public String display;
                public boolean percent;
            }

            public List<Properties> properties;
            public static class Properties {
                public String type;
                public String field;
                public String name;
                public String icon;
                public double value;
                public String display;
                public boolean percent;
            }
    }
}
