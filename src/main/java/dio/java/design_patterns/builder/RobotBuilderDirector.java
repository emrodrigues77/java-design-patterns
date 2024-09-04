package dio.java.design_patterns.builder;

import dio.java.design_patterns.products.AdvancedRobot;
import dio.java.design_patterns.products.Robot;

public class RobotBuilderDirector {

    public Robot buildBasicRobot(RobotBuilder builder)
    {
        builder.reset();
        builder.setModel("Basic");
        builder.setArms(2);
        builder.setLegs(2);
        builder.setEyes(2);
        builder.setOperationalSystem("Debian Linux 23.4.0");
        return builder.getResult();
    }
    
    public AdvancedRobot buildAdvancedRobot(AdvancedRobotBuilder builder) 
    {
        builder.reset();
        builder.setModel("Advanced");
        builder.setArms(4);
        builder.setLegs(4);
        builder.setEyes(4);
        builder.setOperationalSystem("Windows 11");
        builder.setGpsSystem("Bold GPS");
        builder.setAiEngine("Open AI");
        return builder.getResult();
    }
}
