import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Title goes here");
        this.setSize(420,420);
        this.setResizable(false);

        this.setVisible(true);
        this.getContentPane().setBackground(new Color(255,0,0)); //change color of background



    }
}
