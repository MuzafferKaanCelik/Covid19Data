public class Covid19Data {
    private String region;
    private String aldersgruppe;
    private int bekræfted;
    private int døde;
    private int indlagtePIA;
    private int indlagte;
    private String dato;

    public Covid19Data(String region, String aldersgruppe, int bekræfted, int døde, int indlagtePIA,
                       int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekræfted = bekræfted;
        this.døde = døde;
        this.indlagtePIA = indlagtePIA;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    public String toString() {
        return "Covid19Data\n" +
                "Region: " + region + "\n" +
                "Aldergruppe: " + aldersgruppe + "\n" +
                "Bekræfted: " + bekræfted + "\n" +
                "Døde: " + døde + "\n" +
                "Indlagte på intensiv afdeling: " + indlagtePIA + "\n" +
                "indlagte: " + indlagte + "\n" +
                "Dato: " + dato+ "\n"+
                "_____________________________________________";


    }
}
