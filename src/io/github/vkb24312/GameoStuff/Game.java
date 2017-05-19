package io.github.vkb24312.GameoStuff;

import io.github.vkb24312.GameoStuff.Items.Weapon;
import org.json.simple.JSONObject;

public class Game {
    public static void main(JSONObject json){
        JSONObject inventory = (JSONObject) json.get("Inventory");
        DefaultStuff ds = new DefaultStuff();
        InventoryManager im = new InventoryManager();
        Weapon weapon = (Weapon) im.itemToObject(inventory.get("1").toString());
    }
}