package pl.pjatk.robmic;

import org.springframework.stereotype.Component;
@Component
public class MySecondComponent {


    public MySecondComponent(MyFirstComponent myFirstComponent) {
        System.out.println("Hello from MySecondComponent");
        myFirstComponent.printHelloMessage();
    }

    public void secondComponentNewMethod(){
        System.out.println("Hello from MySecondComponent and from secondComponentNewMethod");
    }
}
