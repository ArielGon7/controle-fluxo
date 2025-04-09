public class planoOperadora {
    public static void main(String[] args) {
        String plano = "M";

 /* *       if(plano=="B"){
            System.out.println("100 Minutos de ligação");
        }
        else if(plano=="M"){
            System.out.println("100 Minutos de ligação");
            System.out.println("Whats e instagram gratis");
        }
        else if(plano=="T"){
            System.out.println("100 Minutos de ligação");
            System.out.println("Whats e instagram gratis");
            System.out.println("5Gb de youtube");
    }
/* */        
            //Nesse caso daria para usar o Switch case
            //pois da uma continuaçao a baixo, pela falta de um break

            switch (plano) {
                case "T":{
                    System.out.println("5Gb de youtube");
                }
                case "M":{
                    System.out.println("Whats e instagram gratis");
                }
                case "B":{
                    System.out.println("100 Minutos de ligação");
                }
            }
    }
}
