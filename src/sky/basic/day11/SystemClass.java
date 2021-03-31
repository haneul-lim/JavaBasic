package sky.basic.day11;

public class SystemClass {
    public static void main(String[] args) {
        // System 클래스
        // 표준입출력과 관련된 실행시스템과 관련된 필드와 메서드 제공
        // static으로 선언되어 있음 - 객체생성 필요 없음
        long start = System.currentTimeMillis();

        double sum = 1;
        for(int i = 1; i < 1000000000; ++i)
            sum *= i;
        System.out.println(sum);

        long end = System.currentTimeMillis();
        System.out.println("소요시간 : " + (end - start) );
        // 양 끝에 start와 end 커런트타임밀리세컨을 넣어주면
        // 프로그램에 소요된 시간을 확인 할 수 있음




    }
}
