public class TimerUpgrade {
    private double cost = 150;
    private int level = 0;

    // Each purchase adds one point per second
    public boolean buyUpgrade(Player player) {
        if (player.spend(cost)) {
            level++;
            cost *= 1.3;
            return true;
        }
        return false;
    }

    public double getCost() { return cost; }
    public int getPointsPerSecond() { return level; }
}
