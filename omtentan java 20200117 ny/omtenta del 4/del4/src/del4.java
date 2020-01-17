import java.util.*;
import java.util.ArrayList;
public class del4  {

    //Genererar listan
    public static void main(String args[]){
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Sverige");
        lista.add("Danmark");
        lista.add("Norge");
        lista.add("Kina");
        lista.add("Albanien");
        lista.add("Chile");
        lista.add("Indien");
        lista.add("Frankrike");
        lista.add("Finland");
        lista.add("Island");


        //Ställer frågan om listan innehåller Sverige
        boolean ans = lista.contains("Sverige");
        if (ans)
            //Svar om listan innehåller Sverige
            System.out.println("Listan innehåller Sverige");

        //Svar om listan inte innehåller Sverige
        else
            System.out.println("Listan innehåller inte Sverige");

    }
}