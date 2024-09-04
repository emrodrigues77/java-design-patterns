package dio.java.design_patterns.builder;

public interface IRobotBuilder {
    void setModel(String model);

    void setArms(int $arms);

    void setLegs(int $legs);

    void setEyes(int $eyes);

    void setOperationalSystem(String $operationalSystem);
}
