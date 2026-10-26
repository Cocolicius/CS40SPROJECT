public class Achievement{
    private String achievement;
    private int reward;
    private int requirement;
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
         return unlocked = points>=requirement;

    }

/**Reward is adding extra points for certain
 * achievments
 * adds a specific amount if
 * unlocked is true
 */
    public int displayReward(){
        if(unlocked){
            return reward;
        }
        else{
            return 0;
        }
    }

/** Displays the title/achievement you get
 * after reaching a certain 
 * amount of clicks
 */

    public void showAchievement(){

    }

}