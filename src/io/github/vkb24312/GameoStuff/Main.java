package io.github.vkb24312.GameoStuff;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StartUp startUp = new StartUp();
        StartUp.login();
    }

    public static void login(Object userJSONobj){
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = new JSONObject();
        try {
            Scanner in = new Scanner(new File(userJSONobj.toString()));
            FileReader fileReader = new FileReader(userJSONobj.toString());
            char[] a = new char[500000000];
            fileReader.read(a);
            String f = "";
            for(char c : a) {
                if(c=='\u0000'){
                    break;
                }
                f = f + c;
                System.out.print(c);
            }
            fileReader.close();
            jsonObject = (JSONObject) parser.parse(f);
        } catch (FileNotFoundException e){
            System.out.println("We couldnt find your JSON file. Please try again, using the intended way");
            e.printStackTrace();
        } catch (IOException | ParseException e){
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println("oh dear...");
        }
        JSONObject json = jsonObject;
        System.out.println(json);
        System.out.println("well that took forever to make...");
        System.out.println("Now lets go onto the game");
        Frame[] frames = JFrame.getFrames();
        for (Frame f: frames) {
            f.dispose();
        }
        Game.main(json);
        System.out.print("The program has closed in Main.");
    }
}
