
import java.util.*;
import javax.swing.*;

public class upgrade {

    private double cost = 10;
    private int powerIncrease;
    private int level;
    scanner in = new Scanner(system.in);

    //buy a multiplicative upgrade
    public Boolean buyUpgrade(int points) {
        if (points < cost) {
            return false;
        } else {
            cost *= 1.5;
            return true;
        }
    }

    public void displayShop() {
        JFrame frame = new JFrame("displayShop");
    }
}
