
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

        //testing the display shop
        Upgrade g1 = new Upgrade();
        Player player = new Player();
        player.click();

        //testing objects for achievement
        //Achievement first = new Achievement("Starter", 1, 2);
        //first.addReward();

        //Jframe
        JFrame frame =  new JFrame();
        frame.setLayout(new FlowLayout());

        JButton clickBtn=  new JButton("Click");
        frame.add(clickBtn);

        JButton upgradeBtn=  new JButton("Upgrade");
        frame.add(upgradeBtn);

        JLabel pointAmount = new JLabel("point");
        frame.add(pointAmount);

        JLabel costAmount = new JLabel("");
        frame.add(costAmount);

        frame.setSize(1280,720);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int points = 0;

        while(true){
            //Click function with points increasing
            clickBtn.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent event){
                    player.click();
                    pointAmount.setText("Points: " + player.getPoints());
                    System.out.println(player.getPoints());
                }
            });
            
            upgradeBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    g1.buyUpgrade(player);
                    costAmount.setText("Upgrade cost: " + g1.getCost());
                    System.out.println("UPgrade");
                }
            });
            break;

        }
    }
}
