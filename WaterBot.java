public class WaterBot implements FarmingRobot{
    private TaskExecutionStrategy strategy;

    public void performTask(String fieldSection) throws FieldSectionEmptyException, StrategyNotSetException {
        
        if (fieldSection == null) {
            throw new FieldSectionEmptyException("Field section cannot be empty!");
        }
        if (strategy == null) {
            throw new StrategyNotSetException("No strategy set for WaterBot!");
        }
        
        strategy.executeTask(fieldSection); 
        System.out.println("Watering crops in " + fieldSection);
        
    }
    public void setStrategy(TaskExecutionStrategy strategy){
        this.strategy=strategy;
    }
}