package poc;

import java.util.Random;

public class RandomNumberGenerator {
	public static int roll(RandomNumberConfigurer config) {
		int total = 0;
		Random randomGenerator = new Random();
		for (int i = 0; i < config.getNumberOfRolls(); i++) {
			int result = randomGenerator.nextInt(config.getTypeOfDice()) + 1;
			total += result;
		}
		return total;
	}
}
