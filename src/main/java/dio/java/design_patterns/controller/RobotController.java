package dio.java.design_patterns.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dio.java.design_patterns.products.Robot;
import dio.java.design_patterns.service.RobotService;

@RestController
@RequestMapping(path = "/robots")
@AllArgsConstructor
public class RobotController {

    private RobotService robotService;

    @GetMapping(path = "/build/{robotType}")
    public ResponseEntity<Robot> getRobot(@PathVariable("robotType") String robotType) {
        return ResponseEntity.ok(robotService.build(robotType));
    }
}
