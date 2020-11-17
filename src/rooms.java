//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.sun.jdi.InconsistentDebugInfoException;

import java.awt.desktop.ScreenSleepEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class rooms {
    Scanner scanner;
    Random random;
    int drzwi;
    boolean przejsciePrzezDrzwi;

    public rooms() {
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    public void przejscie(boolean czyPrzeszlo) {
        if (czyPrzeszlo) {
            System.out.println("Udaje ci się przejść do następnego pokoju...");
        } else {
            System.out.println("Nie udaje ci się...");
            this.gameover();
            System.out.println("\n\n");
            this.room1();
        }

        this.przejsciePrzezDrzwi = false;
        this.drzwi = 0;
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
        int losuj = this.random.nextInt(deaths.size() - 1);
        System.out.println((String) deaths.get(losuj));
    }

    public void room1() {
        System.out.println("Budzisz sie.... nie wiesz gdzie jesteś...... jest ciemno.... mokro..... i śmierdzi kremówką....... szukasz po omacku czegokolwiek co mogłoby pomóc.... łapiesz coś podłóżnego....... chudego...... szukasz dalej..... dalej...... znajdujesz coś co w dotyku przypomina latarke......... zapalasz....... widzisz że to co wcześniej złapałeś to było ramie szkieleta małego dziecka......... tutaj jest pełno szkieletów....... wszytkie to dzieci......... słyszysz gdzieś ryki potwora........ pamiętasz........ złapało coś cie na ulicy kiedy wracałeś..... ale skąd?........ jedno jest pewne........ MUSISZ UCIEKAĆ");
        System.out.println("Dobiegasz do pierwszego rozwidlenia. Widzisz drzwi, 2 pary drzwi.\n Nad drzwiami widzisz wiersz, wygląda na... zagadkę? Może to być podpowiedź, którymi drzwiami przejść");
        System.out.println("Gdy powstał świat,\nja już tam byłam,\ngdy ewolucja postępowała,\nja już tam byłam,\nwszystkie wojny,\nprzetrwałam,\nmój wiek jest tajemnicą,\ndumnie zasiadam w królestwie herbaty,\ncały świat jest mi poddany,\nkim jestem?");
        System.out.println("Które drzwi wybierasz?\n[1] - pierwsze drzwi\n[2] - drugie drzwi");
        this.drzwi = this.scanner.nextInt();
        switch (this.drzwi) {
            case 1 -> this.przejsciePrzezDrzwi = false;
            case 2 -> this.przejsciePrzezDrzwi = true;
            default -> System.out.println("???jakiś error żeby wyjebało");
        }

        this.przejscie(this.przejsciePrzezDrzwi);
        this.room2();
    }

    public void room2() {
        System.out.println("Udało sie, dałeś rade, przypominasz sobie, że wracałeś z pizzeri....... ale dokąd?........ którędy?.... nie masz czasu sie zastanawiać, słyszysz za sobą ryki potwora........");
        System.out.println("Biegniesz...... coraz więcej zakrętów........ ryki ucichły nieco.... masz troche czasu....... dobiegasz do kolejnego rozwidlenia");
        System.out.println("Widzisz drzwi, 3 pary, na każdych jest nazwisko:");
        System.out.println("[1] - Krzysztof Krawczyk\n[2] - Zbigniew Wodecki\n[3] - Kamil Bednarek");
        System.out.println("Nad drzwiami zaś widzisz kolejny wiersz \"Me życie to bajka,w której gram role grajka,nie obchodzi mnie rasa,religia czy pejs, ja po prostu chce popłynąć statkiem w piękny rejs,kim jestem?\"");
        System.out.println("Które drzwi wybierasz?");
        this.drzwi = this.scanner.nextInt();
        switch (this.drzwi) {
            case 1 -> this.przejsciePrzezDrzwi = true;
            case 2,3 -> this.przejsciePrzezDrzwi = false;
        }

        this.przejscie(this.przejsciePrzezDrzwi);
        this.room3();
    }

    public void room3() {
        String[] answers = {"puszka", "butelka", "telewizor"};
        System.out.println("Pamiętasz.... kolejny szczegół..... byłeś...... nie, jesteś uczniem.... 7 klasa..... prawdopodobnie...... ale co tu robisz?.... jak sie tu znalazłeś?........ kolejne drzwi.... gdzie ty jesteś....... co?.....");
        System.out.println("Widzisz 3 guziki: " + answers[0] + ", " + answers[1] + ", " + answers[2] + ".\nNad przyciskami wisi zagadka.");
        String odp;
            System.out.println("\"Na fotelu siedze ja,\nczasem tu są niezłe jaja,\nsiedze tutaj cały dzień,\nco oglądam proszę ja cie?\"");
            odp = scanner.next();
            if (odp.equals(answers[2])) { //zamieniłem zwykłe odpowiedzi na tablice
                System.out.println("\"Siedze dalej, pudło gra, może wypić coś się da?\nSam ja jestem proszę ciebie, cóż ja wypić mogę w tym niebie?\"");
                odp = scanner.next();
                if (odp.equals(answers[0])) {
                    System.out.println("\"Przyszedł boczek, przyszła i menda,\njak powita gości zrzęda?\"");
                    odp = scanner.next();
                    if (odp.equals(answers[1])) {
                        System.out.println("Jam jest Ferdynand Kiepski,\nbestia zamknęła mnie tu i usilnie próbuje wyważyć drzwi,\nostrzegam tego co to czyta aby uciekał czem prędzej przez trzecie drzwi!");
                        przejsciePrzezDrzwi = true;
                    } else {
                        System.out.println("Nie potrafisz rozwiązać zagadki, słysząc bestie coraz bliżej w panice przechodzisz przez którekolwiek drzwi z nadzieją że to te dobre ");
                        przejsciePrzezDrzwi = false;
                    }
                }
            }
        this.przejscie(this.przejsciePrzezDrzwi);
        this.room4();


    }

    public void room4() {
        System.out.println("Biegniesz dalej, kolejna zagadka, kolejne rozwidlenie, zupełnie jak w tym hotelu.......... w hotelu?.....\nDobiegasz do kolejnej zagadki.\n");
        System.out.println("qij T një R nënës Z nënës E qij qij një esbek ndyrë pështy C një lavire në fytyrë,I në mbrëmje, në mëngjes derisa qij është i vdekur E harruar");
        System.out.println("Masz do wyboru 3 pary drzwi. Które wybierasz?\n[1] - pierwsze drzwi\n[2] - drugie drzwi\n[3] - trzecie drzwi");
        this.drzwi = this.scanner.nextInt();
        switch (this.drzwi) {
            case 1, 2 -> this.przejsciePrzezDrzwi = false;
            case 3 -> this.przejsciePrzezDrzwi = true;
            default -> System.out.println("Cholera trudne to było co? Może tak może nie,nie mnie oceniać,ja tu tylko jestem narratorem,BIEGNIJ CHŁOPCZE BIEGNIJ HAHAHAHHA (o ╹‿ ╹ o)");
        }
        this.przejscie(this.przejsciePrzezDrzwi);
        this.room5();
    }

    public void room5() {
        String[] answers = {"marchewka", "szpinak", "brokuł", "jabłko", "banan"};
        System.out.println("Pamiętasz więcej, byłeś uczniem. Jechaliście na wycieczke, pamiętasz jak poszedłeś z kolegami na pizze... oni cie zostawili?..... nie, to chyba nie to..... dobiegasz do kolejnego rozwidlenia");
        System.out.println("Widzisz przed sobą 5 par drzwi, na każdych jest narysowane jedzenie.");
        for(int i = 0; i < answers.length; i++) System.out.println("[" + i + "] - " + answers[i]);
        System.out.println("Nad drzwiami widzisz ogniste litery które tworzą napis \"Jak mi dadzą to jem\"");
        System.out.println("Przez które drzwi przechodzisz? [1-5]");
        drzwi = scanner.nextInt();
        drzwi--;
        switch (drzwi) {
            case 0, 2, 3, 4 -> przejsciePrzezDrzwi = false;
            case 1 -> przejsciePrzezDrzwi = true;
            default -> System.out.println("Trudne? Powinieneś sie domyślać mój drogi gdzie jesteś HAHAHAHAHHAAHA (o ╹‿ ╹ o)");
        }
        przejscie(przejsciePrzezDrzwi);
        room6();
    }

    public void room6() {
        System.out.println("Czujesz w głębi serca, że coraz bardziej bestia zbliża sie do ciebie. Boisz sie jak nigdy dotąd, po ostatniej zagadce czujesz że jeśli nie wytężysz swej głowy i nie pośpieszysz sie z odpowiedziami, ZGINIESZ.");
        System.out.println("Wbiegasz do następnego pokoju, widzisz przed sobą kolejne 2 pary drzwi. Gdy sie rozglądasz, zdajesz sobie sprawe że znajdujesz sie w pokoju w którym znajdują sie różne meble oraz.... łóżko. Czujesz, że bestia jest coraz bliżej i musisz szybko podjąć decyzje - przeszukać łóżko w poszukiwaniu szukając czegoś użytecznego czy uciec przez któreś drzwi");
        System.out.println("[1] Chowam się pod łóżkiem w poszukianiu czegoś użytecznego\n[2]Uciekam dalej");
        this.drzwi = this.scanner.nextInt();
        switch (this.drzwi) {
            case 1 -> {
                this.przejsciePrzezDrzwi = false;
                System.out.println("przeszukujesz łóżko, znajdujesz dziwny kielich,cały ze złota wysadzany po bokach czerwonymi klejnotami widzisz że dziwna ciecz wypełnia go po brzegi, nagle usłyszałeś ciche sapanie widzisz w futrynie drzwi przerażającą sylwetke bestii, widzisz jej zdeformowane ramiona z wybrzuszeniami, długie pazury oraz wykrzywione ze starości plecy, na oko ma 2,5 metra wzrostu, możesz zaobserwować że jakaś ciecz kapie na podłoge,nie wiesz dlaczego ale masz wielką nadzieje że to jednak ślina, nagle usłyszałeś jak w podłodze otworzyła sie klapa, niewiele myśląc wskakujesz do niej i nie wiesz w jaki sposób ale stoisz przed kolejną zagadką ");
            }
            case 2 -> {
                this.przejsciePrzezDrzwi = true;
                System.out.println("opuszczasz sypialnie");
            }
        }

        this.przejscie(this.przejsciePrzezDrzwi);
        this.room7();
    }

    public void room7() {
        System.out.println("Biegniesz dalej kolejne rozwidlenie,jednak pamiętasz że ty uciekałeś już wcześniej, koledzy cie nie zostawili,zostali.......zamordowani......przez tego kultyste w pizzerii....");
        System.out.println("Przed sobą widzisz trzy pary drzwi na których widnieją napisy: na 1 drzwiach ,,z warkoczykami”,na drugich,,obie”,zaś na trzecich,,bez warkoczyków”,gdy spoglądasz w górę widzisz jak w miejscu zagadki tworzą się litery z ognia piekielnego i tworzą napis,,jakie bestia lubi dziewczynki?”");
        this.drzwi = this.scanner.nextInt();
        switch (this.drzwi) {
            case 1, 2 -> this.przejsciePrzezDrzwi = false;
            case 3 -> this.przejsciePrzezDrzwi = true;
            default -> System.out.println("Już wiesz co? Nawet na pewno,ale coż pewności nie ma,hehe,powodzenia może dożyjesz jutra\n" + "(o ╹‿ ╹ o)\n");
        }
        this.przejscie(this.przejsciePrzezDrzwi);
        this.room8();
    }

    public void room8() {
        System.out.println("Biegniesz dalej,kolejne wspomnienia wracają,pamiętasz tego kultyste, zabrał was na pizze po całodziennym zwiedzaniu,wasza wychowawczyni nie protestowała…..czemu?");
        System.out.println("przed sobą widzisz drzwi z numeracją od 1 do 4 postawione obok siebie zaś na środku korytarza stoi tabliczka na której jest napisane,, w którym filmie shreka główny bohater podpisuje cyrograf?” ");
        this.drzwi = this.scanner.nextInt();
        switch (this.drzwi) {
            case 1, 2, 3 -> this.przejsciePrzezDrzwi = false;
            case 4 -> this.przejsciePrzezDrzwi = true;
        }
        this.przejscie(this.przejsciePrzezDrzwi);
        this.room9();
    }

    public void room9() {
        System.out.println("Biegniesz dalej,pamiętasz że koledzy go polubili i poszli z nim na zaplecze….ty zaś do toalety….dlatego przeżyłeś");
        System.out.println("Widzisz 3 pary drzwi z na których są napisy:,,Tadeusz Sznuk”, ,,Hubert Urbański”, ,,Norbi” nad nimi zaś pytanie ,,jak nazywa się prowadzący teleturniej w którym sprzedajesz dusze za słodkie kuferki?”");
        this.drzwi = this.scanner.nextInt();
        switch (this.drzwi) {
            case 1 -> this.przejsciePrzezDrzwi = true;
            case 2, 3 -> this.przejsciePrzezDrzwi = false;
        }
        this.przejscie(this.przejsciePrzezDrzwi);
        this.room10();
    }

    public void room10() {
        System.out.println("Ta miła kelnerka….powiedziała ci gdzie poszli…….z ciekawości tam zajrzałeś…..nigdy tego widoku nie wymażesz z pamięci, postanawiasz nie tracić czasu i uciekać dalej");
        System.out.println("Widzisz przed sobą 2 pary drzwi z napisami ,,tak” oraz ,,nie” wyżej zaś widnieje pytanie  ,,Pan Jezus poświęcił się za ludzkość, a czy ty jesteś dość odważny na taką ofiare?”");
        this.drzwi = this.scanner.nextInt();
        switch (this.drzwi) {
            case 1 -> this.przejsciePrzezDrzwi = false;
            case 2 -> this.przejsciePrzezDrzwi = true;
            default -> System.out.println("Tchórzysz? Czy może ciągle się odradzasz? Co za różnica I TAK W KOŃCU UMRZESZ (o ╹‿ ╹ o)");
        }
        this.przejscie(this.przejsciePrzezDrzwi);
        this.room11();
    }

    public void room11() {
        System.out.println("Pamiętasz kolejne rzeczy,uciekłeś z pizzeri….pamiętasz krzyk tej kelnerki….biegłeś ulicą do hotelu w którym była twoja klasa…..chyba…..(");
        System.out.println("Kolejne 3 pary drzwi na których są wyryte odpowiedzi:,,9%” , ,,2137%” , ,,3%”  ,,ile procent ma beczkowane mocne wiśniowe?”");
        this.drzwi = this.scanner.nextInt();
        switch (this.drzwi) {
            case 1 -> this.przejsciePrzezDrzwi = true;
            case 2, 3 -> this.przejsciePrzezDrzwi = false;
        }
        this.przejscie(this.przejsciePrzezDrzwi);
        this.room12();
    }

    public void room12() {
        System.out.println("widzisz drzwi,rozglądasz sie i widzisz że znowu jesteś w jakieś sypialni....boisz sie i widzisz łóżko,ciekawość korci cie aby je przeszukać ale rozsądek podpowiada ci że lepiej uciekać co robisz?");
        System.out.println("[1]przeszukuje" + "[2]uciekam");
        this.drzwi = this.scanner.nextInt();
        switch (this.drzwi) {
            case 1 -> {
                this.przejsciePrzezDrzwi = true;
                System.out.println("preszukujesz łóżko, znajdujesz dziwny kielich,cały ze złota wysadzany po bokach czerwonymi klejnotami widzisz że dziwna ciecz wypełnia go po brzegi, nagle usłyszałeś ciche sapanie widzisz w futrynie drzwi przerażającą sylwetke bestii, widzisz jej zdeformowane ramiona z wybrzuszeniami, długie pazury oraz wykrzywione ze starości plecy, na oko ma 2,5 metra wzrostu, możesz zaobserwować że jakaś ciecz kapie na podłoge,nie wiesz dlaczego ale masz wielką nadzieje że to jednak ślina, nagle usłyszałeś jak w podłodze otworzyła sie klapa, niewiele myśląc wskakujesz do niej i nie wiesz w jaki sposób ale stoisz przed kolejną zagadką ");
            }
            case 2 -> {
                this.przejsciePrzezDrzwi = true;
                System.out.println("opuszczasz sypialnie");
            }
        }
        this.przejscie(this.przejsciePrzezDrzwi);
        this.room13();
    }

    public void room13() {
        System.out.println("Uciekałeś,krętymi uliczkami,piepszone filmy których się naoglądałeś,to tam mówili ci że to zawsze działa……..pamiętasz ten smród……..pamiętasz……nie…….nie pamiętasz….albo nie chcesz pamiętać");
        System.out.println("widzisz jedne drzwi,całe zakrwawione,widzisz że krew jest wszędzie wymieszana z kremówką,nawet z pod drzwi cieknie na górze zaś pytanie,,Idziesz dalej? HAHAHAHA”");
        System.out.println("[1] ide dalej\n" +
                "[2]rozglądam się\n");
        this.drzwi = this.scanner.nextInt();
        switch (this.drzwi) {
            case 1 -> this.przejsciePrzezDrzwi = false;
            case 2 -> {
                this.przejsciePrzezDrzwi = true;
                System.out.println("znalazłeś małe okienko, przeczołgujesz się przez nie do następnego pokoju");
            }
            default -> System.out.println("Nieźle nieźle,coraz bliżej końca prawda?ciesz się póki możesz ON JUŻ JEST CORAZ BLIŻEJ HAHAHAHA (o ╹‿ ╹ o)");
        }
        this.przejscie(this.przejsciePrzezDrzwi);
        this.room14();

    }

    public void room14() {
        System.out.println("Ta bestia.....to ona cie porwała.....jedyne co pamiętasz po spotkaniu jej to ból głowy……tylko tyle....ale to może i dobrze?.......");
        System.out.println("3 pary…drzwi….nie….masz….już siły…na drzwiach widnieją…..numery:4,3,5…. Nad nimi zaś…pytanie….,,Najlepsza część ,,Heroes Might and Magic”");
        this.drzwi = this.scanner.nextInt();
        switch (this.drzwi) {
            case 1, 2 -> this.przejsciePrzezDrzwi = false;
            case 3 -> this.przejsciePrzezDrzwi = true;
        }
        this.przejscie(this.przejsciePrzezDrzwi);
        this.room15();
    }

    public void room15() {
        System.out.println("Zatrzasnąłeś drzwi,masz chwile czasu….na odpoczynek……");
        System.out.println("Czyżbyś się zmęczył mój drogi????? Te drzwi nie wytrzymają za długo (o ╹‿ ╹ o)");
        System.out.println("Biegniesz dalej,pamiętasz już wszystko,poszedłeś z kolegami na pizze po całym dniu zwiedzania Rzymu,ten kultysta który dosiadł się do was na granicy to zaproponował,wtedy kiedy poszedłeś do łazienki zamordował twoich przyjaciół,gdy uciekałeś do hotelu wpadłeś na to coś,bestia cie porwała,wyglądała znajomo,a więc to miejsce……….");
        System.out.println("Przyjacielu pozwól że wyjaśnie dlaczego wciąż żyjesz,jestem tym którego zwą wiecznym złem,nie pozwoliłbym ci umrzeć w spokoju,dlatego ciągle się odradzasz HAHAHAHAHAHA (o ╹‿ ╹ o)");
        System.out.println("Wystraszony biegniesz dalej,masz dość tego głosu który mówi przez ściany,dobiegasz do kolejnego rozwidlenia");
        System.out.println("2 pary drzwi na których widnieją napisy: ,,Zbigniew Stonoga”, ,,Zbigniew Ziobro” nad nimi pytanie ,,Który prześladuje rodzine drugiego?Wybierz mądrze już prawie jesteś na miejscu”");
        this.drzwi = this.scanner.nextInt();
        switch (this.drzwi) {
            case 1 -> this.przejsciePrzezDrzwi = false;
            case 2 -> this.przejsciePrzezDrzwi = true;


        }
        this.przejscie(this.przejsciePrzezDrzwi);
        this.room16();
    }

    public void room16() {
        System.out.println("To Watykan,nie ma innej opcji,piwnica watykanu, a brat mnie ostrzegał abym nie jechał na tą wycieczke,dobiegasz do wielkiego zdobionego rozwidlenia");
        System.out.println("3 pary drzwi czujesz że to już ostatnia zagadka niestety nie umiesz rozczytać zagadki,patrzysz na nią i widzisz\n" +
                ",, pazzo dietro la terza porta, ma rilassati, non sarai ancora in grado di sfuggire alla bestia\n");
        this.drzwi = this.scanner.nextInt();
        switch (this.drzwi) {
            case 1, 2, 3 -> this.przejsciePrzezDrzwi = true;

        }
        System.out.println("Powodzenia dzieciaku (o ╹‿ ╹ o)");
    }
}