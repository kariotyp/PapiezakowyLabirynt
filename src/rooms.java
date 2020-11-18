//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.sun.jdi.InconsistentDebugInfoException;

import java.awt.desktop.ScreenSleepEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class rooms extends functions {
    Scanner scanner;

    public rooms(int drzwi, boolean przejsciePrzezDrzwi, boolean artefakt) {
        super(drzwi, przejsciePrzezDrzwi, artefakt);
        scanner = new Scanner(System.in);
    }

    public rooms() {
        scanner = new Scanner(System.in);
    }


    public void room1() {
        System.out.println("Budzisz sie.... nie wiesz gdzie jesteś...... jest ciemno.... mokro..... i śmierdzi kremówką....... szukasz po omacku czegokolwiek co mogłoby pomóc.... łapiesz coś podłóżnego....... chudego...... szukasz dalej..... dalej...... znajdujesz coś co w dotyku przypomina latarke......... zapalasz....... widzisz że to co wcześniej złapałeś to było ramie szkieleta małego dziecka......... tutaj jest pełno szkieletów....... wszytkie to dzieci......... słyszysz gdzieś ryki potwora........ pamiętasz........ złapało coś cie na ulicy kiedy wracałeś..... ale skąd?........ jedno jest pewne........ MUSISZ UCIEKAĆ");
        System.out.println("Dobiegasz do pierwszego rozwidlenia. Widzisz drzwi, 2 pary drzwi.\nNad drzwiami widzisz wiersz, wygląda na... zagadkę? Może to być podpowiedź, którymi drzwiami przejść");
        System.out.println("Gdy powstał świat,\nja już tam byłam,\ngdy ewolucja postępowała,\nja już tam byłam,\nwszystkie wojny,\nprzetrwałam,\nmój wiek jest tajemnicą,\ndumnie zasiadam w królestwie herbaty,\ncały świat jest mi poddany,\nkim jestem?");
        System.out.println("Które drzwi wybierasz?\n[1] - pierwsze drzwi\n[2] - drugie drzwi");
        try {
            drzwi = scanner.nextInt();
        } catch (Exception exception) {
            scanner.nextInt();
            wrongDoorsValue();
        }
        switch (drzwi) {
            case 1 -> przejsciePrzezDrzwi = false;
            case 2 -> przejsciePrzezDrzwi = true;
            default -> wrongDoorsValue();
        }

        przejscie(przejsciePrzezDrzwi);
        room2();
    }

    public void room2() {
        System.out.println("Udało sie, dałeś rade, przypominasz sobie, że wracałeś z pizzeri....... ale dokąd?........ którędy?.... nie masz czasu sie zastanawiać, słyszysz za sobą ryki potwora........");
        System.out.println("Biegniesz...... coraz więcej zakrętów........ ryki ucichły nieco.... masz troche czasu....... dobiegasz do kolejnego rozwidlenia");
        System.out.println("Widzisz drzwi, 3 pary, na każdych jest nazwisko:");
        System.out.println("[1] - Krzysztof Krawczyk\n[2] - Zbigniew Wodecki\n[3] - Kamil Bednarek");
        System.out.println("Nad drzwiami zaś widzisz kolejny wiersz \"Me życie to bajka,w której gram role grajka,\nnie obchodzi mnie rasa, religia czy pejs,\nja po prostu chce popłynąć statkiem w piękny rejs, kim jestem?\"");
        System.out.println("Które drzwi wybierasz?");
        drzwi = scanner.nextInt();
        switch (drzwi) {
            case 1 -> przejsciePrzezDrzwi = true;
            case 2, 3 -> przejsciePrzezDrzwi = false;
            default -> wrongDoorsValue();
        }

        przejscie(przejsciePrzezDrzwi);
        room3();
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
        przejscie(przejsciePrzezDrzwi);
        room4();
    }

    public void room4() {
        System.out.println("Biegniesz dalej, kolejna zagadka, kolejne rozwidlenie, zupełnie jak w tym hotelu.......... w hotelu?\nDobiegasz do kolejnej zagadki.");
        System.out.println("qij T një R nënës Z nënës E qij qij një esbek ndyrë pështy C një lavire në fytyrë,I në mbrëmje, në mëngjes derisa qij është i vdekur E harruar");
        System.out.println("Masz do wyboru 3 pary drzwi. Które wybierasz?\n[1] - pierwsze drzwi\n[2] - drugie drzwi\n[3] - trzecie drzwi");
        drzwi = scanner.nextInt();
        switch (drzwi) {
            case 1, 2 -> przejsciePrzezDrzwi = false;
            case 3 -> przejsciePrzezDrzwi = true;
            default -> wrongDoorsValue();
        }
        przejscie(przejsciePrzezDrzwi);
        System.out.println("*Cholera, trudne to było co? Może tak, może nie - nie mnie to oceniać, ja tu tylko jestem narratorem, BIEGNIJ CHŁOPCZE, BIEGNIJ!*");
        room5();
    }

    public void room5() {
        String[] answers = {"marchewka", "szpinak", "brokuł", "jabłko", "banan"};
        System.out.println("Pamiętasz więcej, byłeś uczniem. Jechaliście na wycieczke, pamiętasz jak poszedłeś z kolegami na pizze... oni cie zostawili?..... nie, to chyba nie to..... dobiegasz do kolejnego rozwidlenia");
        System.out.println("Widzisz przed sobą 5 par drzwi, na każdych jest narysowane jedzenie.");
        for (int i = 0; i < answers.length; i++) {
            int ii = i + 1;
            System.out.println("[" + ii + "] - " + answers[i]);
        }
        System.out.println("Nad drzwiami widzisz ogniste litery które tworzą napis \"Jak mi dadzą to jem\"");
        System.out.println("Przez które drzwi przechodzisz? [1-5]");
        drzwi = scanner.nextInt();
        drzwi--;
        switch (drzwi) {
            case 0, 2, 3, 4 -> przejsciePrzezDrzwi = false;
            case 1 -> przejsciePrzezDrzwi = true;
            default -> wrongDoorsValue();
        }
        przejscie(przejsciePrzezDrzwi);
        System.out.println("*Trudne? Powinieneś sie domyślać mój drogi gdzie jesteś, HAHAHA!*");
        room6();
    }

    public void room6() {
        System.out.println("Czujesz w głębi serca, że coraz bardziej bestia zbliża sie do ciebie. Boisz sie jak nigdy dotąd, po ostatniej zagadce czujesz że jeśli nie wytężysz swej głowy i nie pośpieszysz sie z odpowiedziami, ZGINIESZ.");
        System.out.println("Wbiegasz do następnego pokoju, widzisz przed sobą kolejne 2 pary drzwi. Gdy sie rozglądasz, zdajesz sobie sprawe że znajdujesz sie w pokoju w którym znajdują sie różne meble oraz.... łóżko. Czujesz, że bestia jest coraz bliżej i musisz szybko podjąć decyzje - przeszukać łóżko w poszukiwaniu szukając czegoś użytecznego czy uciec przez któreś drzwi");
        System.out.println("[1] - Chowam się pod łóżkiem w poszukianiu czegoś użytecznego\n[2] - Uciekam dalej");
        drzwi = scanner.nextInt();
        switch (drzwi) {
            case 1 -> {
                System.out.println("Przeszukujesz łóżko. Nie znajdujesz w nim nic użytecznego, usłyszałeś kroki bestii za drzwiami. Pod wpływem strachu schowałeś sie pod łóżko. Widzisz tylko obrzydliwe nogi które mają zgniłe paznokcie, haluksy i żółty kolor wymieszany z grzybicą. Słyszysz  śmiech potwora, następnie czujesz zimną dłoń na swojej kostce, bestia łapie cie i patroszy śmiejąc sie");
                room1();
            }
            case 2 -> {
                System.out.println("Opuszczasz sypialnie.");
            }
            default -> wrongDoorsValue();
        }
        room7();
    }

    public void room7() {
        System.out.println("Biegniesz dalej przez kolejne rozwidlenia, przypominasz sobie, że ty uciekałeś już wcześniej, koledzy cie nie zostawili,\nzostali....... zamordowani...... przez tego kultyste w pizzerii....");
        System.out.println("Przed sobą widzisz trzy pary drzwi na których widnieją kolejno napisy napisy:\n na 1 drzwiach \"z warkoczykami\",\nna drugich \"obie\",\nzaś na trzecich \"bez warkoczyków\".\nGdy spoglądasz w górę, widzisz jak w miejscu zagadki tworzą się litery z ognia piekielnego i tworzą napis \"Jakie bestia lubi dziewczynki?\"");
        System.out.println("Przez które drzwi przechodzisz?\n[1] - pierwsze drzwi\n[2] - drugie drzwi\n[3] - trzecie drzwi.");
        drzwi = scanner.nextInt();
        switch (drzwi) {
            case 1, 2 -> przejsciePrzezDrzwi = false;
            case 3 -> przejsciePrzezDrzwi = true;
            default -> wrongDoorsValue();
        }
        przejscie(przejsciePrzezDrzwi);
        System.out.println("*Już wiesz, co? Nawet na pewno, ale coż, pewności nie ma, hehe. Powodzenia, może dożyjesz jutra!*");
        room8();
    }

    public void room8() {
        System.out.println("Biegniesz dalej, kolejne wspomnienia wracają. Pamiętasz tego kultyste, zabrał was na pizze po całodziennym zwiedzaniu, wasza wychowawczyni nie protestowała... czemu?");
        System.out.println("Przed sobą widzisz drzwi z ponumerowane od 1 do 4, na środku korytarza stoi tabliczka na której jest pytanie\n\"W którym filmie shreka główny bohater podpisuje cyrograf? [1-4]\"");
        drzwi = scanner.nextInt();
        switch (drzwi) {
            case 1, 2, 3 -> przejsciePrzezDrzwi = false;
            case 4 -> przejsciePrzezDrzwi = true;
            default -> wrongDoorsValue();
        }
        przejscie(przejsciePrzezDrzwi);
        room9();
    }

    public void room9() {
        System.out.println("Biegniesz dalej, pamiętasz że koledzy go polubili i poszli z nim na zaplecze... ty zaś do toalety... dlatego przeżyłeś.");
        System.out.println("Widzisz 3 pary drzwi, każde z nich podpisane innym nazwiskiem:\n[1] - \"Tadeusz Sznuk\"\n[2] - \"Hubert Urbański\"\n[3] - \"Norbi\"\nNad nimi zaś pytanie:\n\"Jak nazywa się prowadzący teleturnieju, w którym sprzedajesz dusze za słodkie kuferki?\"");
        System.out.println("Przez które drzwi przechodzisz?[1-3]");
        drzwi = scanner.nextInt();
        switch (drzwi) {
            case 1 -> przejsciePrzezDrzwi = true;
            case 2, 3 -> przejsciePrzezDrzwi = false;
            default -> wrongDoorsValue();
        }
        przejscie(przejsciePrzezDrzwi);
        room10();
    }

    public void room10() {
        System.out.println("Ta miła kelnerka... powiedziała ci gdzie poszli... z ciekawości tam zajrzałeś... nigdy tego widoku nie wymażesz z pamięci. Nie możesz tracić cennego czasu, uciekasz dalej.");
        System.out.println("Widzisz przed sobą 2 pary drzwi z napisami:\n[1] - \"tak\"\n[2] - \"nie\"\nNad drzwiami zaś widnieje pytanie:\n\"Pan Jezus poświęcił się za ludzkość. Czy ty jesteś dość odważny na taką ofiare?\"");
        System.out.println("Które drzwi wybierasz? [1-2]");
        drzwi = scanner.nextInt();
        switch (drzwi) {
            case 1 -> przejsciePrzezDrzwi = false;
            case 2 -> przejsciePrzezDrzwi = true;
            default -> wrongDoorsValue();
        }
        przejscie(przejsciePrzezDrzwi);
        System.out.println("*Tchórzysz? Czy może już tu byłeś i wiesz jak wygląda rozwiązanie? To bez znaczenia, i tak UMRZESZ!*"); //zmieniłem trochę tekst System.out.println("Tchórzysz? Czy może ciągle się odradzasz? Co za różnica I TAK W KOŃCU UMRZESZ (o ╹‿ ╹ o)");
        room11();
    }

    public void room11() {
        System.out.println("Pamiętasz kolejne rzeczy, uciekłeś z pizzeri... pamiętasz krzyk tej kelnerki... biegłeś ulicą do hotelu w którym była twoja klasa... chyba...");
        System.out.println("Stajesz przed trzema parami drzwi na których są wyryte kolejno odpowiedzi:\n[1] - \"9%\"\n[2] - \"2137%\"\n[3] - \"3%\"\nNad drzwiami widzisz pytanie:\n\"Ile procent ma beczkowane mocne wiśniowe?\"");
        System.out.println("Przez które drzwi decydujesz się przejść? [1-3]");
        drzwi = scanner.nextInt();
        switch (drzwi) {
            case 1 -> przejsciePrzezDrzwi = true;
            case 2, 3 -> przejsciePrzezDrzwi = false;
            default -> wrongDoorsValue();
        }
        przejscie(przejsciePrzezDrzwi);
        room12();
    }

    public void room12() {
        System.out.println("Czujesz w głębi serca, że coraz bardziej bestia zbliża sie do ciebie. Boisz sie jak nigdy dotąd, po ostatniej zagadce czujesz że jeśli nie wytężysz swej głowy i nie pośpieszysz sie z odpowiedziami, ZGINIESZ.");
        System.out.println("Wbiegasz do następnego pokoju, widzisz przed sobą kolejne 2 pary drzwi. Gdy sie rozglądasz, zdajesz sobie sprawe że znajdujesz sie w pokoju w którym znajdują sie różne meble oraz.... łóżko. Czujesz, że bestia jest coraz bliżej i musisz szybko podjąć decyzje - przeszukać łóżko w poszukiwaniu szukając czegoś użytecznego czy uciec przez któreś drzwi");
        System.out.println("[1] - Chowam się pod łóżkiem w poszukianiu czegoś użytecznego\n[2] - Uciekam dalej");
        drzwi = scanner.nextInt();
        switch (drzwi) {
            case 1 -> {
                System.out.println("Przeszukujesz łóżko. Znajdujesz dziwny kielich, cały ze złota, wysadzany po bokach czerwonymi klejnotami.\nWidzisz że dziwna ciecz wypełnia go po brzegi. Nagle usłyszałeś ciche sapanie, widzisz w futrynie drzwi przerażającą sylwetke bestii. Widzisz jej zdeformowane ramiona z wybrzuszeniami, długie pazury oraz wykrzywione ze starości plecy, na oko ma 2,5 metra wzrostu.\nMożesz zaobserwować, że jakaś ciecz kapie na podłoge. Nie wiesz dlaczego, ale masz wielką nadzieje że to jednak ślina.\nNagle usłyszałeś jak w podłodze otworzyła sie klapa, niewiele myśląc wskakujesz do niej i znajdujesz się w innym pomieszczeniu. Uciekasz dalej");
                artefakt = true;
            }
            case 2 -> {
                System.out.println("Opuszczasz sypialnie.");
            }
            default -> wrongDoorsValue();
        }
        room13();
    }

    public void room13() {
        System.out.println("Uciekałeś krętymi uliczkami, pieprzone filmy których się naoglądałeś, to tam mówili ci że to zawsze działa... pamiętasz ten smród... pamiętasz... nie... nie pamiętasz... albo nie chcesz pamiętać.");
        System.out.println("Dobiegasz do drzwi które są całe zakrwawione. Widzisz że krew jest wszędzie wymieszana z kremówką, nawet spod drzwi cieknie.");
        System.out.println("[1] - Przechodzę przez drzwi\n[2] - Rozglądam się po pomieszczeniu");
        drzwi = scanner.nextInt();
        switch (drzwi) {
            case 1 -> przejsciePrzezDrzwi = false;
            case 2 -> {
                przejsciePrzezDrzwi = true;
                System.out.println("Rozglądając się po pomieszczeniu widzisz... okno. Małe okienko, zmieściłbyś sie w nie...");
                System.out.println("[1] - Wybierasz drzwi\n[2] - Wybierasz okno");
                drzwi = scanner.nextInt();
                switch (drzwi) {
                    case 1 -> przejsciePrzezDrzwi = false;
                    case 2 -> {
                        przejsciePrzezDrzwi = true;
                        System.out.println("Zdecydowałeś się przejść przez okno. Przeczołgujesz się przez ciasny korytarz w nadziei, że był to dobry wybór...");
                    }
                    default -> wrongDoorsValue();
                }
            }
            default -> wrongDoorsValue();
        }
        przejscie(przejsciePrzezDrzwi);
        System.out.println("*Nieźle, nieźle, coraz bliżej końca. Ciesz się póki możesz, ON JUŻ JEST CORAZ BLIŻEJ HAHAHA!*");
        room14();

    }

    public void room14() {
        System.out.println("Ta bestia..... to ona cie porwała..... jedyne co pamiętasz po spotkaniu jej to ból głowy... tylko tyle.... ale to może i dobrze?");
        System.out.println("3... 3 pary d-drzwi... n... nie masz już s-siły... na drzwiach... widnieją... numery...\n[1] - 4\n[2] - 3\n[3] - 5\nNad nimi zaś... pytanie...\n\"Najlepsza część \"Heroes of Might and Magic\"");
        System.out.println("Przez które... drzwi... prze-przechodzisz [1-3]");
        drzwi = scanner.nextInt();
        switch (drzwi) {
            case 1, 3 -> przejsciePrzezDrzwi = false;
            case 2 -> przejsciePrzezDrzwi = true;
            default -> wrongDoorsValue();
        }
        przejscie(przejsciePrzezDrzwi);
        room15();
    }

    public void room15() {
        System.out.println("Zatrzasnąłeś drzwi, masz chwile... na odpoczynek...");
        System.out.println("*Czyżbyś się zmęczył, mój drogi? Te drzwi nie wytrzymają za długo (o ╹‿ ╹ o)*");
        System.out.println("Biegniesz dalej, pamiętasz już wszystko. Poszedłeś z kolegami na pizze po całym dniu zwiedzania Rzymu. Ten kultysta, który dosiadł się do was na granicy to zaproponował, wtedy kiedy poszedłeś do łazienki zamordował twoich przyjaciół, gdy uciekałeś do hotelu wpadłeś na to coś, bestia cie porwała, wyglądała znajomo, a więc to miejsce...");
        System.out.println("*Przyjacielu... pozwól, że wyjaśnie dlaczego wciąż żyjesz - jestem tym, którego zwą wiecznym złem. Nie pozwoliłbym ci umrzeć w spokoju, dlatego ciągle się odradzasz (o ╹‿ ╹ o)");
        System.out.println("Wystraszony biegniesz dalej, masz dość tego głosu który mówi przez ściany, dobiegasz do kolejnego rozwidlenia/");
        System.out.println("Stoisz przed dwiema para drzwi, na których po kolei widnieją napisy:\n[1] - \"Zbigniew Stonoga\"\n[2] - \"Zbigniew Ziobro\"\nNad drzwiami widzisz pytanie:\n\"Który prześladuje rodzine drugiego? Wybierz mądrze, już prawie jesteś na miejscu\"");
        System.out.println("Przez które drzwi przechodzisz? [1-2]");
        drzwi = scanner.nextInt();
        switch (drzwi) {
            case 1 -> przejsciePrzezDrzwi = false;
            case 2 -> przejsciePrzezDrzwi = true;
            default -> wrongDoorsValue();
        }
        przejscie(przejsciePrzezDrzwi);
        room16();
    }

    public void room16() {
        System.out.println("To Watykan, nie ma innej opcji, piwnica watykanu! Brat mnie ostrzegał, abym nie jechał na tą wycieczke... Dobiegasz do wielkiego zdobionego rozwidlenia");
        System.out.println("Stoisz przed trzema pięknie wykończonymi parami drzwi. Czujesz że to już ostatnie przejście, ostatnie drzwi... niestety nie umiesz rozczytać zagadki, jest w niezrozumiałym dla ciebie języku... po włosku? Patrzysz na nią i próbujesz przeczytać:\n\"Pazzo dietro la terza porta, ma rilassati, non sarai ancora in grado di sfuggire alla bestia\"");
        System.out.println("Nie masz zielonego pojęcia jak zagadka ma ci pomóc w wyborze drzwi, jednak musisz podjąć szybko decyzję... przez które drzwi przechodzisz? [1-3]");
        drzwi = scanner.nextInt();
        System.out.println("*Powodzenia dzieciaku...*");
        ending();
    }

    public void ending() {
        if (artefakt = true) {
            System.out.println("Wybiegasz na plac, widzisz kultystów. Nie ma wyjścia, nie ma ratunku, z tego miejsca skąd przyszedłeś widzisz bestie, podchodzi do ciebie. W przerażeniu przypominasz sobie o dziwnym kielichu, wyciagasz go i bez zastanowienia oblewasz bestie cieczą znajdującą się w naczyniu. Bestia krzyczy w agonii, wybija wszystkich swoich ludzi pod wpływem szału a następnie kładzie się na ziemi martwa. Jesteś wolny... na pewno?");
            System.out.println("GŁUPCZE! Zabiłeś moją zabawke, WIĘC TERAZ JA ZABIJE CIEBIE!\nPojawia się przed tobą czarna postać,czujesz jak twoja dusza... przepada...");
        }
        if (artefakt = false) {
            System.out.println("Wybiegasz na plac, widzisz kultystów. Nie ma wyjścia, nie ma ratunku, z tego miejsca skąd przyszedłeś widzisz bestie, podchodzi do ciebie, już nie uciekasz, boisz się, bestia jednym ruchem łapy urywa ci ręke, padasz, krwawisz, bestia podchodzi, jedyne co widziałeś to to jak bestia rozrywa twoje ciało śmiejąc się przy tym");
            System.out.println("Hahahah głupcze, od teraz należysz do mnie!");
            System.out.println("Czujesz, jak twoja dusza przepada...");
        }
        System.out.println("\n\n");
        System.out.println("Autorzy:\nKonrad Kowalski\nBartosz Kijak\nOskar Malec");
    }
}

