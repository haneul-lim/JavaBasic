package sky.basic.day03;

import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
		// ***7번문제
		
		// 7-가) 3 + 4.5 * 2 + 27 / 8 
		// 예상값 15 , 결과값 15.0
		System.out.println(3 + 4.5 * 2 + 27 / 8);
		
		// 7-나) true || false && 3 < 4 || !(5 == 7)
		// 예상값 true , 결과값 true
		System.out.println(true || false && 3 < 4 || !(5 == 7));
		
		// 7-다) true || (3 < 5 && 6 >= 2)
		// 예상값 true , 결과값 true
		System.out.println(true || (3 < 5 && 6 >= 2));
		
		// 7-라) !true > 'A'
		// 예상값 X(비교대상이 잘못되었음) , 결과값 비교대상 오류
		//System.out.println(!true > 'A');
		// 잘못된 비교대상으로 오류
		
		// 7-마) 7 % 4 + 3 - 2 / 6 * 'Z'
		// 예상값 X(숫자와 문자의 비교) , 결과값 6
		System.out.println(7 % 4 + 3 - 2 / 6 * 'Z');
		// 7 % 4 + 3 - 2 / 6 * 90 = 6
		
		// 단일문자('')를 수식에 사용하면
		// 자동으로 숫자형으로 바뀜
		// 숫자형으로 변환시 ASCII코드값을 참조함
		// 0 : 48, A : 65, a : 97
		
		
		// 7-바) 'D' + 1 + 'M' % 2 / 3
		// 예상값 69, 결과값 69
		System.out.println('D' + 1 + 'M' % 2 / 3);
		// 68 + 1 + 77 % 2 / 3 = 69
		// 아스키코드로 자동 치환 되는듯
		
		// 7-사) 5.0 / 3 + 3 / 3  
		// 예상값 17.66666, 결과값 2.666666666666667
		System.out.println(5.0 / 3 + 3 / 3 );
		
		// 7-아) 53 % 21 < 45 / 18  
		// 예상값 false , 결과값 false
		System.out.println(53 % 21 < 45 / 18);
		
		// 7-자) (4 < 6) || true && false || false && (2 > 3)
		// 예상값 true, 결과값 true
		System.out.println((4 < 6) || true && false || false && (2 > 3));
		
		// 7-차) 7 - (3 + 8 * 6 + 3) - (2 + 5 * 2)
		// 예상값 -59 , 결과값 -59
		System.out.println(7 - (3 + 8 * 6 + 3) - (2 + 5 * 2));
		
		
		// ***8번 문제
		
		//가.  System.out.print( " May 13, 1988 fell on day number ");
		// 예상값 May 13, 1988 fell on day number , 
		// 결과값 May 13, 1988 fell on day number 
		System.out.print( " May 13, 1988 fell on day number ");
		
		
		// 아래식은 특정연도 -1의 12월 31일의 요일 출력
		// 0 : 일, 1 : 월, ... , 6 : 토
		// 따라서, 특정연도의 1월 1일의 요일을 출력하려면
		// 계산식 결과에 +1을 해주면 됨
		//나.  System.out.println( ( (13 + (13 * 3 - 1) / 5 + 1988 % 100  
		//            + 1988 % 100 / 4 + 1988 / 400
		//            - 2 * (1988 / 100) ) % 7 + 7) % 7 );
		// 예상값 X, 결과값 5 (금)
		System.out.println( ( (13 + (13 * 3 - 1) / 5 + 2021 % 100  
	            + 2021 % 100 / 4 + 2021 / 400
	            - 2 * (2021 / 100) ) % 7 + 7) % 7 );
		// 2021년도 결과값 4 
		// 2020년 12월 31일의 요일이 결과값으로 나옴. 따라서 막날은 목요일.
		
		//다.  System.out.print( " Check out this line  ");
		// 예상값  Check out this line  , 결과값  Check out this line  
		System.out.print( " Check out this line  ");
		
		//라.  System.out.println( " //hello there " + '9' + 7 );
		// 예상값  //hello there 97, 결과값  //hello there 97
		System.out.println( " //hello there " + '9' + 7 );
		
		//마.  System.out.print( 'H' + 'I' + " is " + 1 + "more example" );
		// 예상값 145 is 1more example, 결과값 145 is 1more example
		// (아스키코드 치환 H = 72, I = 73)
		System.out.print( 'H' + 'I' + " is " + 1 + "more example" );
		// H와 I 사이 산술연산자로 인해
		// H와 I가 숫자형으로 변환되어 + 연산이 수행됨
		
		
		//바.  System.out.print( 'H' + 6.5 + 'I' + " is " + 1 + "more example" );
		// 예상값 151 is 1more example, 결과값 151.5 is 1more example
		System.out.print( 'H' + 6.5 + 'I' + " is " + 1 + "more example" );
		
		//사.  System.out.print( "Print both of us", "Me too" );
		// 예상값 Print both of us Me too, 결과값 에러(""값이 2개일수 없음?)
		// System.out.print( "Print both of us", "Me too" );
		
		//아.  System.out.print( "Reverse " + 'I' + 'T' );
		// 예상값 Reverse IT, 결과값 Reverse IT
		System.out.print( "Reverse " + 'I' + 'T' );
		
		//자.  System.out.print( "No! Here is" + 1 + "more example" );
		// 예상값 No! Here is1more example, 결과값 No! Here is1more example
		System.out.print( "No! Here is" + 1 + "more example" );
		
		//차.  System.out.println( "Here is " + 10 * 10) ) // that’s 100 ;
		// 예상값 Here is 100, 결과값 Here is 100
		System.out.println( "Here is " + 10 * 10); // that’s 100 ;
		//
		
		//카.  System.out.println( "Not x is " + true ); // that’s true.
		// 예상값 Not x is true, 결과값 Not x is true
		System.out.println( "Not x is " + true ); // that’s true.
		
		//타.  System.out.print(  );
		// 예상값 오류, 결과값 오류
		//System.out.print(  );
		// 괄호안에 전달값이 필요한데 없어서
		// 출력할 대상이 지정되지 않았으므로 오류발생 
		
		//파.  System.out.println;
		// 예상값 오류, 결과값 
		//System.out.println;
		// 괄호가 필요
		
		//하.  System.out.print( "How about this one" ++ '?' + 'Huh?' );
		// 예상값 How about this one??Huh?, 결과값 오류(증감연산자 사용)
		//System.out.print( "How about this one" ++ '?' + 'Huh?' );
		
		
		// ***9번 문제
		//가.   true && false && true || true   
		// 예상값 true , 결과값 true
		System.out.println(true && false && true || true );
		
		//나. true || true && true && false    
		// 예상값 true, 결과값 true
		System.out.println(true || true && true && false);
		
		//다.   (true && false) || (true && ! false) || (false && !false) 
		// 예상값 true, 결과값 true
		System.out.println((true && false) || (true && ! false) || (false && !false));
		
		//라.   (2 < 3) || (5 > 2) && !(4 == 4) || 9 != 4  
		// 예상값 true, 결과값 true
		System.out.println((2 < 3) || (5 > 2) && !(4 == 4) || 9 != 4);
		
		//마.   6 == 9 || 5 < 6 && 8 < 4 || 4 > 3
		// 예상값 true, 결과값 true
		System.out.println(6 == 9 || 5 < 6 && 8 < 4 || 4 > 3);
		
		
		// ***10번 문제
		//가.   27 / 13 + 4 
		//나.   27 / 13 + 4.0  
		//다.   42.7 % 3 + 18                           
		//라.   (3 < 4) && 5 / 8
		//마.   23 / 5 + 23 / 5.0                         
		//바.   2.0 + 'a'    
		//사.   2 + 'a'                                    
		//아.   'a' + 'b'    
		//자.   'a' / 'b'                                    
		//차.   'a' && ! 'b'  
		//카.   ( double ) 'a' / 'b'
		
		// 유효한 표현식 : 가(int), 나(double), 마(double), 바(double)
		//                 사(double), 아(int), 자(int), 카(double)
		// 잘못된 표현식 : 다(%는 정수만 가능), 라(잘못된 논리연산 비교)
		//                 차(잘못된 논리연산 비교)
		
		
		// ***11번 문제
		String name;
		double weight;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름은? ");
		name = sc.next();
		
		System.out.print("몸무게는? ");
		weight = sc.nextDouble();
		
		System.out.print("나이는? ");
		age = sc.nextInt();
		
		String myInfo = "이름은 %s, 몸무게는 %.1f, 나이는 %d살이다.";
		System.out.printf(myInfo, name, weight, age);
		
		
		
		
	}

}
