
public class Upgrade {

    private double cost = 100;
    private int powerIncrease;
    private final double level = 1.5;

    //buy a multiplicative upgrade
    public Boolean buyUpgrade(Player player) {
        if (player.spend(cost)){
            cost *= 1.5;
            player.upgradeBonus(powerIncrease);
            return true;
        }
        return false;
    }
    public double getCost(){return cost;}
    public int getNextIncrease(){return powerIncrease;}
}
