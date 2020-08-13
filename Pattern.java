import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int count=0;
		int j=0;
		int w=N*(N+1);
		int a[]=new int[w];
		int i=0;
		while(i<w)
		{
			a[i]=i+1;
			i++;
			
		}
		int k=0;
		int z=a.length-N;
		
		int c=0;
		int num=N;
		
		
		
		for(i=0;i<N;i++) {
			for( j=0;j<count;j++)
			{
				System.out.print("*");
			}
			while(c<num)
			{
				System.out.print(a[k]);
				
				System.out.print(0);
				c++;
				k++;
			}
			 c=0;
			while(c<num)
			{
				System.out.print(a[z]);
				if(c!=num-1)
				System.out.print(0);
				z++;
				c++;
			}
		
			z=z-(c+(c-1));
			c=0;
			num--;
			
			
			count=count+2;
		System.out.println();
this is the reason
		}

	}

}
