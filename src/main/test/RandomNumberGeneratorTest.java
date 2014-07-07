package poc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-test-context.xml"})
public class RandomNumberGeneratorTest {
	@Autowired
	ApplicationContext context;
	
	RandomNumberGenerator rng;
	
	@Before
	public void setupTest() {
		rng = (RandomNumberGenerator) context.getBean("randomNumberGenerator");
	}
	
	@Test
	public void randomNumberGenerator2D10Test() {
		RandomNumberConfigurer config = new RandomNumberConfigurer("2D10");
		int result = rng.roll(config);
		Assert.assertTrue(result > 1);
		Assert.assertTrue(result < 21);
	}
	
	@Test
	public void randomNumberGenerator3D6Test() {
		RandomNumberConfigurer config = new RandomNumberConfigurer("3D6");
		int result = rng.roll(config);
		Assert.assertTrue(result > 2);
		Assert.assertTrue(result < 19);
	}
	
	@Test
	public void randomNumberGenerator1D4Test() {
		RandomNumberConfigurer config = new RandomNumberConfigurer("1D4");
		int result = rng.roll(config);
		Assert.assertTrue(result > 0);
		Assert.assertTrue(result < 5);
	}
	
	@Test
	public void randomNumberGeneratorInvalidTest() {
		RandomNumberConfigurer config = new RandomNumberConfigurer("210");
		int result = rng.roll(config);
		Assert.assertEquals(0, result);
	}
}
