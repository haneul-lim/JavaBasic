package sky.basic.day10;

public class StarCraft2 {
    // 인터페이스 기반으로 스타크래프트의 유닛을 정의해 봄
    public static void main(String[] args) {

        SCV2 s2 = new SCV2();

        System.out.println("SCV의 체력" + s2.hp);
        s2.attack();
        s2.move();
        s2.specialAbility();

        Marine2 m2 = new Marine2();

        System.out.println("Marine의 체력" + m2.hp);
        m2.attack();
        m2.move();
        m2.specialAbility();

        Firebat2 f2 = new Firebat2();

        System.out.println("Firebat의 체력" + f2.hp);
        f2.attack();
        f2.move();
        f2.specialAbility();

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
    public Unit2() { }

}
// 추상클래스에서 정의했던 추상메서드를
// 독립적인 코드들로 분리함 -> 인터페이스
interface unit2Action {
    void attack();
    void move();
    void specialAbility();
}

class SCV2 extends Unit2 implements unit2Action {

    final String fmtattck = "융합절단기를 이용해서 대상에 %d의 피해를 주고있습니다\n";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다\n";
    final String fmtspabty = "대상을 수리하는 중입니다\n";

    public SCV2() {
        name = "SCV";
        hp = 45;
        power = 0;
        mvspd = 2.81;
        mineral = 50;
        gas = 0;
    }

    @Override
    public void attack() {

    }

    @Override
    public void move() {

    }

    @Override
    public void specialAbility() {

    }
}


class Marine2 extends Unit2 implements unit2Action{

    final String fmtattck = "가우스소총을 이용해서 대상에 %d의 피해를 주고있습니다\n";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다\n";
    final String fmtspabty = "전투자극제를 사용해서 이동속도는 50%% 증가, 공격속도 33%% 증가합니다\n";


    public Marine2() {
        name = "Marine";
        hp = 50;
        power = 30;
        mvspd = 2.95;
        mineral = 50;
        gas = 0;

    }

    @Override
    public void attack() {

    }

    @Override
    public void move() {

    }

    @Override
    public void specialAbility() {

    }
}


class Firebat2 extends Unit2 implements unit2Action{

    final String fmtattck = "화염방사기를 이용해서 대상에 %d의 피해를 주고있습니다\n";
    final String fmtmove = "지정한 위치로 %.2f 속도로 이동중입니다\n";
    final String fmtspabty = "전투자극제를 사용해서 이동속도는 50%% 증가, 공격속도 33%% 증가합니다\n";


    public Firebat2() {
        name = "Firebat";
        hp = 50;
        power = 8 * 2;
        mvspd = 1.875;
        mineral = 50;
        gas = 25;
    }

    @Override
    public void attack() {

    }

    @Override
    public void move() {

    }

    @Override
    public void specialAbility() {

    }
}

