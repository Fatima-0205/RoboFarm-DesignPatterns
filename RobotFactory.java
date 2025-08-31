public class RobotFactory{

    public static FarmingRobot createRobot(String type) throws InvalidRobotTypeException{

        if(type.equals("planter")){
            return new PlanterBot();
        }
        else if(type.equals("water")){
            return new WaterBot();
        }
        else if(type.equals("harvest")){
            return new HarvestBot();
        }
       else {
            throw new InvalidRobotTypeException("Unknown robot type: " +type);
        }
    }
}