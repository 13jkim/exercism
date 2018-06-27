
class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		int sum = 0;
		String numAsString = Integer.toString(numberToCheck);

		for (int i = 0; i < numAsString.length(); i++) {
			sum += (int) Math.pow(
					Character.getNumericValue(numAsString.charAt(i)),
					numAsString.length());
		}
		return numberToCheck == sum;
	}

}
