
public class Upgrade {

    private double cost = 100;
    private double powerIncrease = 1.5;
    private final double level = 1.5;

    //buy a multiplicative upgrade
    public Boolean buyUpgrade(Player player) {
        if (player.spend(cost)){
            cost *= level;
            player.upgradeBonus(powerIncrease);
            return true;
        }
        return false;
    }
    public double getCost(){return cost;}
    public double getNextIncrease(){return powerIncrease;}
}
