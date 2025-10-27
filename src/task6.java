public class task6 {
    public static void main(String[] args)
    {
        for (int i = 0; i < 5; i++) { // rows
            for (int j = 5; j > i; j--) { // columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}