import java.util.Scanner;

public class Ex02_03 {

    public static void main(String[] args) {
        int a,b;
        int result;

        Scanner s=new Scanner(System.in);
        System.out.printf("첫번쨰 함수를 입력하세요 ==>");
        a=s.nextInt();
        System.out.println("두번쨰 함수를 입력하세요 ==>");
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
//설명이 나오는 Ex02_02의 응용 코드