import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
import java.util.List;

public class rooms { //funkcja która odpowiada za sprawdzanie czy przeszło się przez zagadkę, jeszcze potem jak bartek ogarnie teksty do śmierci to się ogarnie losowanie ich
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int drzwi;
    boolean przejsciePrzezDrzwi;
    public void przejscie(boolean czyPrzeszlo){
        if(czyPrzeszlo){System.out.println("Udaje ci się przejść do następnego pokoju...");}else{
            System.out.println("Nie udaje ci się...");
            gameover();
            System.out.println("\n\n");
            room1();
        }
        przejsciePrzezDrzwi = false;
        drzwi = 0; //zeruje tu zmienne dzięki czemu jak gracz nic nie wpisze to ZAWSZE przegra, musi coś wpisać (dane z poprzedniego pokoju nie będą zapisane)
    }
    public void gameover(){ //funkcja jak się do złych drzwi wejdzie
        int losuj;
        List<String> deaths = new ArrayList<>();
        deaths.add("Otwierasz wybrane drzwi i spadasz w dół łamiąc sobie kark");
        deaths.add("Otwierasz wybrane drzwi i dostajesz z zatrutego bełta, trucizna cie paraliżuje i dopada cie bestia");
        deaths.add("Otwierasz wybrane drzwi i widzisz małą dziewczynke z nożem,nim się zaorientowałeś dziewczynka wbiła ci nóż w żebra,umierasz w męczarniach słysząc w tle śmiech bestii");
        deaths.add("Otwierasz wybrane drzwi i widzisz księdza z pistoletem który wystrzeliwuje w ciebie kilka kul, umierasz słysząc jego modlitwe do bestii");
        deaths.add("Otwierasz wybrane drzwi i widzisz ślepy zaułek, bestia dopada cie w nim zanim zdążyłeś ją zobaczyć, widzisz tylko jak części twojego ciała wylatują przez korytarz w akompaniamencie śmiechu bestii");
        deaths.add("Otwierasz wybrane drzwi i czujesz smród starej kremówki i wody święconej, zostałeś zagazowany słysząc w tle śmiech bestii");
        deaths.add("Otwierasz wybrane drzwi i widzisz wychudzonego ministranta, w ciągu ułamka sekundy przebija ci serce krzyżem i zaczyna cie jeść żywcem, umierasz słysząc śmiech bestii ");
        losuj = random.nextInt(deaths.size() - 1);
        System.out.println(deaths.get(losuj));
    }
    public void room1(){
        System.out.println("Wprowadzenie, które ma napisać Bartek");
        System.out.println("Przed tobą stoją 2 pary drzwi i zagadka...");
        System.out.println("\"Gdy powstał świat,\nja już tam byłam,\ngdy ewolucja postępowała,\nja już tam byłam,\nwszystkie wojny,\nprzetrwałam,\nmój wiek jest tajemnicą,\ndumnie zasiadam w królestwie herbaty,\ncały świat jest mi poddany,\nkim jestem?\"");
        System.out.println("Które drzwi wybierasz,\n[1] - drzwi nr 1\n[2] - drzwi nr 2");
        drzwi = scanner.nextInt();
        switch(drzwi){
            case 1 -> przejsciePrzezDrzwi = false;
            case 2 -> przejsciePrzezDrzwi = true;
            default -> System.out.println("???jakiś error żeby wyjebało"); //to trzeba dopracować, idk może jakiś easter egg w odrębnej funkcji, nie wiem (nie dałem defaultów dalej, trzeba będzie je później dodać
        }
        przejscie(przejsciePrzezDrzwi);
        room2();
    }
    public void room2(){
        System.out.println("Widzisz drzwi, 3 pary, na każdych jest nazwisko:");
        System.out.println("[1] - Krzysztof Krawczyk\n[2] - Zbigniew Wodecki\n[3] - Kamil Bednarek");
        System.out.println("Nad drzwiami zaś widzisz zagadkę \"Me życie to bajka,w której gram role grajka,\nnie obchodzi mnie rasa, religia czy pejs,\nja po prostu chce popłynąć statkiem w piękny rejs,\nkim jestem?\""); // \" sprawia że w tekście widać cudzysłów
        System.out.println("Które drzwi wybierasz?");
        drzwi = scanner.nextInt();
        switch(drzwi){
            case 1 -> przejsciePrzezDrzwi = true;
            case 2,3 -> przejsciePrzezDrzwi = false;
        }
        przejscie(przejsciePrzezDrzwi);
        room3();
    }
    public void room3(){
        System.out.println("ciąg dalszy nastąpi i guess");
    }
}