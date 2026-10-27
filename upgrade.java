
import java.util.Scanner;

import javax.swing.JButton;

public class Upgrade {

    private double cost = 10;
    private int powerIncrease;
    private int level;

    private JButton button1;
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

}
