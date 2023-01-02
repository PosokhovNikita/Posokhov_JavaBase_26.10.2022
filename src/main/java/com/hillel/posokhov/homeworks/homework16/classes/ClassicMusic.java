package com.hillel.posokhov.homeworks.homework16.classes;

import com.hillel.posokhov.homeworks.homework16.father.MusicStyle;

public class ClassicMusic extends MusicStyle {

    public ClassicMusic(String performers) {
        super(performers);
    }

    @Override
    public void playMusic() {
        System.out.println("Performers classic music: " + getPerformers());
    }
}
