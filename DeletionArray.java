import java.util.Scanner;

class Methods2{
    int arr[];
    Methods2()
    {
        arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    void Deletion(int index)
    {
        try{
            arr[index] = 0;
        }
        catch (ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Array index is not valid");
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
class Methods2Implementation{
    public static void main(String[] args) {
        Methods2 ob = new Methods2();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index value : ");
        int ind = sc.nextInt();
        ob.Deletion(ind);
        ob.Display();
    }

}