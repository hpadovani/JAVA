/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros_sorteados;

import java.util.Scanner;

public class Numeros_Sorteados {

//DECALRACAO DE VARIAVEIS GLOBAIS
    static byte comparaNumeros(byte s[], byte a[]) {
        byte numAcertos = 0;
        for (byte i = 0; i < s.length; i++) {
            for (byte j = 0; j < a.length; j++) {
                if (s[i] == a[j]) {
                    numAcertos = (byte) (numAcertos + 1);
                }
            }
        }
        return numAcertos;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        byte sorteio[] = {4, 9, 13, 15, 25, 54}; //VARIAVEL REPRESENTADO OS NUMEROS SORTEADOS
        byte aposta[] = new byte[6];

        for (byte i = 0; i < aposta.length; i++) {
            do {
                System.out.print("DIGITE O NUMERO " + (i + 1) + " --> ");
                aposta[i] = in.nextByte();
            } while (aposta[i] <= 0 || aposta[i] > 60);
        }

        byte numAcertos = comparaNumeros(sorteio, aposta);

        for (byte i = 0; i < sorteio.length; i++) {
            System.out.println((i + 1) + " NUMERO SORTEADO --> " + sorteio[i]);
        }

        for (byte i = 0; i < aposta.length; i++) {
            System.out.println((i + 1) + " NUMERO APOSTADO --> " + aposta[i]);
        }

        if (numAcertos == 6) {
            System.out.println("SEU NUMERO DE ACERTOS --> " + numAcertos);
        } else if (numAcertos == 0) {

            System.out.println("SEU NUMERO DE ACERTOS --> " + numAcertos);

        }
    }
}
