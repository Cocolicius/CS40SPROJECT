
import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

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
        // button1.addActionListener(this);
        // button1.
        JButton button2 = new JButton("Button");
        frame.add(button2);
        // button2.addActionListener(this);


        //sss

        frame.setBounds(200, 100, 600, 400);
        frame.setVisible(true);
        // button1.addActionListener((ActionEvent event) -> {
        //     System.out.println("Clicked1");
        // });

        // button2.addActionListener((ActionEvent event) -> {
        //     System.out.println("Clicked2");
        // });
        // public void actionPerformed(ActionEvent e) {
        //     if (e.getSource() == button1) {
        //         frame.getContentPane().setBackground(new Color(255, 0, 0));
        //     } else {
        //         (e.getSource() == button2)
        //     }{
        //         frame.getContentPane().setBackground(new Color(0, 255, 0));
        //     }
        // }
    }
}
