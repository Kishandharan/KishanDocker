import java.util.Scanner;

public class app{
	public static void main(String args[]){
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = sc1.nextLine();
		for(int i=0;i<name.length()+1;i++){System.out.println(name.substring(0,i));}
		for(int i=name.length()-1;i>-1;i--){System.out.println(name.substring(0,i));}
		System.out.print("");
	}
}