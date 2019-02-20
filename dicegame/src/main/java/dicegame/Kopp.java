package dicegame;

import java.util.Random;

public class Kopp {

    int id;
    int sum;

    public Kopp() {

    }

    /**
     * 
     * @return the 2 dice values together in a string
     */
    public String trill() {
        Terning t1 = new Terning();
        Terning t2 = new Terning();
        Random random = new Random();

        t1.setVerdi(random.nextInt(6) + 1);
        t2.setVerdi(random.nextInt(6) + 1);

        this.sum = t1.getVerdi() + t2.getVerdi();
        return t1.getVerdi() + "" + t2.getVerdi() + "";
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the sum
     */
    public int getSum() {
        return sum;
    }

    /**
     * @param sum the sum to set
     */
    public void setSum(int sum) {
        this.sum = sum;
    }

}
