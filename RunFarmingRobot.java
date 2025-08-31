import java.util.*;
public class RunFarmingRobot{
    private static Scanner scan=new Scanner(System.in);
    public static void main(String[]args){

        

    try{
        FarmingRobot robot = createRobot();

        selectStrategy(robot);

        String fieldSection = getFieldSection();

        robot.performTask(fieldSection);

    }
    
    catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    finally {
        scan.close();
        System.out.println("Program finished.");
    }
    }
    
    private static FarmingRobot createRobot() throws InvalidRobotTypeException {
        System.out.println("Enter the type of robot to be created: ");
        String type = scan.next();
        if (type == null ) {
            throw new NullPointerException("Robot type cannot be null or empty");
        }
        return RobotFactory.createRobot(type);
    }

    private static void selectStrategy(FarmingRobot robot) {
        System.out.println("Select the task execution strategy: ");
        System.out.println("1. Energy Efficient");
        System.out.println("2. Speed Priority");
        System.out.println("3. Balanced");

        if (!scan.hasNextInt()) {
            throw new IllegalArgumentException("Enter a number between 1-3");
        }

        int choice = scan.nextInt();
        if(choice==1){
            robot.setStrategy(new EnergyEfficientStrategy());
        }
        else if(choice==2){
            robot.setStrategy(new SpeedPriorityStrategy());
        }
        else if(choice==3){
            robot.setStrategy(new BalancedStrategy());
        } 
        else{
             throw new IllegalArgumentException("Invalid strategy selected!");
        }
    }
    private static String getFieldSection() {
        scan.nextLine();
        System.out.println("Enter the field section name(field A, field B): ");
        String fieldSection=scan.nextLine();
        return fieldSection;
    }
    
    
}