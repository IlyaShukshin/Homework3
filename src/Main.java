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
        // Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:
        //
        //за 20 минут,
        //в сутки,
        //за 3 дня,
        //за 1 месяц
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
        //На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
        // На один класс уходит 2 банки белой и 4 банки коричневой краски.
        // Сколько банок каждой краски было куплено?
        //Выведите результат задачи в консоль в формате:
        //«В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
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



    }
}