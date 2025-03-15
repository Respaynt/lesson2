public class Main {
    public static void main(String[] args) {
        byte small;
        short average;
        int big;
        long huge;
        float fractionalAverage;
        double fractionalarge;

        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int q = 27897;
        byte f = 67;

        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short sheets = 480;
        short allСlasses = (short) (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        short studentSheets = (short) (sheets/allСlasses);
        System.out.println("На каждого ученика рассчитано " + studentSheets + " листов бумаги.");


        byte bottleProduction = 16;
        byte productionTime = 2;
        short minutes20 = (short) (bottleProduction * 10);
        System.out.println("За 20 минут машина произвела " + minutes20 + " штук бутылок");
        short minute = (short) (bottleProduction/productionTime);
        short day = (short) (1440*minute);
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        int day3 = (day*3);
        System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок");
        int month = day * 30;
        System.out.println( "За 1 месяц машина произвела " + month + " штук бутылок");


        byte cansOfPaint =120;
        byte whitePaint1 = 2;
        byte brownPaint1 = 4;
        byte cans1 = (byte) (whitePaint1 + brownPaint1);
        byte allClasses = (byte) (cansOfPaint/cans1);
        byte whitePaint = (byte) (whitePaint1 * allClasses);
        byte brownPaint = (byte) (brownPaint1 * allClasses);
        System.out.println("В школе, где " + allClasses + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски.");


        short bananas = (5*80);
        short milk = (2*105);
        short iceCreamPlombir = (2*100);
        short rawEggs = (4*70);
        short numberOfGrams = (short) (bananas + milk + iceCreamPlombir + rawEggs);
        short grPerKg = 1000;
        float weiqhKg = numberOfGrams/(float)grPerKg;

        System.out.println( numberOfGrams + " грамм");
        System.out.println(weiqhKg +" кг");


        byte weightKg = 7;
        short weightGr = (short) (weightKg * grPerKg);
        short twoHundredFifty = (short) (weightGr/250);
        short fiveHundred = (short) (weightGr/500);
        short averge = (short) ((twoHundredFifty + fiveHundred) / 2);
        System.out.println( "При потере по 250 грамм в день потребуется " + twoHundredFifty + " дней ");
        System.out.println( "При потере по 500 грамм в день потребуется " + fiveHundred + " дней ");
        System.out.println( "В среднем чтобы добится результата потребуется " + averge + " день ");



        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;

        int mashaBonus = (int) (masha * 1.1);
        int denisBonus = (int) (denis * 1.1);
        int kristinaBonus = (int) (kristina * 1.1);

        int mashaYear = masha * 12;
        int denisYear = denis * 12;
        int kristinaYear = kristina * 12;

        int mashaYearBonus = mashaBonus * 12;
        int denisYearBonus = denisBonus * 12;
        int kristinaYearBonus = kristinaBonus * 12;

        int mashaDifference = mashaYearBonus - mashaYear;
        int denisDifference = denisYearBonus - denisYear;
        int kristinaDifference = kristinaYearBonus - kristinaYear;

        System.out.println("Маша теперь получает "+ mashaBonus + " рублей. Годовой доход вырос на " + mashaDifference + " рублей ");
        System.out.println("Денис теперь получает "+ denisBonus + " рублей. Годовой доход вырос на " + denisDifference + " рублей ");
        System.out.println("Кристина теперь получает "+ kristinaBonus + " рублей. Годовой доход вырос на " + kristinaDifference + " рублей ");

    }
}