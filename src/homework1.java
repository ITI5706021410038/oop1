package h1;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;
public class homework1
{
	int Sec,Min,Hour,Day;
	public void getData()
	{
		Sec = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Sec","Input",JOptionPane.QUESTION_MESSAGE));
	}
	public void Calc()
	{
		Min = Sec / 60;
		Sec = Sec % 60;
		
		Hour = Min / 60;
		Min = Min % 60;
		
		Day = Hour/24;
		Hour = Hour % 24;
	}
	public void Print()
	{
		
		JOptionPane.showMessageDialog(null,"Time \n Day:Hour:Min:Sec\n "+Day+":"+Hour+":"+Min+":"+Sec,"Message",JOptionPane.INFORMATION_MESSAGE);
	}
	public static void main(String[] args) 
	{
		homework1 ts1 = new homework1();
		ts1.getData();
		ts1.Calc();
		ts1.Print();
	}

}
	
	
