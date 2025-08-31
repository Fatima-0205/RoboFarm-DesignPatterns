public class BalancedStrategy implements TaskExecutionStrategy {
  
    public void executeTask(String fieldSection) {
        System.out.println("Executing task in " + fieldSection + " with balanced speed and power usage.");
    }
}