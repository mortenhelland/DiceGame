package dicegame;

import java.util.ArrayList;
import java.util.Scanner;

public class Terningspill {

    int id;
    ArrayList<Spiller> players;

public Terningspill(int id){
    this.id = id;
    players = new ArrayList<Spiller>();
}

    public void leggTilSpiller(String navn) {
        Spiller p1 = new Spiller(navn,0);
        players.add(p1);
      
    }

    public void spill() {

        Scanner scanner = new Scanner(System.in);
        int antallSpillere = 0;

        System.out.println("Hvor mange spillere skal være med?");
        String input = scanner.nextLine();

        

        if(input != null && input.length() == 1){
                antallSpillere = Integer.parseInt(input);

        } else {
            return;
        }

        for(int i = 0; i < antallSpillere; i++){
            System.out.println("Spiller #" + i+1);
            String navn = scanner.nextLine();
            leggTilSpiller(navn);
        }
        

        System.out.println("Yey! Alle spillerne er lagt til!");

        for(int i = 0; i < antallSpillere; i++){
            Kopp kopp = new Kopp();
            System.out.println(players.get(i).getNavn() + " fikk: " + kopp.trill());
            players.get(i).setVerdi(kopp.getSum());;
        
        }




    }
}
