class Pen{
    String color;
    String type;
   //method used calculate
    public  void calculate(){
    System.out.println("the color is "+this.color);
    System.out.println("the type is "+this.type);
}
}


public class oops_concepts {
    public static void main(String []args){
        Pen p1 = new Pen();
        p1.color="black";
        p1.type="ballpoint pen";
        p1.calculate();
        Pen p2 = new Pen();
        p2.color="blue";
        p2.type="gell pen";
        p2.calculate();


    }
}
