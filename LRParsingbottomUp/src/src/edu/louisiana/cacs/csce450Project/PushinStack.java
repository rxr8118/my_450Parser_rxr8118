package src.edu.louisiana.cacs.csce450Project;

public class PushinStack {
	public void pushinStack(int a,String sr)
	{
		try{String st1="";
		if(sr.equals("S"))
		{
			st1=(String) Parser.input.pop();
			Parser.stack.push(st1);
			Parser.stack.push(a);
			Parser.lastInserted=st1;
			String print11="push "+Parser.lastInserted+""+Parser.valueforActionValueInteger+"";
			Parser parser=new Parser();
			print11=parser.properLayout(print11);
			System.out.print(print11);
		}

		if(sr.equals("R"))
		{				
			Parser.lastInserted=st1;
			String print12="push "+Parser.valueOfLHS+""+Parser.GoToValue+"";
			Parser parser=new Parser();

			print12=parser.properLayout(print12);
			System.out.print(print12);
		}


		if(!Parser.lastInserted.contains("+") && !Parser.lastInserted.contains("*"))			
			if(st1.equals("id"))
			{	
				Parser.ParseTreeStack11.add(Parser.parseTreeStack);

				Parser.parseTreeStack="id";
				String print13=Parser.parseTreeStack;
				String forstackprint="";
				for(int i=0;i<Parser.ParseTreeStack11.size();i++)
				{
					if(Parser.ParseTreeStack11.size()>1)
					{
						forstackprint=forstackprint+Parser.ParseTreeStack11.get(Parser.ParseTreeStack11.size()-i-1);
					}
					else{
						forstackprint=forstackprint+Parser.ParseTreeStack11.get(i);
					}


				}

				if(Parser.ParseTreeStack11.size()>1)
				{
					System.out.println(print13+forstackprint);
				}
				else{
					System.out.println(print13);	
				}
			}
			else{		
				if(sr.equals("S"))
				{
					Parser.parseTreeStack="["+" "+Parser.lastInserted+" "+Parser.parseTreeStack+" "+"]";
					System.out.println(Parser.parseTreeStack+"");
				}
				if(sr.equals("R"))
				{
					if(Parser.lengthOfRHS==1)
					{

						Parser.parseTreeStack="["+" "+Parser.valueOfLHS+" "+Parser.parseTreeStack+" "+"]";

						String forstackprint="";
						for(int i=0;i<Parser.ParseTreeStack11.size();i++)
						{

							if(Parser.ParseTreeStack11.size()>1)
							{
								forstackprint=forstackprint+Parser.ParseTreeStack11.get(Parser.ParseTreeStack11.size()-i-1);
							}
							else{
								forstackprint=forstackprint+Parser.ParseTreeStack11.get(i);
							}

						}

						if(Parser.ParseTreeStack11.size()>=1)
						{
							System.out.println(Parser.parseTreeStack+forstackprint);
						}


						Parser.stack.push(Parser.valueOfLHS);
						Parser.stack.push(Parser.GoToValue);
					}
					else{
						if(Parser.skipthis==0)
						{

							String action=Parser.RuleGrammer.get(Parser.valueforActionValueInteger);
							Parser.forsecondlastvalue="["+" "+Parser.valueOfLHS+" "+Parser.ParseTreeStack11.get(Parser.ParseTreeStack11.size()-1)+" "+action.charAt(4)+Parser.parseTreeStack+"]";

							Parser.parseTreeStack="["+" "+Parser.valueOfLHS+" "+Parser.ParseTreeStack11.get(Parser.ParseTreeStack11.size()-1)+" "+action.charAt(4)+Parser.parseTreeStack+"]";
							Parser.skipthis=1;
							String forstackprint="";
							for(int i=0;i<Parser.ParseTreeStack11.size()-1;i++)
							{if((Parser.ParseTreeStack11.size()-i-1)!=Parser.ParseTreeStack11.size()-1)
								forstackprint=forstackprint+Parser.ParseTreeStack11.get(Parser.ParseTreeStack11.size()-i-1);

							}
							Parser.stringsecondlast=forstackprint;

							System.out.println(Parser.parseTreeStack+forstackprint);



							Parser.stack.push(Parser.valueOfLHS);
							Parser.stack.push(Parser.GoToValue);
						}
						else{
							String action=Parser.RuleGrammer.get(Parser.valueforActionValueInteger);
							Parser.printablescreenforoutput="["+" "+Parser.valueOfLHS+" "+Parser.stringsecondlast+" "+action.charAt(4)+Parser.forsecondlastvalue+"]";
							System.out.println(Parser.printablescreenforoutput);
							Parser.stack.push(Parser.valueOfLHS);
							Parser.stack.push(Parser.GoToValue);
						}
					}
				}

			}
		System.out.println();
		}
		catch(Exception e)
		{
			System.out.println("error while processing major operations:fatal");
		}
	}

}
