import java.util.Scanner;

public class ReverString {
	
	static void reverse(String word){
		 if ((word ==null)||(word.length() <= 1)) 
	           System.out.print(word); 
	        else
	        { 
			System.out.print(word.charAt(word.length()-1));
			reverse(word.substring(0,word.length()-1));		
	    	}
	}
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String arr[] = word.split(" ");	
		for(int i=0;i<arr.length;i++) {
			reverse(arr[i]);
			System.out.print(" ");
			
		}
		

}
}