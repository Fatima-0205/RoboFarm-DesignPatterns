public class SpeedPriorityStrategy implements TaskExecutionStrategy {
   
    public void executeTask(String fieldSection) {
        System.out.println("Executing task in " + fieldSection + " quickly but using high energy.");
    }
}