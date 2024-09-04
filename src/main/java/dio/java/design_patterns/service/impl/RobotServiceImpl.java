package dio.java.design_patterns.service.impl;

import dio.java.design_patterns.builder.AdvancedRobotBuilder;
import dio.java.design_patterns.builder.RobotBuilder;
import dio.java.design_patterns.builder.RobotBuilderDirector;
import org.springframework.stereotype.Service;
import dio.java.design_patterns.products.AdvancedRobot;
import dio.java.design_patterns.products.Robot;
import dio.java.design_patterns.service.RobotService;

@Service
public class RobotServiceImpl implements RobotService {
    public Robot build(String robotType) {
        if (robotType.equalsIgnoreCase("adv")) {
            return buildAdvancedRobot();
        }
        return buildRobot();
    }

    private Robot buildRobot() {
        RobotBuilderDirector director = new RobotBuilderDirector();
        RobotBuilder builder = new RobotBuilder();
        return director.buildBasicRobot(builder);
    }

    private AdvancedRobot buildAdvancedRobot() {
        RobotBuilderDirector director = new RobotBuilderDirector();
        AdvancedRobotBuilder builder = new AdvancedRobotBuilder();
        return director.buildAdvancedRobot(builder);
    }
}
