package com.hillel.posokhov.homeworks.homework16.classes;

import com.hillel.posokhov.homeworks.homework16.father.MusicStyle;

public class PopMusic extends MusicStyle {
    public PopMusic(String performers) {
        super(performers);
    }

    @Override
    public void playMusic() {
        System.out.println("Performers pop music: " + getPerformers());
    }
}
