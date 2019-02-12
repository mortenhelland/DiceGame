package dicegame;

import java.util.Random;

public class Kopp {

    int id;
    int sum;

    public Kopp() {

    }

    public String trill() {
        Terning t1 = new Terning();
        Terning t2 = new Terning();
        Random random = new Random();

        t1.setVerdi(random.nextInt(6) + 1);
        t2.setVerdi(random.nextInt(6) + 1);

        return t1.getVerdi() + t2.getVerdi() + "";
    }

    public int getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }
}
