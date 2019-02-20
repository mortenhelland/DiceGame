package dicegame;

import java.util.Scanner;

public class Terningspill {

    int id;

    public void leggTilSpiller() {
       
    }

    public void spill() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hvor mange spillere skal være med?");
        String input = scanner.nextLine();

        int antallSpillere = 0;

        if(input != null && input.length() == 1){
                antallSpillere = Integer.parseInt(input);
                
        } else {
            return;
        }



    }
}
