import java.util.ArrayList;

public class Exercises {

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		}

		// write your code here

		return false;	// default return value to ensure compilation
	}

	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {
		if (values == null || values.size < n || n < 0) {
			return empty;
	}
		// write your code here

		return null;	// default return value to ensure compilation
	}

	public int difference(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 1 ){
			return -1;
		}
		// write your code here

		return -1;		// default return value to ensure compilation
	}

	public double biggest(ArrayList<Double> numbers) {
		if (numbers == null || numbers.size() < 3 || numbers.size() % 2 == 0){
			return -1;
		}
		// write your code here

		return -1;		// default return value to ensure compilation
	}

	public ArrayList<String> middle(ArrayList<String> values) {
		if (values == null || values.size() < 3 || values.size() % 2 == 0){
			return empty;
		}
		// write your code here

		return null;	// default return value to ensure compilation
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 3) {
			return false;
		}
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		if (numbers == null || numbers.size() < 1){
			return false;
		}
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean consecutive(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 3){
			return false;
		}
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean balance(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 2){
			return false;
		}
		// write your code here

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
		
		// write your code here

		return -1;		// default return value to ensure compilation
	}
}
