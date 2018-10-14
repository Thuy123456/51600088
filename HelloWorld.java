import java.util.*;
public class HelloWorld
{   
    public static void main(String[] args){
		Scanner scanIn = new Scanner(System.in);
		String name = "";
		System.out.print("Input your name: ");
		name = scanIn.nextLine();
        System.out.println("Hello World I am "+ name +".");   
    }
} 
