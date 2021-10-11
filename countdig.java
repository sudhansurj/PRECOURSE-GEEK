public class countdig{

	public static void main(String[] args) {
       
		int num = 1987;
		int count = 0;
		
		while(num > 0)
		{
			num = num / 10;
			count = count + 1;
		}
		
		System.out.print(count);
	}

}
