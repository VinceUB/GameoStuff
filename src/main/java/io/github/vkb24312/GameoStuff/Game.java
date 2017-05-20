package main.java.io.github.vkb24312.GameoStuff;

import main.java.io.github.vkb24312.GameoStuff.Items.Weapon;
import org.json.simple.JSONObject;

import javax.swing.*;
import java.awt.*;

public class Game {
    public static void main(JSONObject json){
        JSONObject inventory = (JSONObject) json.get("Inventory");
        DefaultStuff ds = new DefaultStuff();
        InventoryManager im = new InventoryManager();
        Weapon weapon = (Weapon) im.itemToObject(im.weaponGetter(json)[0].toString());
        JFrame main = null;
        JFrameCreator.create(main, new Dimension(500, 500), 2);
    }

    public static void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

    }
}