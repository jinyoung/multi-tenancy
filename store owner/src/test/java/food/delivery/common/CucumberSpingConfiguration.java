package food.delivery.common;

import food.delivery.StoreOwnerApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { StoreOwnerApplication.class })
public class CucumberSpingConfiguration {}
