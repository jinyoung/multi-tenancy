package food.delivery.common;

import food.delivery.HungerApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { HungerApplication.class })
public class CucumberSpingConfiguration {}
