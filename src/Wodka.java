public class Wodka extends Napoje{

    private String moc;

    public Wodka(String nazwa, String moc) {
        super(nazwa);
        this.moc = moc;
    }

    public Wodka(String nazwa) {
        super(nazwa);

    }

    @Override
    public String pij(){
        return "pije barmańska";

    }
}
