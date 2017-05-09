package io.github.vkb24312.GameoStuff.Items;

/**
 * @exception this is thrown when the inventory cannot find an item in the inventory
 */
public class InventoryException extends Exception {
    public InventoryException() { super(); }
    public InventoryException(String message) { super(message); }
    public InventoryException(String message, Throwable cause) { super(message, cause); }
    public InventoryException(Throwable cause) { super(cause); }
}