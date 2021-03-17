package sky.basic.day02;

import java.util.Scanner;

/**
 * 
 * @author sky
 * @category javabasic
 * @version 1.1
 * 
 *          자바프로그램 기초 - 성적처리 프로그램
 * 
 *          이름과 성적데이터를 키보드로 직접 입력받아 처리 처리결과 출력시 printf 메서드 사용
 * 
 * 
 *
 */

public class SungJukV1b {
	public static void main(String[] args) {
		// 변수선언
		String name; // 이름
		int kor; // 국어점수
		int eng; // 영어점수
		int mat; // 수학점수
		int tot; // 총점
		double avg; // 평균
		char grd; // 학점

		// 처리
		Scanner sc = new Scanner(System.in);
		// 키보드를 이용해서 성적데이터를 입력받기 위해
		// Scanner 클래스를 초기화함
		// Scanner+컨트롤+스페이스 하면 상단에
		// import java.util.Scanner; 자동으로 입력되어짐.

		// java API 문서를 보려면 해당 클래스에 마우스를 대면 확인가능
		// 다른 방법은 오라클 홈페이지 통해 가능

		System.out.print("이름은? ");
		name = sc.next();
		// 키보드로 문자데이터를 입력받아 name 변수에 대입

		System.out.print("국어는? ");
		kor = sc.nextInt();
		// 키보드로 숫자데이터를 입력받아 kor 변수에 대입

		System.out.print("영어는? ");
		eng = sc.nextInt();

		System.out.print("수학은? ");
		mat = sc.nextInt();

		// 총점, 평균 처리
		tot = kor + eng + mat;
		avg = tot / 3;
		grd = '미';

		// 출력
		// System.out.println(name);
		// System.out.println(kor);
		// System.out.println(eng);
		// System.out.println(mat);
		// System.out.println(tot);
		// System.out.println(avg);
		// System.out.println(grd);

		System.out.printf("이름: %s, 국어: %d, 영어: %d, 수학: %d\n총점: %d, 평균: %.1f, 학점: %c\n", name, kor, eng, mat, tot, avg,
				grd);

		String finish = "이름: %s, 국어: %d, 영어: %d, 수학: %d\n총점: %d, 평균: %.1f, 학점: %c\n";
		System.out.printf(finish, name, kor, eng, mat, tot, avg, grd);

	}

}
