public interface FarmingRobot{

    public void performTask(String fieldSection) throws FieldSectionEmptyException, StrategyNotSetException;;

    public void setStrategy(TaskExecutionStrategy strategy);
}