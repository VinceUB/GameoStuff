package io.github.vkb24312.GameoStuff;

import com.google.gson.Gson;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        StartUp startUp = new StartUp();
        startUp.login();
    }

    public static void game(JSONObject json){

    }

    public static void login(JSONObject json, Object userJSONobj){
        File userJSON = (File) userJSONobj;
        Gson gson = new Gson();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(userJSON));
            String jsonString = gson.toJson(bufferedReader.readLine());
            org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
            json = (JSONObject) new org.json.simple.parser.JSONParser().parse(jsonString);
        } catch (FileNotFoundException e){
            System.out.print("\n");
            System.out.println("Some bug occured where the system thought you had a profile but you dont");
            System.out.println("If youre a nerd, here's the full stacktrace:");
            e.printStackTrace();
            try {Thread.sleep(100);} catch (InterruptedException e1){e1.printStackTrace();}
            System.out.print("Please report the error message on https://github.com/vkb24312/GameoStuff/issues/new and I'll fix it as soon as possible");
        } catch (IOException e){
            e.printStackTrace();
        } catch (ParseException e){
            e.printStackTrace();
        }
    }
}
