package examples.config;

import examples.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    //created beans
    @Bean
    Vehicle vehicle(){

        //var keyword introduced in java 10 & this s type inference(means instead of writing Vehicle name leftside for creating obj use var)
        //just to reduce the burden of the dev
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    @Bean
    String hello(){
        return "Hello Wolrd";
    }
    @Bean
    Integer number(){
        return 16;
    }
}
