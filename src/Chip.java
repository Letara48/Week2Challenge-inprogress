import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Chip {
    public static void main(String[] args) {
        String rice = "white";
        String rice1 = "brown";
        ArrayList<String> riceall = new ArrayList<String>();
        riceall.add("white");
        riceall.add("brown");

        String meat = "chicken";
        String meat1 = "steak";
        String meat2 = "carnitas";
        String meat3 = "chorizo";
        String meat4 = "sofritas";
        String meat5 = "veggies";
        ArrayList<String> meatall = new ArrayList<String>();
        meatall.add("chicken");
        meatall.add("steak");
        meatall.add("carnitas");
        meatall.add("chorizo");
        meatall.add("sofritas");
        meatall.add("veggies");

        String beans = "Pinto";
        String beans1 = "Black";

        String veggies = "lettuce";
        String veggies1 = "fajita veggies";
        ArrayList<String>veggiesall = new ArrayList<String>();
        veggiesall.add("lettuce");
        veggiesall.add("fajita veggies");

        String salsa = "mild";
        String salsa1 = "medium";
        String salsa2 = "hot";
        ArrayList<String>salsaall = new ArrayList<String>();
        salsaall.add("mild");
        salsaall.add("medium");
        salsaall.add("hot");

        boolean cheese = true;
        boolean guac = true;
        boolean queso = true;

        Random rand = new Random();
        int rand_ingred = rand.nextInt(9);



    }
}
