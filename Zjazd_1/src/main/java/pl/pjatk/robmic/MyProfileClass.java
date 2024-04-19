package pl.pjatk.robmic;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("true")
public class MyProfileClass {
    public MyProfileClass(){
        System.out.println("Hello from my TrueProfileClass");
    }
}
