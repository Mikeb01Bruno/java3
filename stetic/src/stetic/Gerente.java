
package stetic;

import java.time.LocalDate;

public class Gerente  extends  CargoDeConfianca implements Autenticavel{

    public Gerente(Bonificacao bonificacao, String nome, String cpf, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, genero, salarioBase, dataNascimento, dataAdmissao);
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    public double getSalarioFinal(){
      return salarioBase + (salarioBase  * super.bonificacao.GERENTE.valor);
    }
    
    @Override
    public String toString() {
        
        return super.toString() + 
                "Gerente" +
                "O salário do gerente é: " + getSalarioFinal();
    }
    
    
    
}
