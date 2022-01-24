import java.util.Scanner;

class MethodsArray{
    int arr[];
    int total;
    MethodsArray()
    {
        System.out.println("Enter the total number of elements : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        total = n;
        arr = new int[100];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
    void Display()
    {
        for (int i = 0; i < total; i++) {
            System.out.println(arr[i]);

        }
    }
    void Search(int value)
    {
        for(int i=0;i<total;i++)
        {
            if(arr[i]==value)
            {
                System.out.println("Element is found");
                return;
            }
        }
        System.out.println("Element not found");
    }
    void Insert(int index , int value)
    {
        for (int i = total-1; i >= index ; i--) {
            arr[i+1] = arr[i];
        }
        arr[index] = value;
        total += 1;
    }
    void Delete(int index) {
        for (int i = index; i < total; i++) {
            arr[i] = arr[i + 1];
        }
        total -= 1;
    }
    void DeleteByValue(int value)
    {
        int f=0;
        for (int i = 0; i < total; i++) {
            if(arr[i]==value)
            {
                f=i;
                break;
            }
        }
        for (int j = f; j < total; j++) {
            arr[j] = arr[j+1];
        }
        total -= 1;
    }
}
class ImlementationMethods{
    public static void main(String[] args) {
        MethodsArray ob = new MethodsArray();
        int ch;
        do{
        System.out.println("1) Display Array Elements \n2) Search element in array \n3) Delete Element by index \n4) Delete element by value \n5) Insert Element");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        //int ch;

            switch (choice) {
                case 1: {
                    System.out.println("Array elements is : ");
                    ob.Display();
                    break;
                }
                case 2: {
                    System.out.print("Enter the value you want to search : ");
                    int val = sc.nextInt();
                    ob.Search(val);
                    break;
                }
                case 3: {
                    System.out.print("Enter the index value : ");
                    int ind = sc.nextInt();
                    ob.Delete(ind);
                    break;
                }
                case 4: {
                    System.out.print("Enter the value you want to delete : ");
                    int val = sc.nextInt();
                    ob.DeleteByValue(val);
                    break;
                }
                case 5:
                    System.out.print("Enter the index : ");
                    int ind = sc.nextInt();
                    System.out.print("Enter the value : ");
                    int val = sc.nextInt();
                    ob.Insert(ind, val);
                    break;

                default: {
                    System.out.println("Incorrect choice");
                    break;
                }
            }
            System.out.println("1) You want to go back home page \n2) Exit");
            ch = sc.nextInt();
        }while(ch==1);
        System.out.println("Thank You!");
    }

}