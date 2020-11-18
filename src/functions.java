import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class functions {

    Scanner scanner;
    Random random;
    rooms Rooms = new rooms();

    public void przejscie(boolean czyPrzeszlo) {
        if (czyPrzeszlo) {
            System.out.println("Udaje ci się przejść do następnego pokoju...");
        } else {
            System.out.println("Nie udaje ci się...");
            gameover();
            System.out.println("\n\n");
            Rooms.room1();
        }

        zeruj();
    }

    public void animation() {
        System.out.println();
        for (int i = 0; i < 10; ++i) {
            System.out.print("⚫");
            try {
                Thread.sleep(200L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public void gameover() {
        List<String> deaths = new ArrayList();
        deaths.add("Otwierasz wybrane drzwi i spadasz w dół łamiąc sobie kark");
        deaths.add("Otwierasz wybrane drzwi i dostajesz z zatrutego bełta, trucizna cie paraliżuje i dopada cie bestia");
        deaths.add("Otwierasz wybrane drzwi i widzisz małą dziewczynke z nożem,nim się zaorientowałeś dziewczynka wbiła ci nóż w żebra,umierasz w męczarniach słysząc w tle śmiech bestii");
        deaths.add("Otwierasz wybrane drzwi i widzisz księdza z pistoletem który wystrzeliwuje w ciebie kilka kul, umierasz słysząc jego modlitwe do bestii");
        deaths.add("Otwierasz wybrane drzwi i widzisz ślepy zaułek, bestia dopada cie w nim zanim zdążyłeś ją zobaczyć, widzisz tylko jak części twojego ciała wylatują przez korytarz w akompaniamencie śmiechu bestii");
        deaths.add("Otwierasz wybrane drzwi i czujesz smród starej kremówki i wody święconej, zostałeś zagazowany słysząc w tle śmiech bestii");
        deaths.add("Otwierasz wybrane drzwi i widzisz wychudzonego ministranta, w ciągu ułamka sekundy przebija ci serce krzyżem i zaczyna cie jeść żywcem, umierasz słysząc śmiech bestii ");
        int losuj = random.nextInt(deaths.size() - 1);
        System.out.println((String) deaths.get(losuj));
    }

    public void wrongDoorsValue(){
        System.out.println("Panikujesz, nie wiesz co robisz, nie wiesz co się dzieje. Nagle na podjęcie decyzji jest już za późno, słyszysz bestie tuż za plecami...");
        zeruj();
        Rooms.room1();
    }
    public void zeruj() {
        Rooms.setPrzejsciePrzezDrzwi(false);
        Rooms.setDrzwi(0);
    }
}
