import java.util.Scanner;

public class rooms { //funkcja która odpowiada za sprawdzanie czy przeszło się przez zagadkę, jeszcze potem jak bartek ogarnie teksty do śmierci to się ogarnie losowanie ich
    Scanner scanner = new Scanner(System.in);
    int drzwi;
    boolean przejsciePrzezDrzwi;
    public void przejscie(boolean czyPrzeszlo){
        if(czyPrzeszlo){System.out.println("Udaje ci się przejść do następnego pokoju...");}else{
            System.out.println("Nie udaje ci się...");
            room1();
    }
}
    public void room1(){
        System.out.println("Wprowadzenie, które ma napisać Bartek");
        System.out.println("Przed tobą stoją 2 pary drzwi i zagadka...");
        System.out.println("Gdy powstał świat,\nja już tam byłam,\ngdy ewolucja postępowała,\nja już tam byłam,\nwszystkie wojny,\nprzetrwałam,\nmój wiek jest tajemnicą,\ndumnie zasiadam w królestwie herbaty,\ncały świat jest mi poddany,\nkim jestem?");
        drzwi = scanner.nextInt();
        switch(drzwi){
            case 1 -> przejsciePrzezDrzwi = false;
            case 2 -> przejsciePrzezDrzwi = true;
            default -> System.out.println("???jakiś error żeby wyjebało");
        }
        przejscie(przejsciePrzezDrzwi);
        room2();
    }
    public void room2(){
        System.out.println("treść poziomu drugiego...");
        //gowno
    }
}