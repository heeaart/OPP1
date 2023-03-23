import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static ArrayList<Napoje> napuj = new ArrayList<>();
    public static String test = "test123";

    public static void main(String[] args) {

        Sortowanie();
        lista();
        sortowaniePoNazwie();
        kohacProgramowac();
        metodapij();

        //8
        Function<String, Integer> dl = (String x) -> x.length();
        System.out.println(dl.apply(test));

        //9
        Consumer<Integer> ocena = (Integer z) -> System.out.println("Dostane ocene "+ z);
        ocena.accept(7);

        //zad10 inspirowałem sie szymonem wytlumaczyl mi to
        BiFunction<Integer,Integer,Integer> iloczyn = (Integer a, Integer b) -> a*b;
        System.out.println(iloczyn.apply(6,6));
    };

    public static void lista() {
        napuj.add(new Piwo("Kraftowe", "slaba"));
        napuj.add(new Wodka("Barmańska", "Spora"));
        napuj.add(new Wino("Snajper", "taka średnia ta moc"));
    }

    private static void metodapij()
    {
        for (Napoje napoje : napuj) {
            System.out.println(napoje.pij());
        }
    }

    public static void Sortowanie()    {
        napuj.sort(new Comparator<Napoje>() {
            @Override
            public int compare(Napoje o1, Napoje o2) {
                return o1.getNazwa().compareTo(o2.getNazwa());
            }
        });

        for (Napoje napoje : napuj) {
            System.out.println(napoje.getNazwa());
        }
    }


    private static void sortowaniePoNazwie()
    {
        napuj.sort(new Comparator<Napoje>() {
            @Override
            public int compare(Napoje o1, Napoje o2) {
                return o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
            }
        });
        for (Napoje napoje : napuj) {
            System.out.println(napoje.getNazwa());
        }
    }

    public static void kohacProgramowac(){
        KochajacyProgramowac kochajacyProgramowac = new KochajacyProgramowac() {
            @Override
            public String programuje() {
                return "programuje";
            }
        };
        System.out.println(kochajacyProgramowac.programuje());

    };




};