
import java.util.*;
import javax.swing.*;

public class upgrade {

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
        JLabel item1 = new JLabel("ITEM1");
        frame.add(item1);
        frame.setVisible(true);
    }
}
