
    class Myemployee{
        private int id;
        private String name;
        private int radius,area;
        public int getId(){
            return id;
        }
        public void setId(int i){
            this.id = i;
        }
        public String getName(){
            return name;
        }
        public void setName(String n){
          this.name = n;
        }
        public void setRadius(int r){
            this.radius = r;
        }
        public int getRadius(){
            return radius;
        }
        public void setArea(int area){
            this.area = area;
        }
        public int getArea(){
            return area;
        }
    }
    public class cwh_40_ch9 {
    public static void main(String[] args) {
Myemployee harry = new Myemployee();
//harry.id=45;
//harry.name = "CWH";//--> throws an error due to access modifier
        harry.setName("Pranav gour");
        System.out.println(harry.getName());
harry.setId(234);
        System.out.println(harry.getId());
        harry.setRadius(2);
        System.out.println(harry.getRadius());
        harry.setArea(11);
        System.out.println(harry.getArea());
    }
}
