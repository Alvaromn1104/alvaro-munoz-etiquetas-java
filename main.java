
import java.util.Random;
public class main{
		public static void main(String[] args){
		Random random = new Random();
		if (args.length == 1){
				int numeroCaras = Integer.parseInt(args[0]);
				if(numeroCaras <= 0){
					System.out.println("El numero de caras debe ser mayor que 0");
				}else{
				
					int resultado = random.nextInt(numeroCaras) + 1;
					System.out.println("Numero de caras: "+numeroCaras+", resultado: "+resultado);
				}

		}else if(args.length == 2){
			int caras =Integer.parseInt(args[0]);
			int numDados = Integer.parseInt(args[1]);

			int total = 0;
			System.out.println("Has lanzado " +numDados+" dados de "+caras+" caras");
			for (int i=0; i<numDados; i++){
				int resultado = random.nextInt(caras) +1;
				total += resultado;
}
			System.out.println("Total: "+total);
}
		else{
			System.out.println("Numero de argumentos no valido");
		}
}
}
