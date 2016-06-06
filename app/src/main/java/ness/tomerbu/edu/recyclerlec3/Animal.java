package ness.tomerbu.edu.recyclerlec3;

/**
 * Created by android on 06/06/2016.
 */
public class Animal {
    int imageResId;
    int soundResId;
    String name;

    public Animal(String name,int imageResId, int soundResId) {
        this.imageResId = imageResId;
        this.soundResId = soundResId;
        this.name = name;
    }
}
