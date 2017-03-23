package calculator;

import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Operation[] ops = new Operation[5];
		ops[1] = new Add();
		ops[2] = new Substraction();
		ops[3] = new Multiply();
		ops[4] = new Division();
		ops[5] = new Modulo();
		while (sc.hasNext()) {
			Operation op = search(ops, sc.next());
			try{
				System.out.println(op.operation(sc.nextInt(), sc.nextInt()));
			}
			catch(Exception e){
				System.out.println("Koniec");
				break;
			}
			
		}
		sc.close();
	}

	private static Operation search(Operation[] ops, String input) {
		for (Operation op: ops){
			if(op.getSign().equals(input)){
				return op;
			}
		}
		return null;

	}
} 