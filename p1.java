import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {

        int a,b,c,d;
        int result;

        Scanner s= new Scanner(System.in);
        System.out.print("첫 번째 계산할 값:");
        a = s.nextInt();
        System.out.print("두 번째 계산할 값:");
        b = s.nextInt();
        System.out.print("세 번째 계산할 값:");
        c = s.nextInt();
        System.out.print("네 번째 계산할 값:");
        d = s.nextInt();

        result = a+b+c+d;
        System.out.println(a+"+"+b+"+"+c+"+"+d+"="+result);
    }
}
