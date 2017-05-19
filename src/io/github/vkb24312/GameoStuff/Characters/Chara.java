package io.github.vkb24312.GameoStuff.Characters;

import io.github.vkb24312.GameoStuff.Character;

public class Chara implements Character{
    static void moveNorth(int x, int y){
        System.out.print("This character cannot move");
    }

    static void moveSouth(int x, int y){
        System.out.print("This character cannot move");
    }

    static void moveEast(int x, int y){
        System.out.print("This character cannot move");
    }

    static int[] moveWest(int x, int y){
        int[] dimensions = {x++, y++};
        return dimensions;
    }
}