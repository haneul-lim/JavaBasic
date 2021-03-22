package sky.basic.day05;

import java.util.Scanner;

public class EX03 {

	// 문자열.charAt(자릿수) : 지정한 자릿수의 문자하나 추출
	// 문자열.substring(시작, 끝) : 지정한 시작위치에서 끝 -1 위치의 문자들 추출
	
	// 예시)
	// 123456-1234567
	// jumin.charAt(0): 1
	// jumin.substring(7,8): 1
	
	public static void main(String[] args) {
		
		// LeapYear (Q27)
		// 윤년 여부를 출력하는 프로그램
		// 지구의 공전주기와 자전주기의 불일치로 발생
		// 공전주기 : 365.24일
		// 자전주기 : 0.24일
		// 이 둘간의 오차때문에 4년마다 하루를 추가하는 방법으로
		// 오류를 보정함
		// 조건1 : 4로 나누어 떨어지지만, 100으로 나눠 떨어지지 않음
		// 조건2 : 400으로 나눠 떨어짐
		// 1600(윤년), 2020(윤년), 1900(평년), 2021(?)
		
		int leapY;
		String result = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연도를 입력하세요: ");
		leapY = sc.nextInt();
		
		if ((leapY % 4 == 0 && leapY % 100 != 0) || leapY % 400 == 0) {
				result = "입력한 연도는 윤년입니다.\n";
		} else result = "입력한 연도는 평년입니다.\n";
		
		
		System.out.println(result);
		
		
		
		// CardCheck (Q33)
		// 신용카드 번호를 보고
		// 어떤 종류와 은행인지 알려주는 프로그램
		// 3 : JCB카드
		// 4 : Visa카드
		// 5 : Master카드
		String cardnum = "";
		//String result2 = "";
		String cardtype = "";
		String cardbank = "";
		String fmt = "카드 종류는 %s 이고요, %s 입니다.";
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("카드번호 6자리를 입력해주세요. : ");
		cardnum = sc2.next();
		
		// if문 사용
		//if (cardnum.charAt(0) == '3')
		//	cardtype = "JCB카드";
		//else if (cardnum.charAt(0) == '4')
		//	cardtype = "Visa카드";
		//else if (cardnum.charAt(0) == '5')
		//	cardtype = "Master카드";
		
		// switch문 사용
		switch(cardnum.charAt(0)) {
			case '3': cardtype = "JCB 카드"; break; 
			case '4': cardtype = "Visa 카드"; break; 
			case '5': cardtype = "Master 카드"; break; 
		} // switch
		
		//System.out.println(cardtype);
		
		switch(cardnum) {
			case "356317": cardbank = "NH농협카드"; break;
			case "356901": cardbank = "신한카드"; break;
			case "356912": cardbank = "KB국민카드"; break;
			case "404825": cardbank = "비씨카드"; break;
			case "438676": cardbank = "신한카드"; break;
			case "457973": cardbank = "국민은행"; break;
			case "515594": cardbank = "신한카드"; break;
			case "524353": cardbank = "외환카드"; break;
			case "540926": cardbank = "국민은행"; break;
		}
		
		
		System.out.printf(fmt, cardtype, cardbank);
		
		
		
		// 이 아래는 개인적으로 연습했던 코드들
		//card = cardnum.charAt(0);
		//bank = cardnum.charAt();
		
		//if (card == '3') {
		//	result2 = "JCB카드";
		//}else if (card == '4') {
		//	result2 = "Visa카드";
		//}else if (card == '5') {
		//	result2 = "Master카드";
		//}else result2 = "잘못입력하였습니다.";
		
		//switch((int)card) {
		//	case 3: result2 = "JCB카드"; break;
		//	case 4: result2 = "Visa카드"; break;
		//	case 5: result2 = "Master카드"; break;
		//	default : result2 = "잘못입력하였습니다.";
		//}
		
		//System.out.println(result2);
		
		
	}

}
