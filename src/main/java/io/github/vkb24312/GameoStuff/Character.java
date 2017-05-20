package main.java.io.github.vkb24312.GameoStuff;

import main.java.io.github.vkb24312.GameoStuff.Items.Weapon;

import java.awt.*;

public interface Character {
    static void moveNorth(){
        System.out.print("This character cannot move");
    }

    static void moveSouth(){
        System.out.print("This character cannot move");
    }

    static void moveEast(){
        System.out.print("This character cannot move");
    }

    static void moveWest(){
        System.out.print("This character cannot move");
    }

    Image sprite = null;

    String name = "Unnamed Character";

    String desc = "A character Vincent was too lazy to give a description to";

    int attack = 1;

    Weapon weapon = null;
}
