public class EnergyEfficientStrategy implements TaskExecutionStrategy {
    
    public void executeTask(String fieldSection) {
        System.out.println("Executing task in " + fieldSection + " slowly to save power.");
    }
}

