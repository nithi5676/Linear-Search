package linearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int size = scanner.nextInt();
        System.out.println("Enter Elements into the Array");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the Search Element");
        int searchElement = scanner.nextInt();
        scanner.close();
        LinearSearch linearsearch = new LinearSearch();
        linearsearch.count(array, searchElement);
    }

    public void count(int array[], int searchElement) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if ((searchElement == array[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}
