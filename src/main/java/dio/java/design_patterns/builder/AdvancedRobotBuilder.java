package dio.java.design_patterns.builder;

import dio.java.design_patterns.products.AdvancedRobot;

public class AdvancedRobotBuilder implements IRobotBuilder {

    private AdvancedRobot robot;

    public void reset()
    {
        this.robot = new AdvancedRobot();
    }

    public void setGpsSystem(String gpsSystem)
    {
        this.robot.setGpsSystem(gpsSystem);
    }

    public void setAiEngine(String aiEngine)
    {
        this.robot.setAiEngine(aiEngine);
    }

    public AdvancedRobot getResult()
    {
        return this.robot;
    }

    @Override
    public void setModel(String model) {
        this.robot.setModel(model);
    }

    @Override
    public void setArms(int $arms) {
        this.robot.setArms($arms);
    }

    @Override
    public void setLegs(int $legs) {
        this.robot.setLegs($legs);
    }

    @Override
    public void setEyes(int $eyes) {
        this.robot.setEyes($eyes);
    }

    @Override
    public void setOperationalSystem(String $operationalSystem) {
        this.robot.setOperationalSystem($operationalSystem);
    }
}
