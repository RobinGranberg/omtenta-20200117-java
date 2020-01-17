import java.util.ArrayList;

public class del2 {

    public static void main(String[] args) {

        //Skapar arraylistan
        ArrayList<String> Listan = new ArrayList<String>();

        //Elementen
        Listan.add("Gul");
        Listan.add("Sol");
        Listan.add("Bord");
        Listan.add("Stol");


        //Tar bort det sista elementet i listan
        if (Listan.size() > 0)
            Listan.remove(Listan.size() - 1);


        System.out.println(Listan);

    }

}




