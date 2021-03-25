package sky.basic.day07;

public class EX05 {
    public static void main(String[] args) {
        // Q73
        Fan f = new Fan();
        System.out.println(f.toString());

        // Q74

        // Q76


    }//main

    static class Fan {
        private String rotationSp;
        private String speed;
        private boolean on;
        private double radius;
        private String color;

        public Fan() {}
        public Fan(String rotationSp, String speed,
                   boolean on, double radius, String color) {
            this.rotationSp = rotationSp;
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }

        public void FanPrint(Fan f) {
            if(f.speed .equals("1"))
                speed = "SLOW";
            else if(f.speed .equals("2"))
                speed = "MEDIUM";
            else if(f.speed .equals("3"))
                speed = "FAST";
        }

        public String toString() {
            return "Fan{" +
                    "speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }


}//class
