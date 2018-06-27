import java.util.ArrayList;
import java.util.List;

class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		String numAsString = Integer.toString(numberToCheck);
		int sum = 0;
		for (int i = 0; i < numAsString.length(); i++) {
			sum += (int) Math.pow(
					Character.getNumericValue(numAsString.charAt(i)),
					numAsString.length());
		}
//		int temp = numberToCheck;
//		List<Integer> digits = new ArrayList<>();
//		while (temp != 0) {
//			digits.add(temp % 10);
//			temp /= 10;
//		}
//		for (Integer value : digits) {
//			sum += (int) Math.pow(value, digits.size());
//		}
		return numberToCheck == sum;
	}

}
