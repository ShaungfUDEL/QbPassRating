import java.lang.Math;

public class QbRating 
{
	private double Att;
	private double Comp;
	private double Yds;
	private double Td;
	private double Intt;
	
	public QbRating()
	{
		Att=0;
		Comp=0;
		Yds=0;
		Td=0;
		Intt=0;
	}
	public QbRating(double a, double b, double c, double d, double e)
	{
		Att=a;
		Comp=b;
		Yds=c;
		Td=d;
		Intt=e;
	}
	public double calcFirst()
	{
		double i = ((Comp/Att)-.3) *5;
		if(i >= 2.375)
		{
			return 2.375;
		}
		else if(i < 0)
		{
			return 0;
		}
		return i;
	}
	public double calcSecond()
	{
		double j = ((Yds/Att)-3)*.25;
		if(j >= 2.375)
		{
			return 2.375;
		}
		else if(j < 0)
		{
			return 0;
		}
		return j;
	}
	public double calcThird()
	{
		double k = (Td/Att) *20;
		if(k >= 2.375)
		{
			return 2.375;
		}
		else if(k < 0)
		{
			return 0;
		}
		return k;
	}
	public double calcForth()
	{
		double l = 2.375 - ((Intt/Att) *25);
		if(l >= 2.375)
		{
			return 2.375;
		}
		else if(l < 0)
		{
			return 0;
		}
		return l;
	}
	public double calcPassRating()
	{
		double pA = ((calcFirst() + calcSecond() + calcThird() + calcForth())/6) * 100;
		if (pA >= 158.3)
		{
			return 158.3;
		}
		return Math.round(pA*10)/10.0d;
	}
}
