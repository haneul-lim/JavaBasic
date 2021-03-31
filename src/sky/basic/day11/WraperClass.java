package sky.basic.day11;

import java.util.Scanner;

public class WraperClass {
    public static void main(String[] args) {
        // wraper 클래스
        // 프로그램에 따라 기본 자료형의 데이터를 참조자료형으로
        // 바꿔 취급해야 할 때가 있음
        // 메서드의 매개변수가 객체형을 요구하면 그에 따라 객체형을 사용해야 함
        // 기본자료형 변수를 참조자료형 변수로 변환하는 클래스를
        // 래퍼클래스라 함
        // int -> Integer, double -> Double
        // char -> Character, boolean -> Boolean

        int a = 123;
        Integer b = new Integer(a);
        // 박싱 :  기본자료형 변수를 참조자료형 변수로 변환

        System.out.println(a);
        System.out.println(b);
        // 박싱을 통해 클래스의 장점을 활용할 수 있는 변수로 변환
        // a는 변수로 끝나지만 b 변수의 Integer클래스화를 통해 메서드를 사용할 수 있음
        // (큰 기능은 없음. 활용도가 높진 않음)

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 하나 입력하세요");
        int num = sc.nextInt();
        // 정수 입력값을 정수로만 받을 수 있음
        System.out.println("숫자를 하나 입력하세요");
        int num1 = Integer.parseInt(sc.next());
        // 문자 입력값을 정수로 변환함

        
        int c = b.intValue();
        // 언박싱 : 참조자료형 변수를 기본자료형 변수로 변환

        Integer d = 456;    // new Integer 사용안함
        // 이렇게 가능한 이유는 자동 박싱 적용
        int e = d;          // intValue 사용안함
        // 자동 언박싱 적용


        // 10진수를 2진수로 변환하기
        // 4 => 100
        System.out.println(Integer.toBinaryString(4));

        // 두 수를 비교해서 큰지, 같은지, 작은지를 출력
        // compareTo(수1, 수2)
        // 결과 : 1, 0 , -1
        System.out.println( b.compareTo(d) );

        System.out.println( Integer.compare(b, d) );




    }
}
