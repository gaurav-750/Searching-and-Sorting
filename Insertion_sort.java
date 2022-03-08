package Arrays;
import java.util.Scanner;

public class Insertion_sort {
    public static void insertionSort(int[] arr){
        int i = 1;

        while (i < arr.length){
            // insert element in sorted area
            int j = i-1;
            while(j >= 0){
                if (arr[j] > arr[j+1]){ // swap those elements
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
                j--;
            }
            i++;
        }

    }

    // Date: 05-10-2021
    // 14:39 - Edited code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases to be run: ");
        int cases = sc.nextInt();

        int g = 0;
        while (g < cases){
            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++){
               arr[i] = sc.nextInt();
            }

            g++;
            insertionSort(arr);
            for(int elem : arr){
                System.out.print(elem + " ");
            }
        }


    }
}
