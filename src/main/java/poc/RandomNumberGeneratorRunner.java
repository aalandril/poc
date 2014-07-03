package poc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomNumberGeneratorRunner {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		RandomNumberGenerator generator = (RandomNumberGenerator) context.getBean("randomNumberGenerator");
		RandomNumberConfigurer config = new RandomNumberConfigurer("2D6");
		System.out.println(generator.roll(config));

	}

}
