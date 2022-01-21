import java.util.Scanner;

class Methods{
    int arr[];
    Methods()
    {
        arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    void Insert(int index , int value)
    {
        try {
            if(arr[index]==Integer.MIN_VALUE) {
                arr[index] = value;
            }
            } catch (ArrayIndexOutOfBoundsException obj) {
                System.out.println("Array Index is not valid");
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
class MethodImplementation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Methods ob = new Methods();
        ob.Display();
        System.out.print("Enter the index where you want to insert the value : ");
        int ind = sc.nextInt();
        System.out.print("Enter the value : ");
        int val = sc.nextInt();
        ob.Insert(ind,val);
        System.out.println("After inserting array is : \n");
        ob.Display();
    }

}