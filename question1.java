import java.util.Scanner;
public class question1 {
    public static int searchNumber(int[] arr, int num) {
        int count = 0;
        for (int element : arr) {
            if (element == num) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter sequence of numbers separated by spaces :  ");
        String[] numbers = scanner.nextLine().split(" ");
        int[] arr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }
        System.out.println("enter a number to be searched");
        int searchNum = scanner.nextInt();
        int occurrences = searchNumber(arr, searchNum);
        if (occurrences > 0) {
            System.out.println("the number" + searchNum + "is present in the array" + occurrences + "time(s)");
        } else {
            System.out.println("the number " + searchNum + "is not present in the array");
        }
        scanner.close();
    }
}






