package sky.basic.day08;

public class EX05 {
    public static void main(String[] args) {
        // Q73
        Fan f1 = new Fan();
        System.out.println(f1.speed);
        System.out.println(f1.on);
        System.out.println(f1.radius);
        System.out.println(f1.color);

        Fan f2 = new Fan();
        System.out.println(f2.speed);
        System.out.println(f2.on);
        System.out.println(f2.radius);
        System.out.println(f2.color);

        // 시험값 지정
        Fan f3 = new Fan();
        f3.speed = f3.FAST;     // speed = 3;으로 써도 가능
        f3.on = true;
        f3.radius = 10;
        f3.color = "yellow";
        // 클래스를 통해 객체를 생성하고 객체의 멤버변수에 값을 초기화 - 다소 번거로움
        // 기본 생성자만 생성한 경우 해당 멤버변수에 각 값을 지정해줄 수 있음..(번거로움)

        Fan f4 = new Fan(2, false, 5, "blue");
        // 매개변수 생성자를 사용하면 객체의 멤버변수에 값을 초기화하기가 편함


        // Q74
        Account a1 = new Account();
        System.out.println(a1.aid);
        System.out.println(a1.balance);
        System.out.println(a1.interestRate);
        System.out.println(a1.dateCreated);
        // 기본생성자에 넣어둔 초기값인 0 또는 null 값이 출력됨 (기본생성자에서 생략가능)

        Account a2 = new Account();
        a2.aid = 1122;
        a2.balance = 20000;
        a2.interestRate = 4.5;
        a2.dateCreated = "2014-08-15 14:34:29";

        Account a3 = new Account(
                1122, 20000, 4.5, "2014-08-15 14:34:29");


        // Q76



    }

    static class Fan {
        final int SLOW = 1;     // 상수, 재정의불가 변수 // const.. 비슷한 상수
        final int MEDIUM = 2;
        final int FAST = 3;

        private int speed;
        private boolean on;
        private double radius;
        private String color;

        public Fan() {  // 생성자, 멤버변수 초기화
            speed = SLOW;
            on = false;
            radius = 5.0;
            color = "blue";
        }

        public Fan(int speed, boolean on, double radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }
    }//Fan

    static class Account {
        private int aid;
        private int balance;
        private double interestRate;
        private String dateCreated;

        public Account() {
            aid = 0;
            balance = 0;
            interestRate =0;
            // 초기값이 0이라면 굳이 안해줘도 됨
        }

        public Account(int aid, int balance, double interestRate, String dateCreated) {
            this.aid = aid;
            this.balance = balance;
            this.interestRate = interestRate;
            this.dateCreated = dateCreated;
        }



    }//Account

    class Student {
        private int hakbun;
        private String hakName;
        private String hakAddr;
        private String hakBirth;
        private String dname;
        private int prof;
    }

    class Subject {
        private int sno;
        private String sname;
        private String sdesc;
        private String ssec;
    }

    class Professor {
        private int pno;
        private String name;
        private String field;
        private String tech;
    }

    class Major {
        private String mname;
        private String offpos;
        private String phone;
        private int chief;
    }

}
