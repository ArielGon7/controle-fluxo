import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada > 0){
            double ValorDoce = ValorAleatorio();

            if(ValorDoce > mesada){
                ValorDoce = mesada;
            }

            System.out.println("Doce no valor de: " + ValorDoce + "Adiciondo ao carrinho");
            mesada = mesada - ValorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joazinho gastou todos os doces");
    }
    private static double ValorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
    
}
