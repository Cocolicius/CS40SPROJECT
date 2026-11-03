
public class Player{

    private double points = 1;
    private double clickBonus = 1.0;
    private String clickPower = "";
    private double totalAccum = 0;


    
    //Deducts total points (if applicable).
    public boolean spend(final double cost){

        if (cost <= points){
            points -= cost;
            return true;
        }
        return false;
    }
    public void upgradeBonus(double level){clickBonus *= 1.5;}
    public void upgradePower(String power){clickPower = power;}
    public double getPoints(){return points;}
    //Gets total points ever accumulated.
    public int getPointsMemory(){return (int) totalAccum;}
    public double getClickBonus(){return clickBonus;}
    public String getClickPower(){return clickPower;}
    public void click(){
        points += clickBonus;
        totalAccum += clickBonus;
    }
    public void earnAuto(double amount){
        points += amount;
        totalAccum += amount;
    }
    public void reward(int r){points += r;}
    @Override
    public String toString(){return "Points: " + points + "ClickBonus: " + clickBonus + "ClickPower: " + clickPower + "Point Memory: " + totalAccum;}
}