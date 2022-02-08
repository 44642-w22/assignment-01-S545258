package Assignment01;
import java.util.*;
public class Problem03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> p = new ArrayList<>();
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter size Of ArrayList");
		int size=scanner.nextInt(); 
		
	
		
		for (int i=0;i<size;i++) {
			System.out.println("Enter number");
			p.add(scanner.nextInt());
		}
		
		System.out.println("Output: " +prob3(p));
		
	} 
	
	
	
	public static Integer prob3(ArrayList<Integer> p)
	{
		int a;
		
		if(p.size()!=0) {
			Collections.sort(p);
			a= p.get(p.size()-1);
			
		}
		
		else {
			a=Integer.MIN_VALUE;
			
		}
		
		return a;		
		
	}

}