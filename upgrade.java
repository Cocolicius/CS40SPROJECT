
import java.awt.*;
import javax.swing.*;

public class Upgrade {

    private double cost = 10;
    private double powerIncrease = 10;
    private int level = 1;

    //buy a multiplicative upgrade
    public boolean buyUpgrade(Player player) {

        boolean status = false;
        if (player.getPoints() <= cost){
            player.upgradeBonus(powerIncrease);
            status = player.spend(cost);
            level++;
            cost *= level;
        }
        return status;
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
