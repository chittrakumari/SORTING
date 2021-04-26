import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortExample {
    void func(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements in the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the requird elements in the array");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("------Bubble Sort------");
        for (int r=0;r<arr.length;r++){
            for(int c=0;c<=4-r;c++){
                if(arr[c]>arr[c+1]){
                    int temp=arr[c];
                    arr[c]=arr[c+1];
                    arr[c+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        BubbleSortExample obj=new BubbleSortExample();
        obj.func();
    }
}
