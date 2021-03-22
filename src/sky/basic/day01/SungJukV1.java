package sky.basic.day01;


/**
 * 
 * @author sky
 * @category javabasic
 * @version 1.0 자바프로그램 기초 - 성적처리 프로그램
 * 
 *          입력 : 이름, 국어, 영어, 수학
 * 
 * 
 *          처리 : 총점, 평균, 학점
 * 
 * 
 *          출력 : 이름, 국어, 영어, 수학, 총점, 평균, 학점
 * 
 * 
 *          단, 학점은 수,우,미,양,가로 표현
 *
 */

public class SungJukV1 {
	public static void main(String[] args) {
		// 변수선언
		String name = "임하늘";
		int kor = 95;
		int eng = 85;
		int mat = 75;
		int tot = kor + eng + mat;
		double avg = tot / 3;
		char grd = '우';

		// 처리(변수선언에 함께)

		// 결과 출력

		// System.out.print("이름 : ");
		// System.out.println(name);
		System.out.printf("이름: %s\n", name);
		System.out.printf("국어: %d, 영어: %d, 수학: %d\n", kor, eng, mat);
		System.out.printf("총점: %d, 평균: %f, 학점: %s\n", tot, avg, grd);

		
	}
}
