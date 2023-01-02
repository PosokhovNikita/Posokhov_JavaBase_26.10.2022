package com.hillel.posokhov.homeworks.homework16.classes;

import com.hillel.posokhov.homeworks.homework16.father.MusicStyle;

public class RockMusic extends MusicStyle {
    public RockMusic(String performers) {
        super(performers);
    }

    @Override
    public void playMusic() {
        System.out.println("Performers rock music: " + getPerformers());
    }
}
