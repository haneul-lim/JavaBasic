package sky.basic.day09;

public class StarCraft2 {
    public static void main(String[] args) {

        SCV s = new SCV();
        // 객체를 만드는 방법 2가지

        System.out.println("SCV의 체력" + s.hp);
        s.attack();
        s.move();
        s.specialAbility();

        Marine m = new Marine();

        System.out.println("Marine의 체력" + m.hp);
        m.attack();
        m.move();
        m.specialAbility();

        Firebat f = new Firebat();

        System.out.println("Firebat의 체력" + f.hp);
        f.attack();
        f.move();
        f.specialAbility();

    }

}

abstract class Unit2 {
    // 멤버변수
    protected String name;
    protected int hp;
    protected int power;
    protected double mvspd;
    protected int mineral;
    protected int gas;

    // 생성자
    public Unit() { }


    //추상 메서드
    abstract public void attack();
    abstract public void move();
    abstract public void specialAbility();

}

class SCV extends Unit2 {

    final String fmtattck = "융합절단기를 이용해서 대상에 %d의 피해를 주고있습니다\n";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다\n";
    final String fmtspabty = "대상을 수리하는 중입니다\n";

    public SCV() {
        name = "SCV";
        hp = 45;
        power = 0;
        mvspd = 2.81;
        mineral = 50;
        gas = 0;
    }

    @Override
    public void attack() {
        // sout("융합절단기를 이용해서 ... ")
        // 추상메서드를 이용해서 부모클래스에 정의된
        // attack 메서드를 유닛에 맞게 재정의함
        System.out.printf(fmtattck, power);
    }

    @Override
    public void move() {
        System.out.printf(fmtmove, mvspd);
    }

    @Override
    public void specialAbility() {
        System.out.printf(fmtspabty);
    }
}


class Marine extends Unit2 {

    final String fmtattck = "가우스소총을 이용해서 대상에 %d의 피해를 주고있습니다\n";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다\n";
    final String fmtspabty = "전투자극제를 사용해서 이동속도는 50%% 증가, 공격속도 33%% 증가합니다\n";


    public Marine() {
        name = "Marine";
        hp = 50;
        power = 30;
        mvspd = 2.95;
        mineral = 50;
        gas = 0;

    }

    @Override
    public void attack() {
        System.out.printf(fmtattck, power);
    }

    @Override
    public void move() {
        System.out.printf(fmtmove, mvspd);
    }

    @Override
    public void specialAbility() {
        System.out.printf(fmtspabty);
    }
}


class Firebat extends Unit2 {

    final String fmtattck = "화염방사기를 이용해서 대상에 %d의 피해를 주고있습니다\n";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다\n";
    final String fmtspabty = "전투자극제를 사용해서 이동속도는 50%% 증가, 공격속도 33%% 증가합니다\n";


    public Firebat() {
        name = "Firebat";
        hp = 50;
        power = 8 * 2;
        mvspd = 1.875;
        mineral = 50;
        gas = 25;
    }

    @Override
    public void attack() {
        System.out.printf(fmtattck, power);
    }

    @Override
    public void move() {
        System.out.printf(fmtmove, mvspd);
    }

    @Override
    public void specialAbility() {
        System.out.printf(fmtspabty);
    }
}

