package src.edu.louisiana.cacs.csce450Project;

import java.util.Stack;

public class Getters {

	public String lookupgetter()
	{
		String st1=""+Parser.stack.pop();
		String st2=""+ Parser.input.pop();

		String finalString=st1+st2;
		try{

			Parser.stack.push(st1);
			Parser.input.push(st2);

		Parser.tableforActionLookup="["+st1+","+st2+"]";
		String print5=Parser.tableforActionLookup+"";
		Parser parser=new Parser();
		print5=parser.properLayout(print5);
		System.out.print(print5);
	}
	catch(Exception e)
	{
		System.out.println("error while getting Action lookup");
	}

		return finalString;
	}
	
	public int LengthOfRHS( String st1)
	{
		int length=0;
		try{
		if(st1.contains("id"))
		{
			length=st1.length()-4;
		}
		else
		{
			length=st1.length()-3;

		}
		String print7=""+length+"";
		Parser parser=new Parser();
		print7=parser.properLayout(print7);
		System.out.print(print7);
		Parser.lengthOfRHS=length;
	}
	catch(Exception e)
	{
		System.out.println("error while getting length");
	}
		return length;

	}
	
	
	public String TempStack()
	{try{
		Stack tempStack1=new Stack();	

		tempStack1=Parser.stack;

		
		for(int i=0;i<2*Parser.lengthOfRHS;i++)
		{
			try{
				tempStack1.pop();
			}
			catch(Exception e)
			{String print8="exception"; 
			Parser parser=new Parser();
			print8=parser.properLayout(print8);
			System.out.print("exception");
			}
		}
		String print9=""+tempStack1+"";
		Parser parser=new Parser();

		print9=parser.properLayout(print9);
		System.out.print(print9);
		Parser.endoftempstack=""+tempStack1.pop();
		tempStack1.push(Parser.endoftempstack);
	}
	catch(Exception e)
	{
		System.out.println("error while getting temporary stack");
	}



		return "";
	}

}
