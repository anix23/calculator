package calculator;

public class Substraction implements Operation{

	public int operation(int arg1, int arg2) {
		int result = arg1 - arg2;
		return result;
	}

	public String getSign() {
		return "-";
	}

}
