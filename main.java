//Noah,Denise,Collins
//Oct 21 2026
//Clicker Game

//Testing push
public class main {

    public static void main(String[] args) {

        //testing the display shop
        Upgrade g1 = new Upgrade();
        g1.displayShop();
        Player player = new Player();
        player.click();

        //testing objects for achievement
        //Achievement first = new Achievement("Starter", 1, 2);
        //first.addReward();
        JFrame frame =  new JFrame();
        JButton clickBtn=  new JButton("Click");
        int points = 0;

        while(true){
            clickBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    points+=1;
                    System.out.println(points);
                }
            })
        }
    }
}
