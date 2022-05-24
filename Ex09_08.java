public class Ex09_08 {
    public static void main(String[] args) {
        String str1 = "Java prograimming";
        String str2 = "Java IT CookBook";//문자열 변수 초기화

        System.out.println("원 문자열1 ==> ["+str1+"]");
        System.out.println("원 문자열2 ==> ["+str2+"]");

        System.out.println(str1.compareTo(str2));//문자열 비교
        System.out.println(str1.contains("Java"));//Java 들어간지 확인
    }
}
