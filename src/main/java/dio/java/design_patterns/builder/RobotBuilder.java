package dio.java.design_patterns.builder;

import dio.java.design_patterns.products.Robot;

public class RobotBuilder implements IRobotBuilder {

    private Robot robot;

    public void reset() {
        this.robot = new Robot();
    }

    public void setArms(int arms) {
        this.robot.setArms(arms);
    }

    public void setLegs(int legs) {
        this.robot.setLegs(legs);
    }

    public void setEyes(int eyes) {
        this.robot.setEyes(eyes);
    }

    public void setModel(String model) {
        this.robot.setModel(model);
    }

    public void setOperationalSystem(String operationalSystem) {
        this.robot.setOperationalSystem(operationalSystem);
    }

    public Robot getResult() {
        return this.robot;
    }
}
