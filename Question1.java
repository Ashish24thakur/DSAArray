import java.util.Scanner;

class Raman{
    int myarr1[];
    int myarr2[];
    Raman()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        myarr1 = new int[n];
        myarr2 = new int[n];
        System.out.println("Enter the first array Elements : ");
        for (int i = 0; i < n; i++) {
            myarr1[i] = sc.nextInt();
        }
        System.out.println("Enter the second array elements : ");
        for (int i = 0; i < n; i++) {
            myarr2[i] = sc.nextInt();
        }

    }
    void Check()
    {
        for (int i = 0; i < myarr1.length; i++) {
            int f=0;
            for (int j = 0; j < myarr2.length; j++) {
                if(myarr1[i]<=myarr2[j])
                    f++;
            }
            System.out.print(f + " ");
        }
    }
}
class RamanImplement{
    public static void main(String[] args) {
        Raman ob = new Raman();
        ob.Check();
    }
}