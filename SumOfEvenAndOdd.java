package tutorialJava;
import java.util.*;
public class testP {
	
	

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	int odd =0;
	int even =0;
	int r=0;
	while(a>0) {
		r = a%10;
		if(a%2==0) {
			even = even+r;
		}
		else {
			odd = odd +r;
		}
		
		
		
		a =a/10;
	}
	System.out.print("even "+ even + " odd "+ odd);
		

	}

}
