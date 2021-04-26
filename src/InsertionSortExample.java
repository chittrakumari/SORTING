import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortExample {
    void func() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements in the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the required elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("------Insertion Sort------");
        for (int r = 1 ;r <arr.length ; r++) {
            for (int c=0;c<arr.length;c++){
                if(arr[c]>arr[r]){
                    int temp=arr[c];
                    arr[c]=arr[r];
                    arr[r]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
      InsertionSortExample obj=new InsertionSortExample();
      obj.func();
    }
}
