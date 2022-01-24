import java.util.Scanner;

class Gla{
    int start;
    int end;
    void setValue(int a, int b)
    {
        start = a;
        end = b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of meetings : ");
        int n = sc.nextInt();
        Gla ob[] = new Gla[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter start time : ");
            int start = sc.nextInt();
            System.out.println("Enter End time : ");
            int end = sc.nextInt();
            ob[i] = new Gla();
            ob[i].setValue(start,end);
        }
        boolean f=true;
        for (int i = 0; i < n-1; i++) {
            if(ob[i].end>ob[i+1].start)
            {
                f=false;
                break;
            }
        }
        if(f)
            System.out.println("No glitch");
        else
            System.out.println("Glitch found");

    }
}