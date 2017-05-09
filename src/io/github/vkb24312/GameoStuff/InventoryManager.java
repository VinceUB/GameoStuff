package io.github.vkb24312.GameoStuff;

import io.github.vkb24312.GameoStuff.Items.Swords.OldSword;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class InventoryManager{
    public static Object[] getInventory(JSONObject json){
        Object[] objs = new Object[Integer.parseInt(json.get("InventorySpace").toString())];
        JSONParser parser = new JSONParser();
        JSONObject Inventory = (JSONObject) json.get("Inventory");
        for (int i = 0; i < Integer.parseInt(json.get("InventorySpace").toString()); i++) {objs[i] = Inventory.get(Integer.toString(i));
            System.out.print(Integer.toString(i)+", ");
        }
        return objs;
    }

    public static Object itemGetter(String item){
        if(item.equals("OldSword")){
            return new OldSword();
        } else {
            return null;
        }
    }
}