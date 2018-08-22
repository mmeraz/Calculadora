package calculator;

import java.io.Serializable;

public class Calculator  implements Serializable{
	public double suma(double op1, double op2) {
		return op1+op2;
	}
	
	public double resta(double op1, double op2) {
		return op1-op2;
	}
	
	public double multiplicar(double op1, double op2) {
		return op1*op2;
	}
	
	public double dividir(double op1, double op2) {
		if(op1 / op2 == 0/op2 || op1 / op2 == op1 /0) {
			System.out.println("No se puede dividir entre cero");
		}
		return op1/op2;
	}
}
