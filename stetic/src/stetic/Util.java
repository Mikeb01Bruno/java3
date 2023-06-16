package stetic;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Util {
    public static String formatarData(LocalDate dataNascimento){
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formatar.format(dataNascimento);
    }
    public static String formatarMonetario(double salarioBase){
        NumberFormat formatar = NumberFormat.getCurrencyInstance();
        return formatar.format(salarioBase);
    }
   
}
