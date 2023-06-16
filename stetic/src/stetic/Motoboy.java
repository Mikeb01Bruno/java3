package stetic;

import java.time.LocalDate;

public class Motoboy extends Funcionario{
    private String placaDaMoto;

    public Motoboy(String placaDaMoto, String nome, String cpf, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(nome, cpf, genero, salarioBase, dataNascimento, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

    // Salário Final
    
    @Override
    public double getSalarioFinal() {
        return 0;
    }

    //Getter & Setter
    
    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Placa Da Moto: " + placaDaMoto +
                "\n Salário Final: " + getSalarioFinal();
          
        
    }
   
}
