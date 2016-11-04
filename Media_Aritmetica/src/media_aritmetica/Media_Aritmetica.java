package media_aritmetica;

import java.util.Scanner;

/**
 *
 * @author henrique.lima
 */
public class Media_Aritmetica {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int nota[] = new int[3];
            double media, soma = 0;

            for (int i = 0; i < nota.length; i++) {
                nota[i] = in.nextInt();
                if (nota[i] < 5) {
                    nota[i] = 0;
                }
                soma = soma + nota[i];
            }

            media = soma / 3;

            if (media > 8) {
                System.out.println("CONCEITO A");
            }

            if (media >= 7 && media < 8) {
                System.out.println("CONCEITO B");
            }

            if (media >= 5 && media < 7) {
                System.out.println("CONCEITO C");
            }
            if (media < 5) {
                System.out.println("REPROVADO");
            }

            System.out.print("A média do aluno foi de: " + media);
            System.out.println();
        }
}
    
