package dicegame;

import java.lang.reflect.AnnotatedArrayType;
import java.util.Scanner;

public class Terningspill {

    public void leggTilSpiller() {
        Spiller[] spiller = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvor mange spillere skal være med?");
        String input = scanner.nextLine();

        int antSpillere = 0;

        if (input != null && input.length() == 1) {
            try {
                antSpillere = Integer.parseInt(input);
                if (antSpillere < 2 || antSpillere > 5) {
                    System.out.println("Ugyldig antall spillere");
                }
            } catch (NumberFormatException e) {
                antSpillere = 0;
            }
        }
        while (antSpillere < 2 || antSpillere > 5) {
            spiller = new Spiller[antSpillere];

            for (int i = 0; i < antSpillere; i++) {
                System.out.println("Navnet på spiller " + (i + 1));
                String spillerNavn = scanner.nextLine();
                spiller[i] = new Spiller(spillerNavn);
            }

        }

    }

    public void spill() {

    }
}
