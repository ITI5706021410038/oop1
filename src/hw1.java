package h2;

	import java.io.*;
	import javax.swing.*;

	import java.util.*;
	public class hw1
	{
		int [][] Sec3,Sec4,Sec5;
		String[][] Sum;
		int a=0;
		Random rand = new Random();
		public String OOPSec3()
		{
			String n1;
			Sec3 = new int[40][5];
			Sum = new String[40][2];
			
			n1 = "Number\tMidterm\tFinal\tHomework\tAssignment\tPoint\n";
			for(int i=0;i<Sec3.length;i++)
			{
				n1 = n1+(i+1)+"\t";
				for(int j=0;j<Sec3[0].length;j++)
				{
					if(j <2)
					{
						Sec3[i][j] = rand.nextInt(31);
					}
					else if(j == 2)
					{
						Sec3[i][j] = rand.nextInt(16);
					}
					else if(j == 3)
					{
						Sec3[i][j] = rand.nextInt(21);
					}
					else
					{
						Sec3[i][j] = rand.nextInt(6);
					}
					a = a + Sec3[i][j];
					n1 = n1 + Sec3[i][j]+"\t";
				}
				n1=n1+"\n";
				Sum[i][0] = Integer.toString(a);
				a = 0;
			}
			return n1;
		}
		
		

