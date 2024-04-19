package pl.pjatk.robmic;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("false")
public class MySecondProfileClass {
    public MySecondProfileClass(){
        System.out.println("Hello from MyFasleProfileClass");
    }
}
