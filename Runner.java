public class Runner
{
	public interface perfectSquare
	{
		public boolean perfectCheck(int num);
	}

	public Runner()
	{
		perfectSquare perfSquare = (num)->{
			int n = (int)Math.sqrt(num);
			if(n*n == num)
				return true;

			return false;
		};

		System.out.println(perfSquare.perfectCheck(4));
	}

	public static void main(String[]args)
	{
		Runner app = new Runner();
	}
}