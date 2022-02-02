import java.util.Scanner;

public class ClassGrader {
	public static void main(String[]args) {
		
		int calificacion;
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese su calificacion: ");
		calificacion = entrada.nextInt();
		
	
		if(calificacion>=0&&calificacion<=3) {
			System.out.println("Failed");
		}
		
		else if(calificacion>3 && calificacion<=5) {
			System.out.println("Insufficient ");
		}
		else if(calificacion>5 && calificacion<=9) {
			System.out.println("Good  ");
		}
		else if(calificacion==10) {
			System.out.println("Excellent Grade  ");
		}
		
		else {
			System.out.println("Out of range");
		}
	
	}
}