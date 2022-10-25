import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Selecione a continuacion que desea ver: "
							+"\n1.Numero mayor"
							+"\n2.Numero Menor"
							+"\n3.Raiz cuadrada"
							+"\n4.Elevar potencia");
		
		int x = sc.nextInt();
		
		System.out.println("Ingrese dos numeros:");
			int a = sc.nextInt();
			int b = sc.nextInt();
		System.out.println("Sus numero son: " + a +" y " + b);
		
		switch(x){
		
		case(1):	
			int p =NumMayor(a , b);	
			System.out.println("El numero mayor es: " + p);
					
			break;
			
		case(2):			
			int n = NumMin(a , b);	
			System.out.println("El numero menor es: " + n);
			break;
			
		case(3):
			
			int [] l =Raiz(a,b);
			System.out.println("las raices son: " + Arrays.toString(l));
			break;
		
		case(4):
			
			System.out.println("Ingrese el numero a elevar: ");
			int t = sc.nextInt();
			
			int [] k  = Elevar(a,t,b);
			System.out.println("Las potencias son: " + Arrays.toString(k));
			
			break;
			
		}		
	}	
	
	public static int NumMayor(int a, int b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
		
	}
	
	public static int NumMin(int a, int b){
		if(a > b) {
			return b;
		} else {
			return a;
		}
	}
	
	public static int[] Raiz(int a, int b) {
		
		int [] var = new int [2];
		
		var[0] = (int)Math.pow(a, 2);
		var[1] = (int)Math.pow(b,2);
		
		
		return var;				
	}
	
	public static int[] Elevar(int a, int t, int b) {
		int [] var2 = new int[2];
		
		var2[0] = (int)Math.pow(a, t);
		var2[1] =(int)Math.pow(b, t);
		
		return var2;
	}
	
}