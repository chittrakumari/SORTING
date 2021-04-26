import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortExample {
    void func(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements in the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the requird elements in the array");
        for (int i = 0; i <n ; i++) {
           arr[i]=sc.nextInt();
        }
        System.out.println("------Selection Sort------");
        for(int r=0;r<arr.length;r++){
            for(int c=r;c<arr.length;c++){
                if(arr[r]>arr[c]){
                    int temp=arr[r];
                    arr[r]=arr[c];
                    arr[c]=temp;
                }
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
SelectionSortExample obj=new SelectionSortExample();
obj.func();
    }
}
