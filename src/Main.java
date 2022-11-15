import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        // Exercise 1

        byte one = 1;
        short two = 2;
        int three = 3;
        long four = 4L;
        float five = 5.6f;
        double six = 7.8;
        char seven = 'g';
        boolean eight = true;


        // Exercise 2

        float boxerOne = 78.2f;
        float boxerTwo = 82.7f;

        float sumWeightBoxers = boxerOne + boxerTwo;
        float diffWeightBoxers = boxerTwo - boxerOne;
        System.out.println("Общий вес двух бойцов " + sumWeightBoxers + " кг");
        System.out.println("Разница между весами бойцов составлет " + diffWeightBoxers + " кг");


        // Exercise 3

        short bananaWeight = 5 * 80;
        short milkWeight = (200 * 105) / 100;
        short icecreamWeight = 2 * 100;
        short eggWeight = 4 * 70;
        float resultInGram = (bananaWeight + milkWeight + icecreamWeight + eggWeight);
        float resultInKilo = resultInGram / 1000;
        System.out.println("Общий вес составлет продуктов: " + resultInKilo + " кг");


        // Exercise 4

        byte loseWeightInKilo = 7;
        int loseWeightInGram = loseWeightInKilo * 1000;

        int howDayLose1 = loseWeightInGram / 250;
        int howDayLose2 = loseWeightInGram / 500;
        int averegeNumberDays = (howDayLose1 + howDayLose2) / 2;
        System.out.println("При потери 250 грамм каждый день понадобится: " + howDayLose1 + " дней, а при потери 500 грамм в день понадобится: " + howDayLose2 + " дней.");
        System.out.println("Среднее число дней составляет: " + averegeNumberDays + " дней.");

        // Exercise 5

        int currentSalaryMasha = 67760;
        int currentSalaryDenis = 83690;
        int currentSalaryCristina = 76230;

        int increaseSalaryMasha = currentSalaryMasha + ((currentSalaryMasha * 10) / 100);
        int diffAnnualSalaryMasha = (increaseSalaryMasha % currentSalaryMasha) * 12;
        int increaseSalaryDenis = currentSalaryDenis + ((currentSalaryDenis * 10) / 100);
        int diffAnnualSalaryDenis = (increaseSalaryDenis % currentSalaryDenis) * 12;
        int increaseSalaryCristina = currentSalaryCristina + ((currentSalaryCristina * 10) / 100);
        int diffAnnualSalaryCristina = (increaseSalaryCristina % currentSalaryCristina) * 12;

        System.out.println("Маша теперь получает " + increaseSalaryMasha + " рублей. Годовой доход вырос на " + diffAnnualSalaryMasha + " рублей");
        System.out.println("Денис теперь получает " + increaseSalaryDenis + " рублей. Годовой доход вырос на " + diffAnnualSalaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + increaseSalaryCristina + " рублей. Годовой доход вырос на " + diffAnnualSalaryCristina + " рублей");


        // Exercise 6


        byte a = 12;
        byte b = 27;
        byte c = 44;
        byte d = 15;
        byte e = 9;

        int result = a * (b + (c - d * e));
        System.out.println(-result);


        // Exercise 7


        int aa = 5;
        int bb = 7;

        bb = (aa * bb) / bb;
        aa = ((aa * aa) + (aa + aa)) / aa;


        System.out.println("Переменная aa = " + aa + ", а переменная bb = " + bb);


        // Exercise 8


        int aaa = 789;

        int bbb = (aaa / 10) % 10;

        System.out.println("a равно " + aaa + " b равно " + bbb);


    }
}