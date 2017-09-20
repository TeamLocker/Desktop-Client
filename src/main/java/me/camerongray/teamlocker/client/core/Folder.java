package me.camerongray.teamlocker.client.core;

/**
 * Created by camerong on 19/09/17.
 */
public class Folder {
    private String name;
    private int id;

    public static Folder createNew(String name) {
        Folder folder = new Folder();
        folder.name = name;
        return folder;
    }

//    public Folder addToServer

    public String toString() {
        return name;
    }
}
