
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

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
        JButton clickBtn=  new JButton("Click");
        frame.add(clickBtn);

        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int points = 0;

        while(true){
            //Click function with points increasing
            clickBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    player.click();
                    g1.buyUpgrade(player);
                    System.out.println(player.getPoints());
                }
            });
            break;

        }
    }
}
