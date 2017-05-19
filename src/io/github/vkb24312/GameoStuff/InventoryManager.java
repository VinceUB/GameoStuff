package io.github.vkb24312.GameoStuff;

import io.github.vkb24312.GameoStuff.Items.Weapon;
import io.github.vkb24312.GameoStuff.Items.Weapons.OldSword;
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

    public static Object itemToObject(String item){
        if(item.equals("OldSword")){
            return new OldSword();
        } else {
            return null;
        }
    }

    public static Weapon[] weaponGetter(JSONObject json){
        JSONObject inv = (JSONObject) json.get("Inventory");
        int InvSpace = (int) inv.get("InventorySpace");
        int foo = 0;
        Weapon[] weapons = new Weapon[InvSpace];
        weapons = null;
        for (int i = 0; i < InvSpace; i++) {
            Item weaapon = (Item) inv.get(Integer.toString(i));
            if(weaapon instanceof Weapon){
                weapons[foo] = (Weapon) weaapon;
                foo++;
            }
        }
        return weapons;
    }

    /**
     * @exception this is thrown when the inventory cannot find an item in the inventory
     */
    public static class InventoryException extends Exception {
        public InventoryException() { super(); }
        public InventoryException(String message) { super(message); }
        public InventoryException(String message, Throwable cause) { super(message, cause); }
        public InventoryException(Throwable cause) { super(cause); }
    }
}