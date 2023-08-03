import java.util.Scanner;
public class CompareStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	   System.out.println("Enter one value =");
        String style = input.next();
	   System.out.println("Enter  value =");
        String style2 = input.next();

        if(style == style2){
            System.out.println("Equal");
}
        else{
            System.out.println("Not Equal");
    }}
}