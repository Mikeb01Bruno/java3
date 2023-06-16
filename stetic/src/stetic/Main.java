package stetic;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    
    public static void main(String[] args) {
     Motoboy mb = new Motoboy("OAB232R", "Bruno Pereira", "751.25654", Genero.MASCULINO, 4000, LocalDate.of(2002, Month.MARCH, 12), LocalDate.of(2000, Month.MARCH, 20));
     Gerente gerente = new Gerente(Bonificacao.GERENTE, "Julio Ferraz", "025.458.584", Genero.FEMININO, 3600, LocalDate.of(2012, Month.MARCH, 3), LocalDate.of(2012, Month.MARCH, 4));
     Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Dedeo Luiz", "878.896.859", Genero.FEMININO, 7000, LocalDate.of(2001, Month.MARCH, 12), LocalDate.of(1999, Month.MARCH, 12));
    
        System.out.println(gerente);
        
    }
}
