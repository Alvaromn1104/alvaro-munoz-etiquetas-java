
import java.util.Random;
public class main{
		public static void main(String[] args){
		if (args.length ==1){
			try{
				int numeroCaras = Integer.parseInt(args[0]);
				if(numeroCaras <= 0){
					System.out.println("El numero de caras debe ser mayor que 0");
				}else{
					Random random = new Random();
					int resultado = random.nextInt(numeroCaras) + 1;
					System.out.println("Numero de caras: "+numeroCaras+", resultado: "+resultado);
				}
			}catch(NumberFormatException e){
			System.out.println("Error: "+e);
			}
			

		}else {
			System.out.println("Ingrese el numero de caras");
			}
		}
}
