import java.text.DecimalFormat;

public class Main {

void main(String[] args) {
    System.out.println("BlockBuster");
    DecimalFormat df = new DecimalFormat("#.##"); // con esta linea creo un formato decimal, para que solo me de dos decimales
    System.out.println("--------------EJERCICIO 1----------------");
    String titleb = "The Da Vinci Code";
    int titlebyear = 2003;
    double priceb = 1.5;

    String titlem = "Inception";
    int titlemyear = 2010;
    double pricem = 4 ;

    String titlev = "Read Dead Redemption 2";
    int titlevyear = 2019;
    double pricev = 1.5;

   String titles = "Nothing Else Matters";
    int titlesyear = 1992;
    double prices= 0.8;

    System.out.println("BOOK: " +titleb+ " (" +titlebyear+ ") - " +priceb+ "€/dia");
    System.out.println("MOVIE: " +titlem+ " (" +titlemyear+ ")- " +pricem+ "€/dia");
    System.out.println("VIDEOGAME: " +titlev+ " (" +titlevyear+ ")- " +pricev+ "€/dia");
    System.out.println("SONG: " +titles+ " (" +titlesyear+ ")- " +prices+ "€/dia") ;

// En el ejercicio 2, doy la cantidad de articulos que "alquilamos" en blockBuster. y sacamos el total sumando cada uno
    System.out.println("--------------EJERCICIO 2----------------");
    double totalbooks = 10;
    double totalmovies = 45;
    double totalgames = 140;
    double totalsongs= 167;

    double totalday = (priceb*totalbooks) +(pricem*totalmovies) + (pricev*totalgames) + (prices*totalsongs);
    System.out.println("Total Income: " +totalday+ "€");

// En el ejercicio 3, un cliente se lleva 12 movies, porque se lo prestara a toda su familia para que la vean. pero tiene un descuento del 21% por el dia sin IVA.
    System.out.println("--------------EJERCICIO 3----------------");
    int client1 = 12;
    double subclient1 = client1 * pricem ;
    int discount1 = 21;
    double discountclient1 = (subclient1*21) / 100 ;
    double totalclient1 = subclient1 - discountclient1;

    System.out.println("Product: " +titlem);
    System.out.println("Units: " +client1);
    System.out.println("Subtotal: " +subclient1);
    System.out.println("Discount: " +discount1+ "%");
    System.out.println("Total discount: " +discountclient1+ "€");
    System.out.println("Total: " +totalclient1+ "€" );

//Aqui sacamos media, sumando los precios de nuestras unidades y diviendolas sobre 4
    System.out.println("--------------EJERCICIO 4----------------");
    double pricemedia = (priceb + pricem + prices + pricev) / 4;
    System.out.println("Precio medio: " +pricemedia+ "€");

// aqui es donde usaremos el nuevo formato de decimales con esta linea "+df.format(x)+" df por el nombre que le puse al formato. y x sera la variable que queremos que se ajuste
// Luego sacaremos el porcentaje de cada uno, multiplicando la cantidad vendida, por 100 dividiendolo sobre el total vendido(que seria el 100%)
    System.out.println("--------------EJERCICIO 5----------------");
    int totalart = (int) (totalbooks + totalmovies + totalgames + totalsongs);
    double percentb = (totalbooks * 100) / totalart;
    double percentm = (totalmovies * 100) / totalart;
    double percentg = (totalgames * 100) / totalart;
    double percents = (totalsongs * 100) / totalart;

    System.out.println("Total units : " +totalart);
    System.out.println("BOOKS: "  +df.format(percentb)+ "%");
    System.out.println("MOVIES: " +df.format(percentm)+ "%");
    System.out.println("VIDEOGAMES : " +df.format(percentg)+ "%");
    System.out.println("SONGS : " +df.format(percents)+ "%" );



}
        }
