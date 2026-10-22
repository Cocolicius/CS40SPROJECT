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

}