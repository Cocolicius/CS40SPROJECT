
import java.util.*;
import javax.swing.*;

public class upgrade {

    private double cost = 10;
    private int powerIncrease;
    private int level;
<<<<<<< HEAD
    scanner in = new Scanner(system.in);
=======
    Scanner in = new Scanner(System.in);
>>>>>>> 2ab2aac224ff9d5fc65d6e6992b2953002e03120

    //buy a multiplicative upgrade
    public Boolean buyUpgrade(int points) {
        if (points < cost) {
            return false;
        } else {
            cost *= 1.5;
            return true;
        }
    }

<<<<<<< HEAD
    public void displayShop() {
        JFrame frame = new JFrame("displayShop");
=======
    //Trying out swing for the shop
    public void displayShop() {
        JFrame frame = new JFrame("displayShop");
        JLabel item1 = new JLabel("ITEM1");
        frame.add(item1);
        frame.setVisible(true);
>>>>>>> 2ab2aac224ff9d5fc65d6e6992b2953002e03120
    }
}
