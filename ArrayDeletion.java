import groovy.json.JsonOutput;

import java.util.Scanner;

class DeletionMethods{
    int arr[];
    DeletionMethods()
    {
        Scanner sc = new Scanner(System.in);
        arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    void Delete(int index)
    {
        try{
            int i;
            for (i = index; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            arr[i] = 0;

        }catch (ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Array index is invalid");
        }
    }
    void Display()
    {
        for (int j:
             arr) {
            System.out.println(j);
        }
    }
}
class DeletionImplementation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array : ");
        DeletionMethods ob = new DeletionMethods();
        System.out.println("Array elements is : ");
        ob.Display();
        System.out.print("Enter the index value : ");
        int ind = sc.nextInt();
        //System.out.println("Enter the value");
        ob.Delete(ind);
        System.out.println("After delete elements array is : ");
        ob.Display();



    }


}