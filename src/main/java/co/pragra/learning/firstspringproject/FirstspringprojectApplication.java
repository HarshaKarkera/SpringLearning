package co.pragra.learning.firstspringproject;

import co.pragra.learning.firstspringproject.business.Account;
import co.pragra.learning.firstspringproject.business.PaymentCalculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class FirstspringprojectApplication {

	public static void main(String[] args)
	{
		//SpringApplication.run(FirstspringprojectApplication.class, args);
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		PaymentCalculator calculator = context.getBean("calculator", PaymentCalculator.class);
//		double payment = calculator.calculatePayment();
//		System.out.println(payment);
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Account account = context.getBean("account", Account.class);
		System.out.println(account);


	}

}
