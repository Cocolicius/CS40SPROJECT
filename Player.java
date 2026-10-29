
public class Player{

    private double points = 0;
    private double clickBonus = 10.0;
    private String clickPower = "";
    private double totalAccum = 0;

    //Deducts total points.
    public boolean spend(final double cost){

        if (cost <= points){
            points -= cost;
            return true;
        }
        return false;
    }
    public void upgradeBonus(final double multiplier){clickBonus *= multiplier;}
    public void upgradePower(final String power){clickPower = power;}
    public double getPoints(){return points;}
    //Gets total points ever accumulated.
    public double getPointsMemory(){return totalAccum;}
    public double getClickBonus(){return clickBonus;}
    public String getClickPower(){return clickPower;}
    public void click(){
        points += clickBonus;
        totalAccum += clickBonus;
    }
    @Override
    public String toString(){return "Points: " + points + "ClickBonus: " + clickBonus + "ClickPower: " + clickPower + "Point Memory: " + totalAccum;}
}