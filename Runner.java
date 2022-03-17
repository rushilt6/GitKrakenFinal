
public class Runner{
	public Runner(){
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

		//I learned how to use lambda expressions/functions in place of regular object declarations. 
		//I also learned that in real life, companies will have one main file/runner code that features everything, and employees will create seperate branches to do their own work on and once their done, they would merge those branches into the main if the employer/team leader approves.
		//This would be very efficient in the real world because multiple people can be working on different aspects of a project, which means that the project's progress will increase greatly.
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
