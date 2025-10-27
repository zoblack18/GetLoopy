import java.util.Random;

public class dieRoller {
    public static void main(String[] args)
    {

        Random gen = new Random();

        int die1 = 0;
        int die2 = 1; // must be unequal so the loop doesnt fail the first time
        int die3 = 2;
        int dieRoll = die1 + die2 + die3;
        int rollNum = 0;

        System.out.println("Roll:     Die1 Die2 Die3 Sum");
        System.out.println("------------------------------");

        while (die1 != die2 || die1 != die3 || die2 != die3)
        {
            rollNum++;
            die1 = gen.nextInt(6) + 1;
            die2 = gen.nextInt(6) + 1;
            die3 = gen.nextInt(6) + 1;
            dieRoll = die1 + die2 + die3;

            System.out.printf("Roll: %-5d %3d %5d %5d %5d\n", rollNum, die1, die2, die3, dieRoll);

        }
        System.out.println("-----------------");



    }
}