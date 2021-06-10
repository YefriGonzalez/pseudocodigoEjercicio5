import java.util.*;
public class Ejercicio5{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int hombresMenores=0;
		int mujeresMayores=0;
		int numero;
		String sexo;
		int edad;
		System.out.print("Ingrese el numero de personas que desea registrar: ");
		numero=scanner.nextInt();
		for(int i=0;i<numero;i++){
			System.out.print("Ingrese la edad: ");
			edad=scanner.nextInt();
			System.out.print("Ingrese el sexo, Masculino=M, Femenino=F.   ");
			sexo=scanner.next();
			if(sexo.equals("m") | sexo.equals("M")){
				if (edad<18) {
					hombresMenores=hombresMenores+1;
				}
			} else if (sexo.equals("F") | sexo.equals("f")){
				if (edad>=18) {
					mujeresMayores=mujeresMayores+1;
				}
			} else {
				System.out.println("El dato ingresado es incorrecto");
			}
		}
		System.out.println("Cantidad de Mujeres Mayores: "+mujeresMayores);
		System.out.println("Cantidad de Hombres Menores: "+hombresMenores);
	}
}