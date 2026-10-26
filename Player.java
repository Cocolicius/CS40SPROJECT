
public class Player{

    private int points;
    private double clickBonus;
    private String clickPower;
    private int totalAccum;

    //Deducts total points.
    public boolean spend(final int cost){

        if (cost <= points){
            points -= cost;
            return true;
        }
        return false;
    }
    public void upgradePower(String power){clickPower = power;}
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