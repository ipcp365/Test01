import java.util.Arrays;
import java.util.Scanner;

public class JavaTest{
    public static void main(String[] args) { //psvm 치면 자동완성

        JavaTest a = new JavaTest();
        Scanner sc = new Scanner(System.in);


        String gram1 = "";
        String gram2 = "";
        System.out.println("첫번째 값을 입력 하세요.");
        gram1 = sc.next().toString();
        System.out.println("두번째 값을 입력 하세요.");
        gram2 = sc.next().toString();

        char[] gramC1 = gram1.toCharArray();
        char[] gramC2 = gram2.toCharArray();

        Arrays.sort(gramC1);
        Arrays.sort(gramC2);

        StringBuffer arr1 = new StringBuffer();
        StringBuffer arr2 = new StringBuffer();

        for (int i = 0; i < gramC1.length; i++) {
            arr1.append(gramC1[i]);
        }
        System.out.println(arr1);


        for (int i = 0; i < gramC2.length; i++) {
            arr2.append(gramC2[i]);
        }
        System.out.println(arr2);


        if (arr1.toString().equals(arr2.toString())) {
            System.out.println("아나그램 입니다.");
        } else {
            System.out.println("아나그램이 아닙니다.");
        }
    }

}
