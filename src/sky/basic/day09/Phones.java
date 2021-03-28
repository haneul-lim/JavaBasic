package sky.basic.day09;

public class Phones {
    public static void main(String[] args) {
        NormalPhone n = new NormalPhone();
        n.sendCall();

        MP3Phone m = new MP3Phone();
        m.playMusic();

        SmartPhone s = new SmartPhone();
        s.takePicture();

    }//main
}//class

interface PhoneInterface {
    void sendCall();
    void receiveCall();
    // abstract public 추상메서드 만들 때 생략 가능
}

interface MP3Interface {
    void playMusic();
    void viewMovie();
}

interface SmartPhoneInterface {
    void takePicture();
    void surfInternet();
    void playGame();
}


class NormalPhone implements PhoneInterface {
    @Override
    public void sendCall() {
        System.out.println("전화 거는 중...");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화 받는 중...");
    }
}

class MP3Phone implements PhoneInterface, MP3Interface {

    @Override
    public void sendCall() { }

    @Override
    public void receiveCall() { }

    @Override
    public void playMusic() {
        System.out.println("음악을 재생합니다");
    }

    @Override
    public void viewMovie() {
        System.out.println("동영상을 재생합니다");
    }
}

// 상속extends : 부모클래스가 가진 특성과 기능을 변화없이 받음 (오버라이딩(재정의)를 통해 바꿀 수는 있음)
//       대부분 변화가 많이 없을 때 상속을 통해 코드를 짬
// 구현implements : 부모클래스가 정해준 틀에 맞춰 새롭게 작성
// 따라서, 아래처럼 짜는 것은 다소 세련되지 못함
class MP3Phone2 extends NormalPhone implements MP3Interface {
    // MP3Phone처럼 사용하는 것이 좋은 이유는
    // 클래스의 객체 값이 같게 만들때가 있고, 값이 다르게 들어가게 만들때가 있음
    // interface는 기본적으로 값이 다르다는 전제로 하기 때문에

    // 상속은 거의 대부분 변화 없이 부모클래스의 값을 가져오게 되지만, (성질을 그대로 가져오고 +알파해서 새로운걸 만들고)
    // 구현은 틀만 가져오고 내용은 역량에 따라 다르게 짤 수 있다. (내용없는 뼈대만 만들고 뼈대를 토대로 내용을 만듬)
    // 만들 때 마다 구현하는 사람에 따라 다르게 채울 수 있다는 전제로 인터페이스를 사용함.
    // 따라서 상속과 인터페이스를 같이 쓰는것은 좋은 방법은 아니다.

    @Override
    public void playMusic() { }

    @Override
    public void viewMovie() { }
}

class SmartPhone implements PhoneInterface, SmartPhoneInterface {

    @Override
    public void sendCall() { }

    @Override
    public void receiveCall() { }

    @Override
    public void takePicture() {
        System.out.println("사진을 찍습니다");
    }

    @Override
    public void surfInternet() {
        System.out.println("인터넷을 합니다");
    }

    @Override
    public void playGame() {
        System.out.println("게임을 합니다");
    }
}