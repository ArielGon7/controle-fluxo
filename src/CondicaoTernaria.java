public class CondicaoTernaria {
    public static void main(String[] args) {
        int nota = 7;
        String resultado = nota >= 7 ?"Aprovado" : "Reprovado";

        System.out.println(resultado);

//////////////////////////////////////////////////////////////////////////////////////////////////

        //if - if else - else
        //nota de um aluno "A"
        int A = 6;
        String fechamentoNota = A>=7 ? "Aprovado" : A >= 5 && A < 7 ? "Recuperaçao" : "Reprovado.";
        
        System.out.println(fechamentoNota);
    }
    
}