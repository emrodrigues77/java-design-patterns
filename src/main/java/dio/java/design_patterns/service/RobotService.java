package dio.java.design_patterns.service;

import org.springframework.stereotype.Service;
import dio.java.design_patterns.products.Robot;

@Service
public interface RobotService {
    Robot build(String robotType);
}
