package genericUtility;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class JavaUtility {
	
	public int getRandomNumber()
	{
		Random ran = new Random();
		int r = ran.nextInt(10000);
     	return r;
	}

	public String randomalphabet()
	{
		String ra = RandomStringUtils.randomAlphabetic(3);
		return ra;
	}
	
	public String randomnumber()
	{
		String rn = RandomStringUtils.randomNumeric(10);
		return rn;
	}
	
}
