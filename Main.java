
import java.awt.FlowLayout;
<<<<<<< HEAD
import java.awt.event.*;
=======
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
>>>>>>> 97ab76319895210b3f79e48201201f4e8480996b
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//Noah,Denise,Collins
//Oct 21 2026
//Clicker Game

//Testing push
<<<<<<< HEAD
public class Main{
=======
public class Main {
>>>>>>> 97ab76319895210b3f79e48201201f4e8480996b

    public static void main(String[] args) {

        //Creating the Objects
        Upgrade g1 = new Upgrade();
        Player player = new Player();

        //Jframe
        JFrame frame =  new JFrame();
        frame.setLayout(new FlowLayout());
<<<<<<< HEAD
=======

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

>>>>>>> 97ab76319895210b3f79e48201201f4e8480996b
        frame.setSize(1280,720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

<<<<<<< HEAD
        JButton clickBtn = new JButton("Click");
        frame.add(clickBtn);
        JButton upgradeBtn = new JButton("Upgrade");
        frame.add(upgradeBtn);
    
        JLabel pointAmount = new JLabel("Points: " + player.getPoints());
        frame.add(pointAmount);
        JLabel costAmount = new JLabel("Upgrade cost: " + g1.getCost());
        frame.add(costAmount);
    
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

    };
    clickBtn.addActionListener(listener);
    upgradeBtn.addActionListener(listener);
=======

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
>>>>>>> 97ab76319895210b3f79e48201201f4e8480996b
}
}
