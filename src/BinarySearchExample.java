import java.util.Scanner;

public class BinarySearchExample {
    void func(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the required elements in the array");

        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the element you want to search in the array");
        int searchingElemnt=sc.nextInt();
        int lb=0;
        int ub=arr.length-1;
        int mid=0;
        int count=0;
        while(lb<=ub) {
            mid=ub+lb/2;
            if(arr[mid]==searchingElemnt){
                count++;
                break;
            }
            else if(arr[mid]<searchingElemnt){
                lb=mid+1;
            }
            else if(arr[mid]>searchingElemnt){
                ub=mid-1;
            }

        }
        if(count==0){
            System.out.println("Element not found ");
        }
        else{
            System.out.println("element found at index : "+(mid+1));
        }

    }

    public static void main(String[] args) {
        BinarySearchExample obj=new BinarySearchExample();
        obj.func();
    }

}
