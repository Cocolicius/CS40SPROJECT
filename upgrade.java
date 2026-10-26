
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Upgrade {

    private double cost = 10;
    private int powerIncrease;
    private int level;
    Scanner in = new Scanner(System.in);

    //buy a multiplicative upgrade
    public Boolean buyUpgrade(int points) {
        if (points < cost) {
            return false;
        } else {
            cost *= 1.5;
            return true;
        }
    }

    //Trying out swing for the shop
    public void displayShop() {
        JFrame frame = new JFrame("displayShop");
        frame.setSize(1080, 720);
        //layout
        FlowLayout experimentLayout = new FlowLayout();
        frame.setLayout(experimentLayout);

        JButton button1 = new JButton("Button");
        frame.add(button1);
        button1.JButton button2 = new JButton("Button");
        frame.add(button2);

        frame.setBounds(200, 100, 600, 400);
        frame.setVisible(true);

        button1.addActionListener((ActionEvent event) -> {
            System.out.println("Clicked1");
        });

        button2.addActionListener((ActionEvent event) -> {
            System.out.println("Clicked2");
        });

    }
}
