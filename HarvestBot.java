public class HarvestBot implements FarmingRobot{
    private TaskExecutionStrategy strategy;

    public void performTask(String fieldSection) throws FieldSectionEmptyException, StrategyNotSetException {
        
        if (fieldSection == null) {
            throw new FieldSectionEmptyException("Field section cannot be empty!");
        }
        if (strategy == null) {
            throw new StrategyNotSetException("No strategy set for HarvestBot!");
        }
        
            strategy.executeTask(fieldSection);
            System.out.println("Harvesting crops in " + fieldSection);
        
    }
    public void setStrategy(TaskExecutionStrategy strategy){
        this.strategy=strategy;
    }
}