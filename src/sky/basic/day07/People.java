package sky.basic.day07;

public class People {
    public static void main(String[] args) {
        // 객체지향 프로그래밍 개요
        // 모든 데이터를 객체로 취급하여 소프트웨어를 개발함

        // 객체 : 실생활에서 우리가 인식하는 유/무형의 사물
        // ex) 집, 자동차, 사람, 급여, 주문, 사랑, ...
        // 변수를 그룹핑한 결과물을 객체라고 함..
        // ex) 고객정보(이름,직업,나이,성별,혈액형) -> 고객정보가 객체

        // 클래스 : 객체를 만들어 내는 틀, 설계도
        // 클래스에는 객체의 상태를 나타내는 필드/속성과
        // 객체의 기능을 나타내는 메서드로 구성
        // (보통 실무에서는 클래스내 객체의 상태/기능 따로 만든다.)
        
        // 클래스는 객체의 설계도이기 때문에 실제 정보를 저장할 수 없음
        // 실제 정보를 저장하려면, 이것의 객체화가 필요한데
        // 객체를 선언하는 과정을 객체화(클래스명 객체(인스턴스)변수 = new 클래스명();)라고 함
        // 객체화를 통해 나온 결과물을 객체/인스턴스라 하는데
        // 클래스에 정의된 필드와 기능이 실제 메모리에 할당된 것임

        // 하나의 클래스로 부터 여러개의 객체를 생성할 수 있음
        // 이렇게 생성된 객체는 독립된 메모리 공간에 저장된 자신만의 변수를 가질 수 있음

        // 일반적인 클래스 구성요소
        // 멤버변수, 생성자, setter/getter

        


        // 고객정보
        // 이름, 직업, 나이, 성별, 혈액형
        // 밥 먹기, 잠자기, 말하기, 걷기

        // 고객정보를 기존방식으로 정의
        // 속성별로 변수를 각각 선언해야함 - 관리가 번거로움
        String name;
        String job;
        int age;
        String gender;
        String blood;

        // 변수 초기화
        name = "최승희";
        job = "의사";
        age = 45;
        gender = "여";
        blood = "A";

        // 클래스 사용하기
        // 1. 클래스에 대한 객체화 필요
        // 클래스를 구성하는 변수들이 메모리에 할당되어야 사용가능
        // (클래스 내 선언된 변수들이 모두 main에 선언되어지는 것.)
        Person p = new Person();

        // 배열과 클래스 차이
        // (배열은 같은 자료형 타입의 변수들을 한 변수에 담아 선언 가능.
        // 클래스는 다른 자료형 타입의 변수들도 하나의 클래스에 담아 선언 가능.

        // 2. 클래스 멤버변수 초기화
        p.name = "이미녀";
        p.job = "골프선수";
        p.age = 28;
        p.gender = "여";
        p.blood = "O";

        // 학생 클래스 객체화 및 멤버변수 초기화
        Student s = new Student();

        s.hakNum = "201350050";
        s.name = "김태희";
        s.address = "경기도 고양시";
        s.birth = "1985.3.22";
        s.dname = "컴퓨터";
        s.prof = "504";


        // 생성자를 이용해서 클래스 사용하기
        Person p2 = new Person("김미남", "교수",
                47, "남", "AB");

        Student s2 = new Student("201250006", "송혜교", "서울영등포구",
                "1988.9.17", "컴퓨터", "301");

        // 객체에 대입한 값 출력하기
        // 객체명.멤버변수명
        System.out.println(p2.name);
        System.out.println(p2.job);
        System.out.println(p2.age);
        System.out.println(p2.gender);
        System.out.println(p2.blood);


    }

    // 고객 클래스
    static class Person {  // Person 안 값들이 메모리 어디에 저장될지가 지정되지 않은 상태.
        // 변수선언 (속성property, 필드 field, 멤버member)

        // 멤버변수
        // (생성자 매개변수로 값이 들어가면 생성자 this 변수로 들어가 멤버변수로 들어감...)
        private String name;
        private String job;
        private int age;
        private String gender;
        private String blood;

        // 생성자 : 변수초기화 관련 특수한 메서드
        // 기본생성자, 매개변수를 포함하는 생성자

        // 기본생성자 : 컴파일러가 자동으로 생성해서 추가해줌
        // public 클래스명() {
        //    초기화 코드
        // }
        public Person() {}

        // 매개변수를 포함하는 생성자
        // public 클래스명(매개변수) {
        //    초기화 코드
        // }
        // 생성자의 매개변수명과 멤버변수명이 일치하면 일반적으로 shadowing 현상이 발생
        // 클래스의 멤버변수임을 명확하게 표현하기 위해 this라는 키워드를 추가함
        public Person(String name, String job, int age, String gender, String blood) {
            this.name = name;
            this.job = job;
            this.age = age;
            this.gender = gender;
            this.blood = blood;

        }

        // 멤버변수 -> 기본생성자 -> 매개변수를 포함한 생성자 순으로 만든다 생각..

    }

    // 학생 클래스
    static class Student {
        private String hakNum;
        private String name;
        private String address;
        private String birth;
        private String dname;
        private String prof;

        public Student() {}

        public Student(String hakNum, String name, String address, String birth,
                        String dname, String prof) {
            this.hakNum = hakNum;
            this.name = name;
            this.address = address;
            this.birth = birth;
            this.dname = dname;
            this.prof = prof;
        }

    }


}
