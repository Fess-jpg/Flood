public class Main {
    public static void main(String[] args) {
        //задание 1
        int panda = 1100;
        System.out.println(panda);
        byte a = 44;
        byte b = 22;
        int c = a + b;
        System.out.println(c);
        System.out.println("Hello, World!");
        byte firstPanda = 14;
        System.out.println(firstPanda);
        short secondPanda = 14444;
        System.out.println(secondPanda);
        int thirdPanda = 44444;
        System.out.println(thirdPanda);
        long fourthPanda = 444444444;
        System.out.println(fourthPanda);
        float fifthPanda = 44.44f;
        System.out.println(fifthPanda);
        double sixthPanda = 44.4444444;
        System.out.println(sixthPanda);
        //задание 2
        float ad = 27.12f;
        long bd = 987678965549L;
        float cd = 2.786f;
        short dd = 569;
        short fd = -159;
        short jd = 27897;
        byte id = 67;
        //задание 3
        byte firstTeacher = 23;
        byte secondTeacher = 27;
        byte thirdTeacher = 30;
        short paper = 480;
        int students = firstTeacher + secondTeacher + thirdTeacher;
        int oneStudent = paper / students;
        System.out.println(" на каждого ученика расчитано " + oneStudent + " листов бумаги");
        //задание 4
        byte machine = 16;
        byte time = 2;
        byte timeA = 20;
        int bottle = timeA / time * machine;
        System.out.println(" за " + timeA + "мин машина произвела " + bottle + " штук бутылок");
        short timeB = 1440;
        int bottleB = timeB / time * machine;
        System.out.println(" за " + timeB + "мин машина произвела " + bottleB + " штук бутылок");
        int timeC = 4320;
        int bottleC = timeC / time * machine;
        System.out.println(" за " + timeC + "мин машина произвела " + bottleC + " штук бутылок");
        int timeD = 44640;
        int bottleD = timeD / time * machine;
        System.out.println(" за " + timeD + "мин машина произвела " + bottleD + " штук бутылок");
        //задание 5
        byte cansPaint = 120;
        byte whiteForOne = 2;
        byte brownByOne = 4;
        int totalClasses = cansPaint / (whiteForOne + brownByOne);
        int white = totalClasses * whiteForOne;
        int brown = totalClasses * brownByOne;
        System.out.println("в школе, где " + totalClasses + " классов, нужно " + white + " банок белой краски, и "
                + brown + " банок коричневой краски.");
        //задание 6
        short bananas = 5 * 80;
        short milk = 105 * 2;
        short iseCream = 100 * 2;
        short eggs = 70 * 4;
        int weightGrams = bananas + milk + iseCream + eggs;
        float weightKg = weightGrams / 1000F;
        System.out.println("вес завтрака состовляет " + weightGrams + " грамм, или " + weightKg + " кг");
        //задание 7
        short needReset = 7000;
        short weightLossA = 250;
        short weightLossB = 500;
        int firstOption = needReset / weightLossA;
        int secondOption = needReset / weightLossB;
        int middleOption = (firstOption + secondOption) / 2;
        System.out.println(" если спортсмен будет терять каждый день по " + weightLossA + " грамм то похудеет за " +
                "" + firstOption + " дней ,если по " + weightLossB + " то за " + secondOption + " дней. в среднем за "
                + middleOption + " день он справиться, если филонить не будет ");
        //задание 8
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int newSalaryMasha = mashaSalary / 10 + mashaSalary;
        int annualIncomeMashaGrown = mashaSalary / 10 * 12;
        System.out.println(" маша теперь получает " + newSalaryMasha + " рублей. годовой доход вырос на "
                + annualIncomeMashaGrown + " рублей");
        int newSalaryDenis = denisSalary / 10 + denisSalary;
        int annualIncomeDenisGrown = denisSalary / 10 * 12;
        System.out.println(" денис теперь получает " + newSalaryDenis + " рублей. годовой доход вырос на "
                + annualIncomeDenisGrown + " рублей");
        int newSalaryKristina = kristinaSalary / 10 + kristinaSalary;
        int annualIncomeKristinaGrown = kristinaSalary / 10 * 12;
        System.out.println(" кристина теперь получает " + newSalaryKristina + " рублей. годовой доход вырос на "
                + annualIncomeKristinaGrown + " рублей");

        System.out.println("привет мир");
    }
}