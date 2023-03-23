public class Wino extends Napoje{

    private String moc;

    public Wino(String nazwa, String moc) {
        super(nazwa);
        this.moc = moc;
    }

    public Wino(String nazwa) {
        super(nazwa);
    }

    @Override
    public String pij(){
        return "pije pifko snajpera";

    }
}
