 class Shape{
    String color;
}
 class Triangle extends Shape{
    public void Calculate(){
       System.out.println("the color of the triangle is " +color);
    }

}
public class inheritance {
    public static void main(String[] args) {

        Triangle t1 = new Triangle();
        t1.color = "blue";
        t1.Calculate();
    }
}
