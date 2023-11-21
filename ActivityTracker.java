public class ActivityTracker {
    private int goalActivity;
    private int totalMinutes;
    private int numSessions;
    private int longestSession;

    public ActivityTracker(int target) {
        goalActivity = target;
        totalMinutes = 0;
        numSessions = 0;
        longestSession = 0;
    }

    public int getSessions() {
        return numSessions;
    }
    public int getTotalMinutes() {
        return totalMinutes;
    } 
    public int getMaxMinutes() {
        return longestSession;
    }
    public boolean goalAchieved() {
        return totalMinutes >= goalActivity;
    }
    
    public void logMinutes(int add) {
        totalMinutes += add;
        numSessions++;
        if (add > longestSession) {
            longestSession = add;
        }
    }
}