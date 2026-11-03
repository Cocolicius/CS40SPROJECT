
public class Achievement{
    private String achievement;
    private int reward;
    private final int requirements;
    private boolean unlocked;
    private boolean rewardClaimed;

    public Achievement(String title, int required, int pointsAdded){
        achievement = title;
        requirements = required;
        reward = pointsAdded;
        unlocked = false;
        rewardClaimed = false;
    }

/**achievement initially locked and unlocks
 * achievement if clicks meet
 * the requirement
 */
    public void checkAchievement(int points){
         if(!unlocked){unlocked = points>=requirements;}
    }

/**Reward is adding extra points for certain
 * achievements
 * adds a specific amount if
 * unlocked is true
 */
    public int claimReward(){
        if(unlocked && !rewardClaimed){
            rewardClaimed = true;
            return reward;
        }
        else{return 0;}
    }
    @Override
    public String toString(){
        if(unlocked && rewardClaimed){
            return achievement + " unlocked " + reward + " points added";
        }
        else{return achievement + " locked";}
        
    }
/** Displays the title/achievement you get
 * after reaching a certain 
 * amount of clicks
 */
    // public void showAchievement(){
    


    // }

}