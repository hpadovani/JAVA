package parcelas;
import java.util.Scanner;

public class Parcelas {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		double valor;
                System.out.println("Utilize virgula inves de ponto. Exemplo: 129,23");
		System.out.print("Digite o valor a ser parcelado:");
                valor = in.nextDouble();
                                
                
		for(byte i = 1; i <= 10; i++){
			if(i == 1){
				System.out.printf(i +" PARCELA(S) --> R$ "+"%.2f %n",(valor));
			}else if(i > 1 && i <= 5){
				System.out.printf(i +" PARCELA(S) --> R$ "+"%.2f %n",((valor * 0.05 + valor) / i));
			}else if(i > 5 && i <= 8){
				System.out.printf(i +" PARCELA(S) --> R$ "+"%.2f %n",((valor * 0.1 + valor) / i));
			}else if(i > 8 && i <= 10){
				System.out.printf(i +" PARCELA(S) --> R$ "+"%.2f %n",((valor * 0.15 + valor) / i));
			}
		}
	}
}
