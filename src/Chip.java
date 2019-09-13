import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Chip {
    public static void main(String[] args) {

        String rice = "white rice";
        String rice1 = "brown rice";
        String rice2 = "no rice";
        String rice3 = "White and brown rice";

        ArrayList<String> riceall = new ArrayList<String>();
        riceall.add(rice);
        riceall.add(rice1);
        riceall.add("white + brown rice");

        Random randomGenerator = new Random();
        String random1 = riceall.get(randomGenerator.nextInt(riceall.size()));

        String meat = "chicken";
        String meat1 = "steak";
        String meat2 = "carnitas";
        String meat3 = "chorizo";
        String meat4 = "sofritas";
        String meat5 = "veggies";
        String meat6 = "no meat";
        String meat7 = "chicken + steak + carnitas + chorizo + sofritas + veggies";
        ArrayList<String> meatall = new ArrayList<String>();

        meatall.add("chicken");
        meatall.add("steak");
        meatall.add("carnitas");
        meatall.add("chorizo");
        meatall.add("sofritas");
        meatall.add("veggies");
        meatall.add("chicken + steak + carnitas + chorizo + sofritas + veggies");

        Random randomMeatGen = new Random();
        String random2 = meatall.get(randomMeatGen.nextInt(meatall.size()));

        String beans = "Pinto";
        String beans1 = "Black";
        String beans3 = "Pinto and Black beans";
        String beans2 = "No Beans";
        ArrayList<String> beansall = new ArrayList<>(); //See if you need this

        beansall.add("Pinto beans");
        beansall.add("Black beans");
        beansall.add("Pinto + Black beans");
        Random randomBeanGen = new Random();
        String random3 = beansall.get(randomBeanGen.nextInt(beansall.size()));

        String veggies = "lettuce";
        String veggies1 = "fajita veggies";
        String veggies2 = "no veggies";
        String veggies3 = "lettuce + fajita veggies";
        ArrayList<String> veggiesall = new ArrayList<String>();

        veggiesall.add("lettuce");
        veggiesall.add("fajita veggies");
        veggiesall.add("lettuce + fajita veggies");

        Random randomVegGen = new Random();
        String random4 = veggiesall.get(randomVegGen.nextInt(veggiesall.size()));

        String salsa = "mild salsa";
        String salsa1 = "medium salsa";
        String salsa2 = "hot salsa";
        String salsa4 = "mild + medium + hot salsa";
        String salsa3 = "no salsa";
        ArrayList<String> salsaall = new ArrayList<String>();

        salsaall.add(salsa);
        salsaall.add(salsa1);
        salsaall.add(salsa2);

        Random randomSalGen = new Random();
        String random5 = salsaall.get(randomSalGen.nextInt(salsaall.size()));

        String cheese1 = "no cheese";
        String guac1 = "no guac";
        String queso1 = "no queso";
        String s_cream1 = "no sour cream";

        String cheese = "Cheese";
        String guac = "guac";
        String queso = "queso";
        String s_cream = "sour cream";

        ArrayList<String> extrasall = new ArrayList<>();
        extrasall.add(cheese);
        extrasall.add(guac);
        extrasall.add(s_cream);
        extrasall.add("Cheese + Guac + Queso + Sour Cream");

        Random randomExtrasGen = new Random();
        String random6 = extrasall.get(randomExtrasGen.nextInt(extrasall.size()));

        ArrayList<String> nones = new ArrayList<String>();
        nones.add(rice2);
        nones.add(meat6);
        nones.add(beans2);
        nones.add(salsa3);
        nones.add(veggies2);
        nones.add(cheese1);
        nones.add(guac1);
        nones.add(queso1);
        nones.add(s_cream1);

        Random randomNonesGen = new Random();
        String random7 = nones.get(randomNonesGen.nextInt(nones.size()));

        String [] burrito = new String[25];

        double price = 3.00;

        for (int i = 0; i <= 25; i++) {

            burrito[i] = "Burrito " + (i + 1) + ":" + random1 + "," + random2 + "," + random3 + "," + random4 + ","
                    + random5 + "," + random6 + "," + random7 + price;

            System.out.println(burrito[i]);}

            if (random1.equals(rice) || (random1.equals(rice1))) {
                price += 0.50;
            }
            if (random1.equals(rice3));{
                price += 1.0;
            }

            if (random2.equals(meat) || (random2.equals(meat1) || (random2.equals(meat2) || (random2.equals(meat3)
                    || (random2.equals(meat4) || (random2.equals(meat5))))))) ;{
            price += 0.50;
                    }if (random3.equals(beans) || (random3.equals(beans1) || (random3.equals(beans3))));
            {
                price += 0.50;
            }if (random4.equals(veggies) || (random4.equals(veggies1) || (random4.equals(veggies3))));
            {
                price += 0.5;
            }
            if (random5.equals(salsa)|| (random5.equals(salsa1) || (random5.equals(salsa2) || (random5.equals(salsa4)))));
            {
                price += 0.50;
            }if (random6.equals(cheese) || random6.equals(guac) || random6.equals(s_cream));
            {
                price += 0.05;
            }if (random6.equals("Cheese + Guac + Queso + Sour Cream"));{
                price += 1.5;
            }
            }

}
