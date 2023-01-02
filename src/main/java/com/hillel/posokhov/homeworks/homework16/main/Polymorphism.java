package com.hillel.posokhov.homeworks.homework16.main;

import com.hillel.posokhov.homeworks.homework16.classes.ClassicMusic;
import com.hillel.posokhov.homeworks.homework16.classes.PopMusic;
import com.hillel.posokhov.homeworks.homework16.classes.RockMusic;
import com.hillel.posokhov.homeworks.homework16.father.MusicStyle;

public class Polymorphism {
    public static void main(String[] args) {
        MusicStyle[] musicStyles = new MusicStyle[]{
                new ClassicMusic("Ludwig van Beethoven, Wolfgang Amadeus Mozart, Glenn Gould"),
                new PopMusic("Britney Spears, Madonna, Michael Jackson"),
                new RockMusic("Linkin Park, Red Hot Chili Peppers, David Bowie")
        };
        for (MusicStyle musicStyle:musicStyles) {
            musicStyle.playMusic();
        }
    }

}
