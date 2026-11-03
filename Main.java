
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
//Noah,Denise,Collins
//Oct 21 2026
//Clicker Game

//Testing push
public class Main{

    public static void main(String[] args) {

        //Creating the Objects
        Upgrade g1 = new Upgrade();
        Player player = new Player();
        TimerUpgrade timerUpgrade = new TimerUpgrade();

        //Achievements
        Achievement beginner = new Achievement("Rank1", 10, 100);

        Achievement pro =  new Achievement("Rank2", 500,1000);

        Achievement master = new Achievement("Rank3", 100000, 100000);

        //Jframe
        JFrame frame =  new JFrame();
        frame.setLayout(new FlowLayout());

        //Click button
        JButton clickBtn=  new JButton("Click");
        frame.add(clickBtn);

        //Upgrade button
        JButton upgradeBtn=  new JButton("Upgrade");
        frame.add(upgradeBtn);

        //timer button
        JButton timerBtn = new JButton("AutoClick");
        frame.add(timerBtn);
    
        //Points label
        JLabel pointAmount = new JLabel("String.format(\"Points: %.2f\", player.getPoints())");
        frame.add(pointAmount);

        //Achievement label
        JLabel achivementLabel = new JLabel("aaa");
        achivementLabel.setBounds(20,60,370,30);
        // frame.add(achivementLabel);

        //Cost of Upgrade
        JLabel costAmount = new JLabel(String.format("Upgrade cost: %.2f", g1.getCost()));
        frame.add(costAmount);
    
        //Multiplier
        JLabel multiplier = new JLabel(String.format("Points Per Click: %.2f", player.getClickBonus()));
        frame.add(multiplier);

        JLabel timerCost = new JLabel(String.format("Timer cost: %.2f", timerUpgrade.getCost()));
        frame.add(timerCost);

        JLabel pointsPerSecond = new JLabel("Points Per Second: 0");
        frame.add(pointsPerSecond);

        frame.setSize(1280,720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    
        //Click function with points increasing
        ActionListener listener = e ->{
            Object source = e.getSource();
            if (source == clickBtn){
                player.click();
                System.out.println(player.getPoints());
                beginner.checkAchievement(player.getPointsMemory());
                pro.checkAchievement(player.getPointsMemory());
                master.checkAchievement(player.getPointsMemory());
            }
            else if (source == upgradeBtn) g1.buyUpgrade(player);
            else if (source == timerBtn) timerUpgrade.buyUpgrade(player);
            

            // player.reward(beginner.claimReward());
            // player.reward(pro.claimReward());
            // player.reward(master.claimReward());

            achivementLabel.setText(
                beginner.toString() + " | " +
                pro.toString() + " | " + 
                master.toString()
            );

            pointAmount.setText(String.format("Points: %.2f",player.getPoints()));
            costAmount.setText(String.format("Upgrade cost: %.2f",  g1.getCost()));
            multiplier.setText(String.format("Points Per Click: %.2f", player.getClickBonus()));
            timerCost.setText(String.format("Timer cost: %.2f", timerUpgrade.getCost()));
            pointsPerSecond.setText("Points Per Second: " + timerUpgrade.getPointsPerSecond());

        };
        clickBtn.addActionListener(listener);
        upgradeBtn.addActionListener(listener);
        timerBtn.addActionListener(listener);

        //Timer action
        Timer timer = new Timer(1000, e -> {
            if(timerUpgrade.getPointsPerSecond() > 0) {
                player.earnAuto(timerUpgrade.getPointsPerSecond());
                beginner.checkAchievement(player.getPointsMemory());
                pro.checkAchievement(player.getPointsMemory());
                master.checkAchievement(player.getPointsMemory());
                pointAmount.setText(String.format("Points: %.2f", player.getPoints()));
                achivementLabel.setText(beginner.toString() + " | " + pro.toString() + " | " + master.toString());
            }
        });
        timer.start();
    }
}
