
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//Noah,Denise,Collins
//Oct 21 2026
//Clicker Game

//Testing push
public class main {

    public static void main(String[] args) {

        //Creating the Objects
        Upgrade g1 = new Upgrade();
        Player player = new Player();

        //testing objects for achievement
        //Achievement first = new Achievement("Starter", 1, 2);
        //first.addReward();

        //Jframe
        JFrame frame =  new JFrame();
        frame.setLayout(new FlowLayout());

        //Click button
        JButton clickBtn=  new JButton("Click");
        frame.add(clickBtn);

        //Upgrade button
        JButton upgradeBtn=  new JButton("Upgrade");
        frame.add(upgradeBtn);

        //How many points the player has
        JLabel pointAmount = new JLabel("point");
        frame.add(pointAmount);

        //Cost of Upgrade
        JLabel costAmount = new JLabel("");
        frame.add(costAmount);

        //Multiplier
        JLabel multiplier = new JLabel("");
        frame.add(multiplier);

        frame.setSize(1280,720);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int points = 0;


        pointAmount.setText("Points: " + (long) player.getPoints());
        costAmount.setText("Upgrade cost: " + (long) g1.getCost());
        multiplier.setText("Points Per Click: "+ player.getClickBonus());

        while(true){
            //Click function with points increasing
            clickBtn.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent event){
                    // costAmount.setText("Upgrade cost: " + (long) g1.getCost());
                    // pointAmount.setText("Points: " + (long) player.getPoints());
                    // multiplier.setText("Points Per Click: "+ (long) player.getClickBonus());
                    player.click();
                    pointAmount.setText("Points: " + (long) player.getPoints());
                    costAmount.setText("Upgrade cost: " + (long) g1.getCost());
                    multiplier.setText("Points Per Click: "+ (long) player.getClickBonus());
                    System.out.println(player.getPoints());
                }
            });
            
            upgradeBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    // costAmount.setText("Upgrade cost: " + (long) g1.getCost());
                    // pointAmount.setText("Points: " + (long) player.getPoints());
                    // multiplier.setText("Points Per Click: "+ (long) player.getClickBonus());
                    g1.buyUpgrade(player);
                    player.spend(g1.getCost());
                    pointAmount.setText("Points: " + (long) player.getPoints());
                    costAmount.setText("Upgrade cost: " + (long) g1.getCost());
                    multiplier.setText("Points Per Click: "+ (long) player.getClickBonus());
                    System.out.println("UPgrade");
                }
            });
            break;

        }
    }
}
