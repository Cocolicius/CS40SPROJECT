
public class Upgrade {

    private double cost = 100;
    private int powerIncrease = 10;
    private double level = 1;

    //buy a multiplicative upgrade
    public Boolean buyUpgrade(Player player) {
        if (player.spend(cost)){
            cost = cost * (Math.pow(1.5,level));
            level++;
            player.upgradeBonus(level);
            return true;
        }
        return false;
    }
    public double getCost(){return cost;}
    public int getNextIncrease(){return powerIncrease;}
    public double getLevel(){return level;}
}
