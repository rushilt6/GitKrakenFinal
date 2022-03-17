
public class Runner{
	public Runner(){
		//Rushil: I learned about lamda expressions and how they can shorten code length
		//Rushil: I learned about git and how you can edit with other people
		//Rushil: I learned about how you can create repositories with other people and work on projects together by using branches and then merging them into the main
		printQuotient pq = (num1,num2) -> {
			System.out.printf("%.3f%n",num1/num2);
		};
		pq.print((float)6,(float)3);
		perfectSquare perfSquare = (num)->{
			int n = (int)Math.sqrt(num);
			if(n*n == num)
				return true;

			return false;
		};
 
		System.out.println(perfSquare.perfectCheck(4));
	}
	public interface printQuotient{
		void print(float num1,float num2);
	}
	public interface perfectSquare
	{
		public boolean perfectCheck(int num);
	}
	public static void main(String[]args)
	{
		Runner app = new Runner();
	}
}
