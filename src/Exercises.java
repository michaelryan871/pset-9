import java.util.ArrayList;

public class Exercises {

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		}

		// write your code here

		if (a.get(0) == b.get(0)) {
			return true;
		} else if (a.get(a.size() - 1) == b.get(b.size() - 1 )){
			return true;
		} else {
			return false;	// default return value to ensure compilation
		}
	}

	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {

		ArrayList<String> empty = new ArrayList<String>();

		if (values == null || values.size() < n || n < 0) {
			return empty;
	}
		// write your code here

		ArrayList<String> result = new ArrayList<>();
		int length = values.size();
		int index = n;


		for (int i = 0; i < n; i++){
			result.add(values.get(i));
		}

		for (int j = n; j < 2 * n; j++){
			result.add(values.get(length-index));
			index--;
		}

		return result;

		// return null;	// default return value to ensure compilation
	}

	public int difference(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 1 ){
			return -1;
		}

		// write your code here

		int numMax = numbers.get(0);
		int numMin = numbers.get(0);

		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) > numMax) {
				numMax = numbers.get(i);
			}
			if (numbers.get(i) < numMin) {
				numMin = numbers.get(i);
			}
		}

		int differnce = numMax - numMin;
		return differnce;


		// return -1;		// default return value to ensure compilation
	}

	public double biggest(ArrayList<Double> numbers) {
		if (numbers == null || numbers.size() < 3 || numbers.size() % 2 == 0){
			return -1;
		}

		// write your code here

		double max = numbers.get(0);
		if (max <= numbers.get(numbers.size() - 1)){
				max = numbers.get(numbers.size() - 1);
		}
		if (max <= numbers.get(numbers.size() / 2)){
				max = numbers.get(numbers.size() / 2);
		}

		return max;


		// return -1;		// default return value to ensure compilation
	}

	public ArrayList<String> middle(ArrayList<String> values) {

		ArrayList<String> empty = new ArrayList<String>();

		if (values == null || values.size() < 3 || values.size() % 2 == 0){
			return empty;
		}
		// write your code here
		boolean containsNull = false;
		for (int i = 0; i < values.size(); i++){
			if (values.get(i) == null){
				containsNull = true;
			}
		}

		if (containsNull) {
			return empty;
		}

		int half = values.size() / 2;
		int first = half - 1;
		int last = half + 1;

		ArrayList<String> result = new ArrayList<String>();
		result.add(values.get(first));
		result.add(values.get(half));
		result.add(values.get(last));

		return result;

		// return null;	// default return value to ensure compilation
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 3) {
			return false;
		}

		// write your code here

		int lowestNumber = numbers.get(0);
		int middleNumber = numbers.get(1);
		int finalNumber = numbers.get(2);

		for (int i = 1; i < numbers.size() - 1; i++) {
			if ( lowestNumber < middleNumber && middleNumber < finalNumber) {
				return true;
			}


			if (i + 2 < numbers.size()) {
				lowestNumber = numbers.get(i);
				middleNumber = numbers.get(i + 1);
				finalNumber = numbers.get(i + 2);
			} else {
				return false;
			}
		}
	return false;	// default return value to ensure compilation
}

	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		if (numbers == null || numbers.size() < 1){
			return false;
		}

		// write your code here
		boolean isEverywhere = true;

		for (int i = 0; i < numbers.size(); i++) {
			if (i == 0) {
				if (numbers.get(i) != x && numbers.get(i + 1) != x) {
						isEverywhere = false;
					}
				} else if (i == numbers.size() - 1) {
					if (numbers.get(i) != x && numbers.get(i - 1) != x) {
						isEverywhere = false;
					}
				} else {
					if (numbers.get(i - 1) != x && numbers.get(i) != x && numbers.get(i + 1) != x){
							isEverywhere = false;
				}
			}
		}

		return isEverywhere;

		// return false;	// default return value to ensure compilation
	}

	public boolean consecutive(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 3){
			return false;
		}

		// write your code here

		boolean isConsecutive = false;
		for (int i = 2; i < numbers.size(); i++){
			if (numbers.get(i) % 2 == numbers.get(i - 1) % 2 &&	numbers.get(i) % 2 == numbers.get(i - 2) % 2){
						isConsecutive = true;
			}
		}

		return isConsecutive;

		// return false;	// default return value to ensure compilation
	}

	public boolean balance(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 2){
			return false;
		}

		// write your code here

		for (int i = 0; i < numbers.size(); i++) {
			int numOne = 0;
			int numTwo = 0;

			for (int x = 0; x < i; x++){
				numOne = numOne + numbers.get(x);
			}
			for (int z = i; z < numbers.size(); z++) {
				numTwo = numTwo + numbers.get(z);
			}
			if (numOne == numTwo){
				return true;
			}
		}
		return false;	// default return value to ensure compilation
	}

	public int clumps(ArrayList<String> values) {
		if (values == null) {
			return -1;
		}

		boolean containsNull = false;
		for (int i = 0; i < values.size(); i++){
			if (values.get(i) == null){
				containsNull = true;
			}
		}

		if (containsNull) {
			return -1;
		}

			int clumpAmount = 0;
			boolean isClump = false;

			for (int i = 1; i < values.size(); i++) {
				if (values.get(i).equals(values.get(i - 1))){
					if (!isClump) {
						clumpAmount ++;
					}
					isClump = true;
				} else {
					isClump = false;
				}
			}

			return clumpAmount;


		// write your code here

		// return -1;		// default return value to ensure compilation
	}
}
