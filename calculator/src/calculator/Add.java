package calculator;

public class Add implements Operation{

	public int operation(int arg1, int arg2) {
		int sub = arg1 - arg2;
		return sub;
	}

	public String getSign() {
		return "+";
	}

}
