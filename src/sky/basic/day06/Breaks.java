package sky.basic.day06;

public class Breaks {
    public static void main(String[] args) {
        // 반복문 제어하기 break, continue
        // break : 반복문 실행을 중단하는 명령

        // ex) 1 ~ 100까지의 총합을 구해는 프로그램 작성
        // 단, 총합이 500을 넘는 경우, 실행을 중단함
        int sum = 0;
        int i;
        // 전역변수에서 선언한 i는 for문 안에서도 밖에서도 사용가능하나
        // 지역변수로 for문 안에서 선언한 i는 for문의 안에서만 사용 가능.

        for(i = 0; i <= 100; ++i) {
            sum += i;
            if(sum >= 500) {
                break;
            }
            // 부분합이 500이상인 경우 반복실행을 중지함
        }

        System.out.println("총합 : " + sum);
        System.out.println("중지지점 : " + i);


        // ex) 주사위의 눈이 6이 나올때까지 굴려보는 프로그램을 작성
        // 또한, 6이 나올때까지의 굴린 횟수도 같이 출력
        // math.random() 과 break문을 사용


        int dice = 0;
        int count = 0;

        while(true) {
            dice = (int)(Math.random() * 6) + 1;
            // (최대값 - 최소값) + 1 -> (6 - 0) + 1
            // 난수의 최소값은 항상 0이라고 생각하면 됨.
            // 1부터 시작이 안되어 +1을 마지막에 붙여주는 것.
            ++count;
            System.out.print(dice + " ");
            if (dice == 6) break;
        }
        System.out.println("굴린 총 횟수: " + count);





    }
}
