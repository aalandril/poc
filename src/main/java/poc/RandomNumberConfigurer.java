package poc;

public class RandomNumberConfigurer {
	private int numberOfRolls;
	private int typeOfDice;
	public RandomNumberConfigurer(String pattern) {
		if (!pattern.contains("D")) {
			//Invalid
		} else {
			String[] patternComponents = pattern.split("D");
			numberOfRolls = Integer.parseInt(patternComponents[0]);
			typeOfDice = Integer.parseInt(patternComponents[1]);
		}
	}
	public int getNumberOfRolls() {
		return numberOfRolls;
	}
	public int getTypeOfDice() {
		return typeOfDice;
	}
	@Override
	public String toString() {
		return "RandomNumberConfigurer [numberOfRolls=" + numberOfRolls
				+ ", typeOfDice=" + typeOfDice + "]";
	}
}
