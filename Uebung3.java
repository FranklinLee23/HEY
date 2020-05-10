import java.util.*;

import uebungen.uebungsblatt2.*;

public class Uebung3
{
    public static void main(String[] args)
    {
        Student3 student1 = new Student3("Marc-Andr\u00E9 ter Stegen", "902189900" , "ES",Studiengruppe.IB2A, "Carrer d'Ar\u00EDstides Maillol", "23", Ort.Barcelona_Espa\u00F1a, 8028);
        Student3 student2 = new Student3("Franz, Kaiser und Lichtgestalt", "1234", "DE",Studiengruppe.IB2A);

        StringTokenizer st1 = new StringTokenizer(student1.getDetails());
        StringTokenizer st2 = new StringTokenizer(student2.getDetails());

        System.out.println("Student1");
        System.out.println(student1.getDetails());
        System.out.println();
        System.out.println();
        while(st1.hasMoreTokens())
        {
            System.out.println(st1.nextToken());
        }
        System.out.println();
        System.out.println();
        System.out.println("Student2");
        System.out.println(student2.getDetails());
        System.out.println();
        System.out.println();
        while(st2.hasMoreTokens())
        {
            System.out.println(st2.nextToken());
        }
    }
}
