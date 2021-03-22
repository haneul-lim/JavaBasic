package sky.basic.day04;

import java.util.Scanner;

public class Looop {
	public static void main(String[] args) {
		// while
		// (횟수에 상관없이 특정 조건에 만족할때까지 실행)
		// 특정조건을 만족할때까지 계속해서 주어진 명령을 수행
		
		// 초기식
		// while(조건식) {
		//		반복코드
		//		증감식
		// }
		
		// 조건식이 처음부터 false면
		// while은 코드를 반복실행하지 않음
		// 반면, do-while문은 일단 코드를 먼저 실행하고
		// 조건을 검사하기 때문에 조건식이 false라도 
		// 최소 한 번은 코드를 실행할 수 있음
		
		
		// ex) 1 ~ 10까지 정수출력
		int i = 1;		//초기식
		while(i <= 10) {  // 조건이 참이면 반복실행
			System.out.print(i + " ");
			i += 1;		//증감식
		}
		
		System.out.println();
		
		// ex) 1 ~ 50까지 홀수출력
		int j = 1;
		while(j <= 50) {
			System.out.print(j + " ");
			j += 2;
		}
		// 또는 초기값에 새로운 변수를 선언하지 않고
		// i = 1;로 값을 초기화 한 뒤 사용가능. 
		
		
		System.out.println(); // 줄바꿈용 코드
		
		// ex) 1 ~ 50까지 짝수출력
		int k = 2;
		while(k <= 50) {  
			System.out.print(k + " ");
			k += 2;
		}
		
		System.out.println();
		
		// ex) 1 ~ 100사이 총합 구해서 출력
		int ii = 1;
		int sum = 0;
		while(ii <= 100) {
			sum += ii;        // sum = ii + sum;
			++ii;             // ii += 1;
		}
		System.out.print(sum);
		
		System.out.println();
		
		
		
		// ex) 1 ~ 100사이 총합 구해서 출력 v2
		// 가우스 덧셈공식 이용하면
		// 특정범위 내 모든 수의 합을 편리하게 구할 수 있음
		// 총합 : gauss, 시작범위: i, 끝범위: j
		// gauss = (i + j) * j / 2  ==  (1 + n) * n / 2
		
		// 총합 : sum
		// sum = (i + j) * (j / 2)   
		// sum = (i + j) * (
		
		int n;
		int gauss;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("총합이 궁금한 수를 입력하세요.");
		n = sc.nextInt();
		
		gauss = (1 + n) * n / 2;
		
		System.out.println("입력한 수의 총합은 : " + gauss + "입니다.");
		
		
		
		
	}
}
