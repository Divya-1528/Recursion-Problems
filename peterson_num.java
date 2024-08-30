import java.util.*; 
class peterson_num
{ 
	public static void main(String args[]) 
	{ 
		Scanner sc=new Scanner(System.in); 
	System.out.println("Enter the number"); 
		int num=sc.nextInt(); 
		int temp=num;
		int f=1,sum=0; 
		while(num!=0)
		{ 
			f=1; 
			int r=num%10; 
			for(int i=1;i<=r;i++) 
			{ 
				f=f*i; 
			} 
			sum=sum+f;
			num=num/10; 
		} 
		if(sum==temp) 
		System.out.println("PETERSON NUMBER"); 
		else
		System.out.println("NOT PETERSON NUMBER"); 
	} 
	} 
