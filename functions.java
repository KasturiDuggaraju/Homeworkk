public class Functions {
        public static void calculateArea(){
           int a=5;
            int b=10;
            System.out.println("the area of the rectangle "+(a*b));
        }
        public static void dogActivities(){
            String dog_name = "Tommy";
            int dog_age = 2;
            String dog_food = "pedigree";
            System.out.println("the name of the dog is  "+dog_name);
            System.out.println("the age of the dog is  "+dog_age);
            System.out.println("the food given to the dog is "+dog_food);

        }
    public static void main(String[]args){
            System.out.println("calling the first function");
            calculateArea();
        System.out.println("calling the second function");
        dogActivities();

    }

}
