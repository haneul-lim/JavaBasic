package sky.basic.day4;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		// 조건문
		// 일반적으로 프로그램의 실행순서는 순차적임(sequence)
		// 하지만, 특수한 상황이 발생시 선택적으로 코드를
		// 실행해야할 필요가 생기는데 이때, 조건문을 사용함
		
		// if
		// 조건식의 결과가 true와 false일때
		// 각각 주어진 명령문을 실행함
		// if (조건식) {
		// 		조건이 참일때 코드 실행
		// } else {
		//		조건이 거짓일때 코드 실행
		//{

		
		// ex) 1 ~ 100사이 정수 중 짝수를 출력하세요
		for(int i = 1; i <= 100; ++i) {
			if(i % 2 == 0) {	// i가 짝수라면
				System.out.print(i + " ");
			}
		}	// for
		
		// ex) 1 ~ 100사이 정수 중 짝수라면 "짝수입니다"를
		// 홀수면 "홀수입니다"를 출력하세요
		for(int i = 0; i <= 100; ++i) {
			if(i % 2 == 0) {
				System.out.println(i + "짝수입니다");
			} else {
				System.out.println(i + "홀수입니다");
			}
		}	//for
		
		
		//사용자가 연봉salary과 결혼 여부isMarried를
		// (isMarried 결혼을 했으면 1, 결혼을 안했으면 0)
		// 보통 변수명에 is를 붙이면 0/1 값을 다룬다는 통상적 의미를 가짐
		// (데이터 타입이 boolean인 것은 아님. 값 자체가 0 또는 1임)
		// 입력하면 다음의 세금율에 의해 납부해야 할 세금tax을
		// 계산하는 프로그램을 작성하세요
		// 미혼인 경우 : 연봉 3000미만 - 10%,  연봉 3000이상 - 25%
		// 결혼한 경우 : 연봉 6000미만 - 15%,  연봉 6000이상 - 35%
		int salary;
		int isMarried;
		double tax;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연봉을 숫자만 입력하세요.(단위: 만원) : ");
		salary = sc.nextInt();
		System.out.println("결혼한 경우 1, 미혼인 경우 0 입력하세요. : ");
		isMarried = sc.nextInt();
		
		if (isMarried == 0)	//미혼
			if(salary < 3000) tax = salary * 0.1;
			else tax = salary * 0.25;
		else	//기혼
			if(salary < 6000) tax = salary * 0.15;
			else tax = salary * 0.35;
		
		// if문의 조건문이 한 줄이라면 {}는 생략 가능.
		
		
		String fmt = "연봉은 %d이고, 결혼여부는 %d일때\n" + 
					 "세금은 %.1f입니다";
		System.out.printf(fmt, salary, isMarried, tax);
		
	}	//main

}	//class
