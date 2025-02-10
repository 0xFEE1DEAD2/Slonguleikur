package hi.verkefni.bakendi;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Leikmadur {
    Teningur teningur = new Teningur();
    private final SimpleStringProperty nafnLeikmans;
    private final SimpleIntegerProperty reiturBord;

    /**
     * Smiður fyrir leikmann sem skilgreinir nafn
     * og staðsetningu á reit.
     *
     * @param nafn Nafn leikmans.
     * @param reitur Reitur staðsetning.
     */
    public Leikmadur(String nafn, int reitur) {
        this.nafnLeikmans = new SimpleStringProperty(nafn);
        this.reiturBord = new SimpleIntegerProperty(reitur);
    }

    /**
     * Sækir nafn leikmans.
     *
     * @return Nafn leikmans
     */
    public String getNafnLeikmans() {
        return nafnLeikmans.get();
    }

    /**
     * Stillir nýtt nafn leikmans
     *
     * @param nafn Nýtt nafn.
     */
    public void setNafnLeikmans(String nafn) {
        this.nafnLeikmans.set(nafn);
    }

    /**
     * Sækir reit leikmanns á borðinu.
     *
     * @return Reitur leikmanns.
     */
    public int getReiturBord() {
        return reiturBord.get();
    }

    /**
     * Stillir nýjan reit leikmanns á borðinu.
     *
     * @param reitur Nýtt nafn leikmanns.
     */
    public void setReiturBord(int reitur) {
        this.reiturBord.set(reitur);
    }

    /**
     * Færir leikmann á reit reitur en markið er í reit max.
     *
     * @param reitur reitur sem leikmaður er færður á
     * @param max mark-reitur á borðinu
     */
    public void faera (int reitur, int max) {
        teningur.kasta();
    }

    /**
     * Test cases fyrir klasa.
     *
     * @param args Test cases.
     */
    public static void main(String[] args) {
        // Búa til leikmann
        Leikmadur leikmadur = new Leikmadur("Veigar", 1);

        // Upphafsgildi
        System.out.println("Upphafsnafn: " + leikmadur.getNafnLeikmans());
        System.out.println("Upphafsreitur: " + leikmadur.getReiturBord());

        // Breyta nafni
        leikmadur.setNafnLeikmans("Jón");
        System.out.println("Nýtt nafn: " + leikmadur.getNafnLeikmans());

        // Breyta reit
        leikmadur.setReiturBord(5);
        System.out.println("Nýr reitur: " + leikmadur.getReiturBord());
    }
}
