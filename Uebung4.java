import uebungen.uebungsblatt2.*;

public class Uebung4
{
    public static void main(String[] args)
	{
		Student4 st1 = new Student4("Jimini Cricket","1234",Studiengruppe.IB2A);
		
		Professor4 prof1 = new Professor4("El Professor", "4321", "Informatik");
			
		Student4 st2 = new Student4("Marc-Andr\u00E9 ter Stegen", "902189900" ,null, "Carrer d'Ar\u00EDstides Maillol", "23",                                    			       Ort.Barcelona_Espa\u00F1a, 8028);
		
		Professor4 prof2 = new Professor4("Quique Seti\u00E9", "999999" ,null, "Carrer d'Ar\u00EDstides Maillol", "32",                                    			      			   Ort.Barcelona_Espa\u00F1a, 8000);
		
		System.out.println(st1.getAssignment());
		System.out.println();
		System.out.println(prof1.getAssignment());
		System.out.println();
		System.out.println(st2.getAssignment());
		System.out.println();
		System.out.println(prof2.getAssignment());
		
		

	}
}