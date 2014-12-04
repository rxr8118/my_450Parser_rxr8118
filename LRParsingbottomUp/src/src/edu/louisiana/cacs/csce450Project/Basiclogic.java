package src.edu.louisiana.cacs.csce450Project;

import java.io.Console;
import java.util.Scanner;

public class Basiclogic {
	public  void coreLogic()
	{
		try{		
			Parser.stack.push(0);

			Parser m1=new Parser();
			m1.InitiateTable();
			m1.InitiateRuleGrammer();

			Console console = System.console();

			Scanner in = new Scanner(System.in);
			System.out.print("Please enter Parse String : ");
			String parseString = in.nextLine();    
			parseString=parseString+"$";
			String invertedString = new StringBuffer(parseString).reverse().toString();


			char[] a1;
			a1=invertedString.toCharArray();
			for (int i=0; i<a1.length;i++)
			{
				if(parseString.contains("id"))
				{
					if(i<=a1.length-2)
					{
						String temp=""+a1[i]+a1[i+1];
						if(temp.equals("di"))
						{
							Parser.input.push("id");
							i++;
						}
						else{
							Parser.input.push(a1[i]);
						}

					}
					else{
						Parser.input.push(a1[i]);
					}

				}
				else{
					Parser.input.push(a1[i]);
				}
			}


			String header1="Stack";
			header1=m1.properLayout(header1);
			System.out.print(header1);

			String header2="input tokens";
			header2=m1.properLayout(header2);
			System.out.print(header2);

			String header3="action lookup";
			header3=m1.properLayout(header3);
			System.out.print(header3);

			String header4="action value";
			header4=m1.properLayout(header4);
			System.out.print(header4);

			String header5="value of LHS";
			header5=m1.properLayout(header5);
			System.out.print(header5);

			String header6="Length of RHS";
			header6=m1.properLayout(header6);
			System.out.print(header6);


			String header7="temp stack";
			header7=m1.properLayout(header7);
			System.out.print(header7);

			String header8="goto lookup";
			header8=m1.properLayout(header8);
			System.out.print(header8);

			String header9="goto value";
			header9=m1.properLayout(header9);
			System.out.print(header9);

			String header10="Stack action";
			header10=m1.properLayout(header10);
			System.out.print(header10);

			String header11="parse tree stack";
			header11=m1.properLayout(header11);
			System.out.println(header11);


			System.out.println("===================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
			do
			{



				System.out.print("");
				String print1=""+Parser.stack+"";
				print1=m1.properLayout(print1);
				System.out.print(print1);
				String print2=""+Parser.input+"";
				print2=m1.properLayout(print2);
				System.out.print(print2);


				String ActioLookupString=m1.gettableforActionLookup();

				String actionValue=m1.getActionValue(ActioLookupString);

				if(actionValue!=null )
				{
					if(actionValue.contains("S"))
					{		System.out.print(Parser.spacestobeadded);

					Parser.valueforActionValueInteger=Integer.parseInt(""+actionValue.charAt(actionValue.length()-1));

					m1.pushinStack(Parser.valueforActionValueInteger,"S");

					}
					else
					{
						if(actionValue.contains("R"))
						{			
							Parser.valueforActionValueInteger=Integer.parseInt(""+actionValue.charAt(actionValue.length()-1));

							String st1=m1.getValueOfLHS();
							String print3=""+st1.charAt(0)+"";
							print3=m1.properLayout(print3);
							System.out.print(print3);
							Parser.valueOfLHS=""+st1.charAt(0);
							m1.getLengthOfRHS(st1);
							m1.getTempStack();
							String GoToLookUp=m1.getGoToLookUp();
							String print4=Parser.MapFoGoto.get(GoToLookUp)+"";
							print4=m1.properLayout(print4);
							System.out.print(print4);
							Parser.GoToValue=Integer.parseInt(Parser.MapFoGoto.get(GoToLookUp));
							m1.pushinStack(Parser.valueforActionValueInteger,"R");		

						}
						else{
							if(actionValue.contains("Accept"))
							{
								System.out.println("\n\n\n");

								Parser.printablescreenforoutput=Parser.printablescreenforoutput.replace("[", "");
								Parser.printablescreenforoutput=Parser.printablescreenforoutput.replace("]", " ");
								Parser.printablescreenforoutput=Parser.printablescreenforoutput.replace(" ", "");
								Parser.printablescreenforoutput.trim();

								char[] printable=Parser.printablescreenforoutput.toCharArray();
								int positionoflastid=0;
								int noofid=0;
								int donotprint=0;
								String space="";
								Parser.skipthis=0;
								for(int i=0;i<=printable.length;i++)
								{
									if(i<printable.length)
									{
										String tempstr=""+printable[i];
										if(tempstr.equals("i"))
										{		Parser.skipthis=0;						
										i++;
										noofid++;
										System.out.println("id");
										if(noofid==1)
										{
											space=" ";
										}
										if(noofid==2)
										{
											space="  ";
										}
										}
										else{
											if(Parser.skipthis==0 && noofid!=0)
											{
												System.out.print(space+printable[i]);
												Parser.skipthis=1;
											}
											else{
												System.out.print(printable[i]);
											}

										}
									}
								}


							}
						}
					}



				}	

			}
			while(!Parser.actionValue.equals("Accept"));





			m1.InsertToStack("");
		}
		catch(Exception e)
		{
			System.out.println("Error while initial Processing...please check the code...and provide proper input");
		}

		}
	

}
