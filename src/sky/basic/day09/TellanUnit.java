package sky.basic.day09;

/*
public class TellanUnit {
    protected String name;
    protected int stemina;
    protected int power;
    protected double moveSpeed;
    protected int mineral;
    protected int gas;

    public TellanUnit() { }

    public TellanUnit(String name, int stemina, int power, int moveSpeed,
                      int mineral, int gas) {
        this.name = name;
        this.stemina = stemina;
        this.power = power;
        this.moveSpeed = moveSpeed;
        this.mineral = mineral;
        this.gas = gas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStemina() {
        return stemina;
    }

    public void setStemina(int stemina) {
        this.stemina = stemina;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public int getMineral() {
        return mineral;
    }

    public void setMineral(int mineral) {
        this.mineral = mineral;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }


}

abstract class Property extends TellanUnit {
    abstract public void attack();
    abstract public void move();
    abstract public void specialAbility();
}

class SCV extends Property {    //건설로봇
    public SCV() {
        super.name = "SCV";
        super.stemina = 45;
        super.power = 5;
        super.moveSpeed = 3.94;
        super.mineral = 50;
    }

    @Override
    public void attack() {
        System.out.println("지상을 공격력 5만큼 공격했습니다.");
    }

    @Override
    public void move() {
    }

    @Override
    public void specialAbility() {

    }
}

class Marine extends Property {     // 해병
    public Marine() {
        super.name = "Marine";
        super.stemina = 40;
        super.power = 6;
        super.moveSpeed = 1.875;
        super.mineral = 50;
    }

    @Override
    public void attack() {
        System.out.println("가스총으로 6만큼 공격했습니다.");
    }

    @Override
    public void move() {
    }

    @Override
    public void specialAbility() {

    }
}

class Medic extends Property {     // 의무관
    public Medic() {
        super.name = "Medic";
        super.stemina = 60;
        super.moveSpeed = 1.875;
        super.mineral = 50;
        super.gas = 25;
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



 */