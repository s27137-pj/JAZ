package pl.pjatk.robmic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MyConfigurationClass {

    @Bean
    public POJOclass pojOclass(){
        return new POJOclass("as", "sd", "ws");
    }

    @Bean
    public List<String> defaultData(){
        return List.of("x1", "x2", "x3", "x4", "x5");
    }


}
