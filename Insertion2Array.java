import java.util.Scanner;
class Insertion2 {
    int total;
    int arr[];

    Insertion2() {
        System.out.println("Enter the total number of elements : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        total = n;
        arr = new int[100];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void Insert(int ind, int value) {
        //System.out.println(total);
        for (int i = total - 1; i >= ind; i--) {
            arr[i + 1] = arr[i];
        }
        arr[ind] = value;
        total += 1;
        System.out.println(total);
    }

    void Display2() {
        for (int i = 0; i < total; i++) {
            System.out.println(arr[i]);
        }
    }
}
    class InsertImplementation {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Insertion2 ob = new Insertion2();
            System.out.println("Elements of the array : ");
            ob.Display2();
            System.out.print("Enter the index value  : ");
            int index = sc.nextInt();
            System.out.print("Enter the value : ");
            int value = sc.nextInt();
            ob.Insert(index, value);
            System.out.println("After inserting array elements is : ");
            ob.Display2();
        }
    }

