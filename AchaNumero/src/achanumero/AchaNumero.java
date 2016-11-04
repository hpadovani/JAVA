package achanumero;

import java.util.Scanner;

public class AchaNumero {

    public static void main(String[] args) {
        byte[] numeros = {1, 7, 3, 10, 15};

        Scanner sc = new Scanner(System.in);
        byte numero = sc.nextByte();
        System.out.println("O numero está no índice: " +
                encontraIndice(numeros, numero));
    }

    public static byte encontraIndice(byte[] numeros, byte numeroAProcurar){
        byte retorno = -1;

        for (byte i = 0; i < numeros.length; i++){
            if (numeroAProcurar == numeros[i]){
                retorno = i;
            }
        }

        return retorno;
    }

}
