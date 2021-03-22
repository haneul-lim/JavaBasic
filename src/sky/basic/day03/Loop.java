package sky.basic.day03;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		// 반복문 loop
		
		// 프로그램 내에서 똑같은 명령을 지정한 횟수만큼
		// 반복하여 수행하도록 작성하는 명령문
		// 사용빈도가 높은 명령어들 중 하나
		
		// for(횟수지정후 반복), while(조건을 만족할때까지 반복)
		
		// 인사말 출력 V1 - 1번만 출력
		System.out.println("Hello, World!");
		
		// 인사말 출력 V2 - 3번만 출력
		System.out.println("Hello, World!");
		System.out.println("Hello, World!");
		System.out.println("Hello, World!");
		
		// 인사말 출력 V2.5 - 5번만 출력
		System.out.println("Hello, World!");
		System.out.println("Hello, World!");
		System.out.println("Hello, World!");
		System.out.println("Hello, World!");
		System.out.println("Hello, World!");

		// 인사말 출력 V3 - 대상변경후 5번 출력
		// World -> Java
		System.out.println("Hello, Java!");
		System.out.println("Hello, Java!");
		System.out.println("Hello, Java!");
		System.out.println("Hello, Java!");
		System.out.println("Hello, Java!");
	
		// 반복횟수에 따라 코드를 복붙하기에 번거롭고
		// 반복하는 내용이 바뀌면 수정하기도 번거롭고 귀찮음
		
		// for문
		// 초기식, 조건식, 증감식을 이용해서 특정코드를
		// 지정한 횟수만큼 반복하도록 작성하는 명령문
		
		// for(초기식;조건식;증감식) {
		//     반복할 코드
		// }
		// ex) 1 ~ 10까지 정수출력 v1 - 반복문 사용x
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");

		// ex) 1 ~ 10까지 정수출력 v2 - 반복문 사용o
		//for(int i = 1; i <=10; i+=1) {
		for(int i = 1; i <=10; ++i) {
			System.out.println( i );
		}
		// 먼저 초기값인 i = 1이 조건식을 만족하면 아래 반복코드를 실행
		// 이후 증감식에 따라 i+=1값이 되고 조건식이 만족할때까지 반복실행
	
		
		// ex) 1 ~ 50사이 홀수출력
		for(int i = 1; i <= 50; i+=2) {
			//System.out.println( i );
			System.out.print( i + " ");
		}
		
		System.out.println();
		
		// ex) 1 ~ 50사이 짝수출력
		for(int i = 2; i <= 50; i+=2) {
			//System.out.println( i );
			System.out.print( i + " ");
		}
		
		System.out.println();
		
		// ex) 1 ~ 100사이 총합 구해서 출력
		int result = 0;
		for(int i = 1; i <= 100; ++i) {
			result += i;
		}
		System.out.println("1 ~ 100 사이 합 : " + result);
		
		/*
		
		// ex) 1 ~ 100사이 총합 구해서 출력 v2
		// 가우스 덧셈공식 이용
		int n;
		int gauss;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("총합이 궁금한 수를 입력하세요.");
		n = sc.nextInt();
		
		gauss = (1+n) * n / 2;
		
		System.out.println("입력한 수의 총합은 : " + gauss + "입니다.");
		*/
		

	}

}
