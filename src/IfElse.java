import java.util.Scanner;

public class IfElse {

private static final Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {

    System.out.println("Input N in the Interval 1 <= N <= 100 ");

    int N = scanner.nextInt();

     if ((N%2 == 1) || (6 <= N && N <= 20)) {

        System.out.println("Weired");
       }

       else {
           System.out.println("Not Weired");
      }

     }

}
