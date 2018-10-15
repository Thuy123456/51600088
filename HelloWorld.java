import java.util.*;
import java.io.*;
public class HelloWorld
{   
    public static void main(String[] args){
        System.out.println("Hello World This is TDTU");
		//Scanner scanIn = new Scanner(System.in);
		FileReader f = new FileReader("file.txt");
		String name = "";
		//System.out.print("Input your name: ");
		int count = 0;
		Scanner s = new Scanner(f);
		while(s.hasNextLine()){
			name = s.nextLine();
			System.out.println("Hello World I am "+ name +".");
			count++;
		}
		System.out.println("Total " + count + " Students");
	}
} 
