import java.util.Scanner;

public class EntryPoint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number: ");
        int num = sc.nextInt();
        checkDateMonth.isMonth(num);
    }
}
