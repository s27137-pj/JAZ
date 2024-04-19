package pl.pjatk.robmic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RobmicApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(RobmicApplication.class, args);

		MyThirdComponent thirdComponent = context.getBean(MyThirdComponent.class);



	}

}
