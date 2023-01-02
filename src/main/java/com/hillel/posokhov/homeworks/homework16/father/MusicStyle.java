package com.hillel.posokhov.homeworks.homework16.father;

public abstract class MusicStyle {
     public String performers;

    public abstract void playMusic();

    public MusicStyle(String performers) {
        this.performers = performers;
    }

    public String getPerformers() {
        return performers;
    }
}
