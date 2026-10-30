
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//Noah,Denise,Collins
//Oct 21 2026
//Clicker Game

//Testing push
public class Main{

    public static void main(String[] args) {

        //Creating the Objects
        Upgrade g1 = new Upgrade();
        Player player = new Player();

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
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    
        //Click function with points increasing
        ActionListener listener = e ->{
            Object source = e.getSource();
            if (source == clickBtn){
                player.click();
                System.out.println(player.getPoints());
            }
            else if (source == upgradeBtn){
                 g1.buyUpgrade(player);
            pointAmount.setText("Points: " + player.getPoints());
            costAmount.setText("Upgrade cost: " + g1.getCost());
            }
        };
        clickBtn.addActionListener(listener);
        upgradeBtn.addActionListener(listener);
    }
}
