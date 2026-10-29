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
    public double getCost(){return cost;}
    public double getPowerIncrease(){return powerIncrease;}
    public int getLevel(){return level;}
}
