package main.java.io.github.vkb24312.GameoStuff;

import javax.swing.*;
import java.awt.*;

public class JFrameCreator {
    public static void create(JFrame frame, Dimension Size, int CloseOperation){
        frame.setDefaultCloseOperation(CloseOperation);
        frame.setSize(Size);
        frame.setVisible(true);
    }
}