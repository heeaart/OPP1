public class Piwo extends Napoje{
    private String moc;


    public Piwo(String nazwa, String moc) {
        super(nazwa);
        this.moc = moc;
    }

    @Override
    public String pij(){
        return "pije pifko kraftowe";

    }


}
