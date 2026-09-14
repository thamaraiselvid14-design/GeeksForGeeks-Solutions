import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // code here
        int c = a >>b;
        int d = a <<b;
        System.out.print(c +" " );
        System.out.print(d);

        }
}