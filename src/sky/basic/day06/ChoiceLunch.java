package sky.basic.day06;

import java.util.Random;
    // art + enter => 자동으로 불러옴

public class ChoiceLunch {
    public static void main(String[] args) {
        // 배열을 이용한 점심메뉴 고르기
        String[] menu = {"김밥", "샐러드", "짜장면", "라면", "햄버거", "우동", "돈까스"};
        // 점심메뉴를 배열로 정의
        
        Random rnd = new Random();
        //int idx = rnd.nextInt(7);   // n-1 범위까지 되니 7을 써주면 됨
        // 난수 생성 1
        // 메뉴는 7개이므로 idx 변수의 범위는 0 ~ 6


        // Math.random를 이용해서 실제 난수가 만들어지는 원리를 알아봄
        double magic = Math.random();
        System.out.println(magic);

        // 0 ~ 9 사이 임의의 난수 생성
        System.out.println(magic * 10);
        System.out.println((int)magic * 10);

        // 0 ~ 99 사이 임의의 난수 생성
        System.out.println((int)(magic * 100));

        // 0 ~ (n-1) 범위 난수 : random * b
        // 0 ~ 99(100-1) 범위 난수
        System.out.println( magic * 100 );

        // a ~ b 범위 난수 : random % (b + 1 - a) + a   // 우선 이식은 쓰지 않음

        // a 이상 ~ b 미만 범위 난수
        // -> (random * (최대값 - 최소값)) + 최소값
        // 1 이상 ~ 45 미만 범위 난수
        System.out.println((int)(magic * (45 - 1) + 1));

        // 메뉴출력을 위한 난수 생성 표현식
        int idx = (int)(Math.random() * 7);

        System.out.println(menu[idx]);
        // 생성된 난수로 선택된 메뉴 출력





    }
}
