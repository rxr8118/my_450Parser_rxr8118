package src.edu.louisiana.cacs.csce450Project;
import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

import com.sun.org.apache.bcel.internal.generic.GOTO;


public class Parser {


	static HashMap<String, String> MapFoGoto = new HashMap<String, String>();
	static HashMap<String, String> TableforActionMap = new HashMap<String, String>();

	static String stackortempString;
	static HashMap<Integer, String> RuleGrammer = new HashMap<Integer, String>();


	static int valueforActionValueInteger;


	static ArrayList ParseTreeStack11=new ArrayList();


	public static String endoftempstack="";
	public static String lastInserted="";


	public static int lengthOfRHS=0;
	public static String valueOfLHS="";


	public static String forsecondlastvalue="";
	public static String spacestobeadded="";

	public static String printablescreenforoutput="";
	public static String stringsecondlast="";

	static Stack input=new Stack();
	public static int skipthis=0;

	static String tableforActionLookup;
	static Stack stack=new Stack();
	static String actionValue;

	public static int GoToValue=0;
	static String parseTreeStack="";

	public Parser() {
		// TODO Auto-generated constructor stub
	}

	public static void parse()
	{	
		Basiclogic bl=new Basiclogic();
		bl.coreLogic();
	
	}

	public void InitiateRuleGrammer()
	{
	InitiateTables IT=new InitiateTables();
	IT.InitiateGrammer();
	}

	public void InsertToStack(String processString)
	{try{
		char[] a2;
		a2=processString.toCharArray();

		for (int i=0; i<a2.length;i++)
		{
			stack.push(a2[i]);

		}
	}
	catch(Exception e)
	{
		System.out.println("error while inserting to stack");
	}

	}



	public String getActionValue(String tableforActionLookup)
	{String ActionValue=TableforActionMap.get(tableforActionLookup);
		try{
		
		String print6=ActionValue+"";
		print6=properLayout(print6);
		System.out.print(print6);		
		actionValue=ActionValue;
	}
	catch(Exception e)
	{
		System.out.println("error while getting action values");
	}
		return ActionValue;
	
	
	
	}
	public String gettableforActionLookup()
	{
		Getters ge=new Getters();

		return ge.lookupgetter();
	}



	public String getValueOfLHS()
	{
		String str1=RuleGrammer.get(valueforActionValueInteger);

		return str1;
	}

	public int getLengthOfRHS( String st1)
	{
		Getters ge=new Getters();
		return ge.LengthOfRHS(st1);

	}
	public String getGoToLookUp()
	{String print10="["+endoftempstack+","+valueOfLHS+"]"+"";
	print10=properLayout(print10);
	System.out.print(print10);

	return endoftempstack+valueOfLHS;
	}

	public String getTempStack()
	{
		Getters ge=new Getters();
		ge.TempStack();

		return "";
	}





	public String properLayout(String str1)
	{
		String finalStringtoprint="";
		try{
		String spacestoadd="";
		if(str1.length()<35)
		{
			int spacesrequired=35-str1.length();
			for(int i=0;i<=spacesrequired;i++)
			{
				spacestoadd=spacestoadd+" ";
			}


		}
		if(spacestobeadded.length()<=2)

			for(int i=0;i<=179;i++)
			{
				spacestobeadded=spacestobeadded+" ";
			}
		finalStringtoprint=str1+spacestoadd;
		}
		catch(Exception e)
		{
			System.out.println("error while creating proper layout");
		}
		return finalStringtoprint;}

	public void pushinStack(int a,String sr)
	{
		PushinStack pis=new PushinStack();
		pis.pushinStack(a, sr);
	}
	public void Print()
	{
		if(lastInserted.equals("id"))
		{


		}
	}



	public void InitiateTable()
	{

		InitiateTables IT=new InitiateTables();
		IT.InitiateTables();
	}


}
