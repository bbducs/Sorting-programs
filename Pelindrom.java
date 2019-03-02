import java.util.Scanner;

public class Pelindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number");
		int num = sc.nextInt();
		int total = 1;
		for(int i=1;i<=num;i++) {
			total = total * i;
		 }	
		System.out.println(total);
	}
}
