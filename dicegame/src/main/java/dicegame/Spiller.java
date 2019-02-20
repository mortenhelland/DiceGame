package dicegame;

public class Spiller {

    private String navn;
    private int verdi;


    public Spiller (String navn, int verdi) {
        this.navn=navn;
        this.verdi=verdi;

    }

    /**
     * @return the navn
     */
    public String getNavn() {
        return navn;
    }

    /**
     * @param navn the navn to set
     */
    public void setNavn(String navn) {
        this.navn = navn;
    }

    /**
     * @return the verdi
     */
    public int getVerdi() {
        return verdi;
    }

    /**
     * @param verdi the verdi to set
     */
    public void setVerdi(int verdi) {
        this.verdi = verdi;
    }

    

    

} 