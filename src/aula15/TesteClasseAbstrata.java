package aula15;


public class TesteClasseAbstrata {
    
    public static void main(String[] args) {
        
        /*PessoaAbstrata objPessoa = new PessoaAbstrata();
        objPessoa.setCpf("123412412412");
        objPessoa.setNome("Pessoa");
        System.out.println("Total Pessoa: " + objPessoa.tirarCopias(5));
        */
        
        Aluno objAluno = new Aluno();
        objAluno.setNome("Aluno");
        objAluno.setCpf("333123123123");
        objAluno.setMatricula("123");
        
        System.out.println("Total Aluno: " + objAluno.tirarCopias(5));
        
        
    }
    
}
