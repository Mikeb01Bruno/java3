package stetic;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca implements Autenticavel{
    private final double PREMIO=0.1;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, genero, salarioBase, dataNascimento, dataAdmissao);
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

  
   

    @Override
    public double getSalarioFinal() {
          return salarioBase + (salarioBase * super.bonificacao.DIRETOR.valor) + (PREMIO *salarioBase);
    }
    
    
    
     @Override
    public String toString() {
        return super.toString() +
                "\n Diretor" +
                "\n O salário final do Diretor é " + getSalarioFinal();
         
    }
}
