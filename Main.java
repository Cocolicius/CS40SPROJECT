
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//Noah,Denise,Collins
//Oct 21 2026
//Clicker Game

//Testing push
public class Main{

    public static void main(String[] args) {

        //testing the display shop
        Upgrade g1 = new Upgrade();
        Player player = new Player();

        //Jframe
        JFrame frame =  new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(1280,720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

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
        else if (source == upgradeBtn) g1.buyUpgrade(player);
        pointAmount.setText("Points: " + player.getPoints());
        costAmount.setText("Upgrade cost: " + g1.getCost());
    };
    clickBtn.addActionListener(listener);
    upgradeBtn.addActionListener(listener);
}
}
