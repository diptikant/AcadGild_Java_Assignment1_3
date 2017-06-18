import java.util.*;
public class Java_Assignment1_3 {

	public static void main(String[] args) 
	{
		
		short p,q;		
		Scanner sc;
		sc=new Scanner(System.in);
		//Enter value for P
		p=sc.nextShort();
		//Enter value for Q
		q=sc.nextShort();
		//Calculating value for logical and
		short land;
		if ((p == 1) && (q == 1))
		{
			land =1;
		}
		else
		{
			land = 0;
		}
		System.out.println("P\tQ\tBitwisen AND\tLogical And");
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q)+"\t\t" + land);
        sc.close();
	}
        
	
}
