import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your goal in minutes: ");
        int goal = scan.nextInt();
        scan.nextLine();

        // create an ActivityTracker object
        ActivityTracker Tracker1 = new ActivityTracker(goal);
        System.out.println("Enter the number of minutes for your activity session: ");
        int mins = scan.nextInt();
        scan.nextLine();
        Tracker1.logMinutes(mins);
        System.out.println("----Current Stats----");
        System.out.println("Number of sessions: " + Tracker1.getSessions());
        System.out.println("Total number of minutes logged: " + Tracker1.getTotalMinutes());
        System.out.println("Longest session logged: " + Tracker1.getMaxMinutes());
        System.out.println("Goal reached: " + Tracker1.goalAchieved());
        System.out.println("---------------------");

        // loop until the user has logged enough minutes to reach their goal,
        // allowing them to enter a new activity each time and printing out
        // the stats after each
       while (!Tracker1.goalAchieved()) {
            System.out.println("Enter the number of minutes for your activity session: ");
            mins = scan.nextInt();
            scan.nextLine();
            Tracker1.logMinutes(mins);
            System.out.println("----Current Stats----");
            System.out.println("Number of sessions: " + Tracker1.getSessions());
            System.out.println("Total number of minutes logged: " + Tracker1.getTotalMinutes());
            System.out.println("Longest session logged: " + Tracker1.getMaxMinutes());
            System.out.println("Goal reached: " + Tracker1.goalAchieved());
            System.out.println("---------------------");
       } 
       System.out.println("Thank You for using the activity tracker!");
    }
}
