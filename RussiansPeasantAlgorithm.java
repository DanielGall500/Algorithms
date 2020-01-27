public class RussiansPeasantAlgorithm {
	
	static long russianMultiply(long a, long b)
	{
		long res = 0;
		
		while(b > 0)
		{
			if(b % 2 != 0)
			{
				res += a;
			}
			
			a *= 2;
			b   *= 0.5;
		}
		
		return res;
	}
	
	public static void main(String[] args)
	{
		long a[] = {10, 35, 50};
		long b[] = {3, 6, 5};
		
		for(int i = 0; i < 3; i++)
		{
			final long startTime = System.currentTimeMillis();
		
			long res = russianMultiply(a[i], b[i]);
			System.out.println(res);
		
			final long elapsedTime = System.currentTimeMillis() - startTime;
		
			System.out.println("The time taken " + elapsedTime);
		}
		
		
		
		
	}

}
