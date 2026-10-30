
public class Achievement{
    private String achievement;
    private int reward;
    private final int requirement;
    private boolean unlocked;

    public Achievement(String a, int required, int r){
        achievement = a;
        requirement = required;
        reward = r;
        unlocked = false;
    }

/**achievement initially locked and unlocks
 * achievement if clicks meet
 * the requirement
 */
    public boolean unlockAchievement(int points){
         if(!unlocked){
            return unlocked = points>=requirement;
         }
        return false;
    }

/**Reward is adding extra points for certain
 * achievements
 * adds a specific amount if
 * unlocked is true
 */
    public int addReward(){
        if(unlocked){
            return reward;
        }
        else{
            return 0;
        }
    }
    @Override
    public String toString(){
        return "Title: "+ achievement + "unlocked." + reward + " points added";
    }
/** Displays the title/achievement you get
 * after reaching a certain 
 * amount of clicks
 */
    // public void showAchievement(){
    


    // }

}