package sky.basic.day08;

public class Inheritance2 {
    public static void main(String[] args) {

        StudentWorker sw = new StudentWorker();
        System.out.println(sw.speak);
        System.out.println(sw.eat);
        System.out.println(sw.walk);
        System.out.println(sw.sleep);
        System.out.println(sw.study);
        System.out.println(sw.work);

    }//main


}//class

class People {
    String speak;
    String eat;
    String walk;
    String sleep;
}

class Student extends People {
    String study;
}

class StudentWorker extends Student {
    String work;
}

class Researcher extends People{
    String research;
}

class Professor extends Researcher {
    String teach;
}