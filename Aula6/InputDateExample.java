package Aula6;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InputDateExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma data no formato dd/MM/yyyy: ");
        String dataString = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;

        try {
            data = dateFormat.parse(dataString);
        } catch (ParseException e) {
            System.err.println("Formato de data inválido. Use o formato dd/MM/yyyy.");
            // Você pode tratar esse erro de acordo com a sua lógica.
        }

        if (data != null) {
            System.out.println("Você digitou a data: " + data);
        }

        scanner.close();
    }
}
