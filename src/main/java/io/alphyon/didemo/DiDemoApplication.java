package io.alphyon.didemo;

import io.alphyon.didemo.controllers.ConstructorInjectedController;
import io.alphyon.didemo.controllers.MyController;
import io.alphyon.didemo.controllers.PropertyInjectController;
import io.alphyon.didemo.controllers.GetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"io.alphyon.didemo.services","io.alphyon.didemo"})
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");
		controller.hello();
		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
