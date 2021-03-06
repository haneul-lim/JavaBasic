package sky.basic.day06;

public class EX03 {
    public static void main(String[] args) {
        // psvm + tab -> main 함수 생성
        // sout + tab -> println 생성
        // ctrl + d -> 줄 복사 / ctrl + y -> 줄 삭제
        // ctrl + shift +f10 -> 코드 실행
        // shift + alt + 방향키 -> 줄바꿈
        // ctrl + / -> 주석처리

        // 배열 다루는 예제 1
        char[] letter;  // 배열변수 선언
        letter = new char[3];   // 문자 3개를 저장할 수 있는 배열 정의 (크기지정)

        letter[0] = 'a';
        letter[1] = 'b';
        letter[2] = 'c';
        // letter 배열의 각 요소에 a, b, c 문자를 저장함

        // char[] letter = {'a', 'b', 'c'};
        // 위 5줄 코드를 한 줄로 작성하는 방법 (배열 변수 선언 및 배열 요소 저장)

        for(int i = 0; i < 3; ++i) {
            System.out.print(letter[i] + ", ");
        }


        // 배열 다루는 예제 2
        double[] a = {1.1, 2.2, 3.3};
        System.out.println(a[0] + " " + a[1] + " " + a[2]);

        a[1] = a[2];
        // 3번째 요소값을 2번째 요소에 대입
        System.out.println(a[0] + " " + a[1] + " " + a[2]);


        // 배열 다루는 예제 3
        int[] sampleArray = new int[10];
        // 배열의 인덱스 범위 : 0 ~ 9 (10개)
        
        //for(int idx = 1; idx <= sampleArray.length; ++idx){ 
        //    sampleArray[idx] = 3*idx; }
            // 반복문 인덱스 범위 : 1 ~ 10 (10개)
            // => ArrayIndexOutOfBoundsException 예외 발생!
            // 인덱스 크기를 잘못 지정해서 실제 존재하지 않는 배열의 요소를 다루려고 하여 발생한 오류

        for(int idx = 1; idx < sampleArray.length; ++idx) {
            sampleArray[idx] = 3 * idx;
        }   // 오류 없이 출력하려면 idx <= 에서 =을 빼야함
        
        // 배열변수명.length : 배열의 크기를 알려주는 특수한 변수
        // (배열객체를 사용하면 기본적으로 제공되는 부수적 기능중 하나임.)
        // [][][][][] [][][][][]    // new int[]    // 실제는 가로가 아니라 세로로 배치됨
        // [][3][6][9][12] [15][18][21][24][27]

        for(int idx = 0; idx < sampleArray.length; ++idx) {
            System.out.print(sampleArray[idx] + ", ");
        }


        // 배열에 정의하고 값 저장하기 1
        int[] num1 = new int[10];   // 정수 10개를 담을 수 있는 배열변수 num1 을 선언
//        num1[0] = 1;
//        num1[1] = 2;
//        num1[2] = 3;
//        num1[3] = 4;
//        num1[4] = 5;
//        num1[5] = 6;
//        num1[6] = 7;
//        num1[7] = 8;
//        num1[8] = 9;
//        num1[9] = 10;

//        System.out.print(num1[0]);
//        System.out.print(num1[1]);
//        System.out.print(num1[2]);
//        System.out.print(num1[3]);
//        System.out.print(num1[4]);
//        System.out.print(num1[5]);
//        System.out.print(num1[6]);
//        System.out.print(num1[7]);
//        System.out.print(num1[8]);
//        System.out.println(num1[9]);

        //for(int i = 1; i < num1.length; ++i) {  // i < 10 대신 i < num1.length 라 써도 동일
        //    num1[i - 1] = i;
        //}
        for(int i = 0; i < num1.length; ++i) {
            num1[i] = i + 1;    // 인덱스보다 값을 조정하는게 좋음
        }
        // [1][2][3][4][5] [][][][][]

        for(int i = 0; i < num1.length; ++i) {
            System.out.println(num1[i]);
        }


        // 배열에 정의하고 값 저장하기 2
        // 0 2 4 6 8 10 12 14 16 18 20
        int[] num2 = new int[11];

        for(int i = 0; i < num2.length; ++i){
            num2[i] = i * 2;
            System.out.print(num2[i] + " ");
        }
        System.out.println(" ");

        // 배열에 정의하고 값 저장하기 3
        // 1 4 9 16 25 36 49 64 81 100
        int[] num3 = new int[10];

        for(int i = 0; i < num3.length; ++i) {
            // num3[i] = (i + 1) * (i + 1);
            num3[i] = (int)Math.pow((i + 1), 2);    // Math.pow(밑수, 지수)는 값을 double로 반환함.
            System.out.print(num3[i] + " ");
        }
        System.out.println(" ");


        // 배열에 정의하고 값 저장하기 4
        // 0 0 0 0 0 0 0 0 0 0
        int[] num4 = new int[10];
        // 참조자료형 객체를 선언했을 때 값을 넣지 않아도 값이 출력됨
        // -> Why? 초기값이 미리 할당되기 때문

        for(int i = 0; i < num4.length; ++i) {
            System.out.print(num4[i] + " ");
        }
        System.out.println(" ");
        // *참고 : 참조자료형 변수는 new 연산자로 객체 생성시 미리 변수에 기본값이 할당됨
        // 숫자형 : 0, 객체형: null


        // 배열에 정의하고 값 저장하기 5
        // 1 4 9 16 9 7 4 9 11
        int[] num5 = {1,4,9,16,9,7,4,9,11};

        for(int i = 0; i < num5.length; ++i) {
            System.out.print(num5[i] + " ");
        }
        System.out.println(" ");


        // 다음값을 입력했을 때 아래와 같이 출력하세요
        // 입력값 : 0  11  2  33  4  55  6  77  8  99
        // 출력값 : 99  8  77  6  55  4  33  2  11  0

        int[] num6 = {0, 11, 2, 33, 4, 55, 6, 77, 8, 99};

        for(int i = 9; i >= 0; --i) {
            System.out.print(num6[i] + " ");
        }

        //for(int i = 0; i < num6.length; ++i) {
        //    System.out.print(num6.length -1 - i + " ");
        //}

        for(int i = (num6.length - 1); i >= 0; --i) {
            System.out.print(num6[i] + " ");
        }
        // 인덱스를 감소시키면서 배열을 역순으로 출력
        System.out.println(" ");





    }

}
