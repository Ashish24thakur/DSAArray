import java.util.Scanner;

class Methods1{
    Scanner sc = new Scanner(System.in);
    int arr[];
    Methods1()
    {

        arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    void Fetching(int index)
    {
        System.out.println(arr[index]);
    }
 }
 class MethodsImplementation{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the elements of the array : ");
         Methods1 ob = new Methods1();
         System.out.print("Enter the index : ");
         int ind = sc.nextInt();
         ob.Fetching(ind);
     }

 }