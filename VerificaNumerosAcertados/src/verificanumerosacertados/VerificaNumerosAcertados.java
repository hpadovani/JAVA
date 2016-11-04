package verificanumerosacertados;

public class VerificaNumerosAcertados {

    public static void main(String[] args) {
        byte sorteio[] = {4, 21, 33, 9, 5, 20};
        byte aposta[] = {1, 2, 9, 33, 27, 4};

        System.out.println("Números acertado:" + verificaNumeros(sorteio, aposta));
    }
    public static byte verificaNumeros(byte[] sorteio, byte[] aposta){
        byte numerosAcertados = 0;
        for (byte i = 0; i < 6; i++){
            //2° FOR QUE PERCORRE AS APOSTAS E VERIFICA SE O NÚMERO SORTEADO
            //ESTÁ LÁ
            for (byte j = 0; j < 6; j++){
                if (sorteio[i] == aposta[j]){
                    numerosAcertados++;
                }
            }
        }
        return numerosAcertados;
    }

}

