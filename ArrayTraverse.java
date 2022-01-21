import java.util.Scanner;

class Function{
    int arr[];
    Function()
    {
        arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i< arr.length;i++)
            arr[i] = sc.nextInt();
    }
    void Display()
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
class FunctionApply{
    public static void main(String[] args) {

        Function ob = new Function();
        ob.Display();
    }


}