import java.util.Scanner;

class Methods4{
    int arr[];
    Methods4()
    {
        Scanner sc = new Scanner(System.in);
        arr= new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    void AllDelete()
    {
        arr = null;
    }
    void Display()
    {
        for (int j:
             arr) {
            System.out.println(j);
        }
    }
}
class Methods4Implementation{
    public static void main(String[] args) {
        System.out.println("Enter the elements of the array : ");
        Methods4 ob = new Methods4();
        ob.AllDelete();

    }

}