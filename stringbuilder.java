import java.lang.String;
public class string_builder {
    public static void main(String[]args){
    //string builder is used for modification in strings as strings are immutable
    StringBuilder sb = new StringBuilder("ello");
    System.out.println(sb.insert(0,'h'));
        System.out.println(sb.append(" how are you?"));

        System.out.println(sb);



    }
}
