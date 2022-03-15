public class Runner{
	public Runner(){
		printQuotient pq = (num1,num2) -> {
			System.out.printf("%.3f%n",num1/num2);
		};
		pq.print((float)6,(float)3);
	}
	public interface printQuotient{
		void print(float num1,float num2);
	}
	public static void main(String[]args)
	{
		Runner app = new Runner();
	}
}

