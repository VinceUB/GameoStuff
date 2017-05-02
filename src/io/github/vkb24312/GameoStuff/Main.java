package io.github.vkb24312.GameoStuff;

import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        StartUp startUp = new StartUp();
        startUp.login();
    }

    public static void game(JSONObject json){

    }

    public static void login(JSONObject json){
        File userJSON = new File(json.get("userDIR").toString());
    }
}
