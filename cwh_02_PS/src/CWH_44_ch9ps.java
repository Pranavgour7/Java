

/*class Cylinder {
    private int height;
    private int radius;

    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public double surfacearea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}*/
    class rectangle1{
        private int length;
        private int breadth;
        public rectangle1() {
            this.length = 4;
            this.breadth = 5;

        }

        public rectangle1(int length, int breadth) {
            this.length = length;
           this.breadth = breadth;
        }

        public int getLength() {
            return length;
        }

        public int getBreadth() {
            return breadth;
        }


}

public class CWH_44_ch9ps {
    public static void main(String[] args) {
     /*   Cylinder c = new Cylinder(5, 6);
        c.setHeight(5);
        c.setRadius(6);
        System.out.println(c.getHeight());
        System.out.println(c.getRadius());

        // Problem 2
        System.out.println(c.surfacearea());
        System.out.println(c.volume());

      */
        // Problem 4
        rectangle1 r = new rectangle1();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}
