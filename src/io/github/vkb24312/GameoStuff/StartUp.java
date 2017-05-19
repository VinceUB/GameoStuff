package io.github.vkb24312.GameoStuff;

import org.json.simple.JSONObject;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class StartUp{
    public static void login(){
        JFrame frame = new JFrame("Game o'Stuff login/signup");
        JFrameCreator jFrameCreator = new JFrameCreator();
        jFrameCreator.create(frame, new Dimension(300, 300), 3);

        JPanel panel = new JPanel(new FlowLayout());
        JTextField username = new JTextField();
        JPasswordField password = new JPasswordField();
        JLabel warning = new JLabel("The encryption of your Name and Password is very low, so dont use any secret information");
        panel.add(warning);
        panel.add(username);
        panel.add(password);
        frame.add(panel);
        username.setText("Name");
        password.setText("Password");
        password.setEchoChar((char)0);
        frame.setSize(300, 150);

        password.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                warn();
            }
            public void removeUpdate(DocumentEvent e) {
                warn();
            }
            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                password.setEchoChar('*');
            }
        });

        JButton button = new JButton("Log In/Sign Up");
        panel.add(button);
        frame.setSize(550, 125);

        button.addActionListener(e -> {
            username.setVisible(false);
            password.setVisible(false);
            warning.setText("Please wait...");
            button.setVisible(false);
            frame.setSize(100, 75);

            File userDIR;
            if(System.getProperty("os.name").startsWith("Windows")){
                userDIR = new File(System.getenv("APPDATA")+"/Ultrabanana/Profiles/"+username.getText()+"/"+password.getText());
            } else if(System.getProperty("os.name").startsWith("Mac")){
                userDIR = new File("~/Library/Application Support/Ultrabanana/Profiles/"+username.getText()+"/"+password.getText()+"/");
            } else if(System.getProperty("os.name").startsWith("Linux")){
                userDIR = new File("~/Ultrabanana/Profiles/"+username.getText()+"/"+password.getText()+"/");
            } else {
                warning.setText(System.getProperty("os.name") + " is not supported yet. Please wait for me to update the program to support your OS.");
                frame.setSize(1000, 75);
                userDIR = new File("");
                while(true){}
            }
            boolean newUser;
            newUser = userDIR.mkdirs();
            JSONObject json = new JSONObject();
            json.put("username", username.getText());
            json.put("password", password.getText());
            json.put("userDIR", userDIR.toString());
            json.put("userJSON", userDIR.toString()+"/userJSON.json");
            JButton ok = new JButton("Continue");
            JButton cancel = new JButton("Back");
            panel.add(cancel);
            panel.add(ok);
            if(newUser) {
                warning.setText("This user doesnt exist");
                ok.setVisible(true);
                cancel.setVisible(true);
            } else {
                warning.setText("This user exists");
                ok.setVisible(true);
                cancel.setVisible(true);
            }
            frame.setSize(175, 110);

            ok.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(newUser) {
                        signup(json);
                        frame.dispose();
                    } else {

                        Main.login(json.get("userJSON"));
                    }
                }
            });

            cancel.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    StartUp.login();
                    if(newUser){
                        File foo = new File(userDIR.getParent());
                        userDIR.delete();
                        if(foo.list().length>0){}else{
                            foo.delete();
                        }
                    }
                }
            });
        });
    }

    public static void signup(JSONObject json){
        Random random = new Random();
        JFrameCreator jFrameCreator = new JFrameCreator();
        DefaultStuff values = new DefaultStuff();
        JFrame frame = new JFrame();

        jFrameCreator.create(frame, values.defaultDimension, 3);

        JTextField Name = new JTextField(json.get("username").toString());
        JLabel Namel = new JLabel("Your first name");

        String defaultSurname = DefaultStuff.surnames[random.nextInt(1000)];
        char[] defaultSurnamechar = defaultSurname.toCharArray();
        defaultSurname = java.lang.Character.toString(defaultSurnamechar[0]).toUpperCase();
        for (int i = 1; i < defaultSurnamechar.length; i++) {
            defaultSurname = defaultSurname + java.lang.Character.toString(defaultSurnamechar[i]).toLowerCase();
        }
        JTextField Surname = new JTextField(defaultSurname);
        JLabel Surnamel = new JLabel("Your Surname");

        String[] availableGenders = {"Male", "Female", "Other/Unspecified"};
        JComboBox Gender = new JComboBox(availableGenders);
        JLabel Genderl = new JLabel("Your gender");

        JButton button = new JButton("Start Game");

        JPanel panel = new JPanel(new FlowLayout());

        panel.add(Namel);
        panel.add(Name);
        panel.add(Surnamel);
        panel.add(Surname);
        panel.add(Genderl);
        panel.add(Gender);
        panel.add(button);

        frame.add(panel);
        frame.setSize(175, 300);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                json.put("Name", Name.getText());
                json.put("Surname", Surname.getText());
                json.put("Gender", Gender.getSelectedItem());
                json.put("Money", new Float(100.00));
                json.put("InventorySpace", new Integer(64));
                JSONObject inventory = new JSONObject();
                inventory.put(1, "OldSword");
                json.put("Inventory", inventory);
                json.put("userJSON", System.getProperty("os.name").startsWith("Windows") ? json.get("userDIR").toString()+"\\userJSON.json":json.get("userDIR").toString()+"/userJSON.json");

                System.out.println(json);

                try{
                    PrintWriter writer = new PrintWriter(json.get("userDIR").toString()+"/userJSON.json");
                    writer.println(json);
                    writer.close();
                } catch (FileNotFoundException F) {
                    F.printStackTrace();
                }

                Main main = new Main();
                Game.main(json);
            }
        });
    }
}
//TEST