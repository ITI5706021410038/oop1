package h1;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;
public class homework2
{
	int A,E,I,O,U;
	
	public String getData()
	{
		String name = JOptionPane.showInputDialog(null,"Enter name ","InputData",JOptionPane.QUESTION_MESSAGE);
		name = name.toUpperCase();
		return name;
	}
