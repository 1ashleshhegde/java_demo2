import java.util .Scanner;
class findArea
{
	public static void main(String arg[])
	{
		double pi=3.14,area;
		Scanner S=new Scanner (System.in);
		System.out.println("Enter the Radius of circle");
		int radius=S.nextInt();
		area=pi*radius*radius;
		System.out.println("area of circle is "+area);
		}

}