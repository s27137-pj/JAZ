package pl.pjatk.robmic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyFirstComponent {

    public MyFirstComponent(@Value("${my.custom.property}") String valueFromProperties) {
        System.out.println(valueFromProperties);
        System.out.println("Hello from MyFirstComponent");
    }

    public void printHelloMessage(){
        System.out.println("Hello from MyFisrtComponent from method printHelloMessage");
    }

    public void firstComponentNewMethod(){
        System.out.println("Hello from MyFirstComponent and from firstComponentNewMethod");
    }


}
