package src.edu.louisiana.cacs.csce450Project;

public class InitiateTables {
	public static void InitiateTables()
	{
		Parser.TableforActionMap.put("0id","S5");
		Parser.TableforActionMap.put("0(","S4");



		Parser.TableforActionMap.put("1+","S6");		
		Parser.TableforActionMap.put("1$","Accept");


		Parser.TableforActionMap.put("2+","R2");
		Parser.TableforActionMap.put("2*","S7");
		Parser.TableforActionMap.put("2)","R2");
		Parser.TableforActionMap.put("2$","R2");


		Parser.TableforActionMap.put("3+","R4");
		Parser.TableforActionMap.put("3*","R4");
		Parser.TableforActionMap.put("3)","R4");
		Parser.TableforActionMap.put("3$","R4");

		Parser.TableforActionMap.put("4id","S5");
		Parser.TableforActionMap.put("4(","S4");


		Parser.TableforActionMap.put("5+","R6");
		Parser.TableforActionMap.put("5*","R6");
		Parser.TableforActionMap.put("5)","R6");
		Parser.TableforActionMap.put("5$","R6");

		Parser.TableforActionMap.put("6id","S5");		
		Parser.TableforActionMap.put("6(","S4");


		Parser.TableforActionMap.put("7id","S5");
		Parser.TableforActionMap.put("7(","S4");


		Parser.TableforActionMap.put("8+","S6");
		Parser.TableforActionMap.put("8)","S11");


		Parser.TableforActionMap.put("9+","R1");
		Parser.TableforActionMap.put("9*","S7");
		Parser.TableforActionMap.put("9)","R1");
		Parser.TableforActionMap.put("9$","R1");

		Parser.TableforActionMap.put("10+","R3");
		Parser.TableforActionMap.put("10*","R3");
		Parser.TableforActionMap.put("10)","R3");
		Parser.TableforActionMap.put("10$","R3");


		Parser.TableforActionMap.put("11+","R5");
		Parser.TableforActionMap.put("11*","R5");
		Parser.TableforActionMap.put("11)","R5");
		Parser.TableforActionMap.put("11$","R5");

		Parser.MapFoGoto.put("0E", "1");
		Parser.MapFoGoto.put("0T", "2");
		Parser.MapFoGoto.put("0F", "3");

		Parser.MapFoGoto.put("4E", "8");
		Parser.MapFoGoto.put("4T", "2");
		Parser.MapFoGoto.put("4F", "3");

		Parser.MapFoGoto.put("6T", "9");
		Parser.MapFoGoto.put("6F", "3");


		Parser.MapFoGoto.put("7F", "10");


	}
	
	public void InitiateGrammer()
	{
		Parser.RuleGrammer.put(1,"E->E+T" );
		Parser.RuleGrammer.put(2, "E->T");
		Parser.RuleGrammer.put(3, "T->T*F");
		Parser.RuleGrammer.put(4, "T->F");
		Parser.RuleGrammer.put(5, "F->(E)");
		Parser.RuleGrammer.put(6, "F->id");
	}

}
