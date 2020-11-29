import java.util.Scanner;

class DeMorgan {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 45 and 78:");

        int x = scan.nextInt();

        if (!(x > 45 && x < 78))
        {
            System.out.println("not between 45 and 78");
        }

    }
}