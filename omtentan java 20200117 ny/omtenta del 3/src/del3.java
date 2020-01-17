import java.util.*;
public class del3  {

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



        //Sorterar
        Collections.sort(lista);

//Skriver ut listan i konsolen
        System.out.println("Länder i alfabetisk ordning:");
        for(String counter: lista){
            System.out.println(counter);
        }
    }
}