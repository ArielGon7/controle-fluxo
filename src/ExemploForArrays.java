public class ExemploForArrays {
    public static void main(String[] args) {
        String alunos [] = {"marco", "Rose", "Paulo", "joao" };

            for(int i = 0; i < alunos.length; i++){

            System.out.println("O aluno no indice " + i + " é: " +  alunos[i]);
            }

//      Forma mais agradavel:


//      String alunos [] = {"marco", "Rose", "Paulo", "joao" };
//      for(String aluno:alunos){
//          System.out.println("Nome do aluno é: " + aluno);
//      }             
    }
    
}