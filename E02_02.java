import java.util.Scanner;

public class E02_02 {

    public static void main(String[] args) {
        int a,b;
        int result;

        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();

        result=a+b;
        System.out.println(a+"+"+b+"="+result);
        result=a-b;
        System.out.println(a+"-"+b+"="+result);
        result=a*b;
        System.out.println(a+"*"+b+"="+result);
        result=a/b;
        System.out.println(a+"/"+b+"="+result);
    }
}
//Scanner 구문을 사용하여 실행자가 정해서 넣는 뎃셈 뺼셈 곱하기 나누기 코드