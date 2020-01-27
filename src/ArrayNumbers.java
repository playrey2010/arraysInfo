import java.util.Scanner;

public class ArrayNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int[] numbers = new int[10];

        for (int i=0; i< numbers.length; i++) {
            System.out.print("Please input a number: ");
            numbers[i] = sc.nextInt();
            sum = sum + numbers[i];
        }


//        for (int input:numbers) {
//            System.out.println("Please input a number: ");
//            numbers[input] = sc.nextInt();
//            sum += numbers[input];
//        }
        int average = sum/numbers.length;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }
}
