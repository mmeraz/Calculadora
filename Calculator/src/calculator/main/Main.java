package calculator.main;

import calculator.Calculator;;

public class Main {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
//		1st step
		String firstArg = args[0];
		String secondArg = args[1];
		String threeArg = args[2];
		Double op1 = 0.0 ;
		Double op2  = 0.0;
		
		try {
			op1 =Double.parseDouble(firstArg);
			op2 = Double.parseDouble(secondArg);
			
		}catch(NumberFormatException ne) {
			System.out.println("No se ha podido convertir la entra de texto en numero");
			System.out.println("Mensaje de error: " + ne.getMessage());
			System.exit(100);
		}finally {
			
		}

//		declare for result
		Double result;
		
		switch (threeArg) {
		case "+":
			result = cal.suma(op1, op2);
			break;
		case "-":
		result = cal.resta(op1, op2);
		break;
		case"*":
			result = cal.multiplicar(op1, op2);
			break;
		case"/":
		result = cal.dividir(op1, op2);
		break;
		default:
			result = (double) -1;
			break;
		}
System.out.println("El resultado de la operación es: " +result);
		
	}

}
