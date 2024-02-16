public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int apple = 10;
        byte bananas = 20;
        short pears = 30;
        long  oranges = 40;
        float potato = 3.5f;
        double tomato = 5.75;
        System.out.println("Значение переменной apple с типом int равно " + apple);
        System.out.println("Значение переменной bananas с типом byte равно " + bananas);
        System.out.println("Значение переменной pears с типом short равно " + pears);
        System.out.println("Значение переменной oranges с типом long равно " + oranges);
        System.out.println("Значение переменной potato с типом float равно " + potato);
        System.out.println("Значение переменной tomato с типом double равно " + tomato);

        System.out.println("Задача №2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short i = -159;
        int e = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(i);
        System.out.println(e);
        System.out.println(g);

        System.out.println("Задача №3");
        int class1 = 23;
        int class2 = 27;
        int class3 = 30;
        int allclasses = class1 + class2 + class3;
        int allpaper = 480;
        int paperStudent = allpaper / allclasses;
        System.out.println("На каждого ученика расчитано " + paperStudent + " листов бумаги");

        System.out.println("Задача №4");
        int bottle = 16;
        int time = 2;
        int min = bottle / time;
        int min20 = 20;
        int day = 1440;
        int day3 = 4320;
        int month = 43200;
        int time1 = min20 * min;
        int time2 = day * min;
        int time3 = day3 * min;
        int time4 = month * min;
        System.out.println("За 20 минут машина произвела " + time1 + " бутылок");
        System.out.println("За сутки машина произвела " + time2 + " бутылок");
        System.out.println("За 3 дня машина произвела " + time3 + " бутылок");
        System.out.println("За месяц машина произвела " + time4 + " бутылок");

        System.out.println("Задача №5");
        byte allJar = 120;
        byte whiteJar = 2;
        byte brownJar = 4;
        int oneClass = whiteJar + brownJar;
        int allClass = allJar / oneClass;
        int allWhiteJar = allClass * whiteJar;
        int allBrownJar = allClass * brownJar;
        System.out.println("В школе, где " + allClass + " классов, нужно " + allWhiteJar + " банок белой краски и " + allBrownJar + " банок коричневой краски");

        System.out.println("Задача №6");
        int banana = 5;
        int weightOneBanana = 80;
        int milk = 2;
        int wightMilk = 105;
        int iceCream = 2;
        int weightIceCream = 100;
        int aggs = 4;
        int weightAggs = 70;
        int bananaGr = banana * weightOneBanana;
        int milkGr = milk * wightMilk;
        int iceCreamGr = iceCream * weightIceCream;
        int aggsGr = aggs * weightAggs;
        int weightBreakfast = bananaGr + milkGr + iceCreamGr + aggsGr;
        float grPerKg = weightBreakfast / 1000f;
        System.out.println("Вес завтрака в граммах " + weightBreakfast);
        System.out.println("Вес завтрака в килограммах " + grPerKg);

        System.out.println("Здача №7");
        short objective = 7000;
        short grDay1 = 250;
        short grDay2 = 500;
        int decreaseDay1 = objective / grDay1;
        int decreaseDay2 = objective / grDay2;
        int averageDay = (decreaseDay1 + decreaseDay2) / 2;
        System.out.println("Если спортсмен будет худеть каждый день на 250гр, то это займёт " + decreaseDay1 + " дней");
        System.out.println("Если спортсмен будет худеть каждый день на 500гр, то это займёт " + decreaseDay2 + " дней");
        System.out.println("В среднем для достижения результата потребуется " + averageDay + " день");

        System.out.println("Задача №8");
        int masha = 67760;
        int denis = 83690;
        int cristina = 76230;
        int months = 12;
        double mashaRaise = masha * 0.1 + masha;
        double mashaBefore = masha * months;
        double mashaAfter = mashaRaise * months;
        double mashaDifference = mashaAfter - mashaBefore;

        double denisRaise = denis * 0.1 + denis;
        double denisBefore = denis * months;
        double denisAfter = denisRaise * months;
        double denisDifference = denisAfter - denisBefore;

        double cristinaRaice = cristina * 0.1 + cristina;
        double cristinaBefore = cristina * months;
        double cristinaAfter = cristinaRaice * months;
        double cristinaDifference = cristinaAfter - cristinaBefore;

        System.out.println("Маша теперь получает " + mashaRaise + " рублей. Годовой доход вырос на " + mashaDifference + " рублей");
        System.out.println("Денис теперь получет " + denisRaise + " рублей. Годовой доход вырос на " + denisDifference + " рублей");
        System.out.println("Кристина теперь получает " + cristinaRaice + " рублей. Годовой доход вырос на " + cristinaDifference + " рублей");

    }
}