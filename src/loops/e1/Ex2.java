package loops.e1;

public class Ex2 {


    public static double somatorio(int valInicial, int quantTermos){
        double somatorio = 0;
        int x = valInicial;
        for(int i = 1; i<=quantTermos; i++){
            somatorio = (Math.pow(x/3.0, 2)*4000 + (x/2.0))/2;
        }
        return somatorio;
    }


    public static void main(String[] args) {

        double somatorio = somatorio(1, 20);

        System.out.println(somatorio);

    }
}
