package namuDarbai.pasaulioSimuliacija;

import java.util.ArrayList;

public class Pasaulis {
    static ArrayList<Zmogus> zmoniuSarasas = new ArrayList<>();
    static int minGimdymoAmzius = 16;
    static int maxGimdymoAmzius = 40;
    static int minAmzius = 0;
    static int maxAmzius = 130;
    static int metaiNuoSukurimo;
// MIRTIES TIKIMYBES PAGAL AMZIAUS GRUPES
    double deathProbUnder20 = 0.001;
    double deathProb20to29 = 0.005;
    double deathProb30to49 = 0.10;
    double deathProb50to59 = 0.20;
    double deathProbOver60 = 0.30;
    double birthProb18to40 = 0.10;
    static double deathNumber;

    public Pasaulis(int pradinePopuliacija, int simuliuojamuMetuSkaicius, double gimstamumas) {        //KONSTRUKTORIUS
        for (int i = 0; i < pradinePopuliacija; i++) {
            Zmogus naujasZmogus = new Zmogus(minAmzius, maxAmzius);
            naujasZmogus.idNumeris = i + 1;
            Zmogus.idCounteris++;
            zmoniuSarasas.add(naujasZmogus);
            System.out.println("Pradine populiacija. Zmogaus amzius: " + naujasZmogus.amzius + " , ID numeris: " + naujasZmogus.idNumeris);
        } //I konstruktoriu itraukiam Pasaulio metoda "sendinamZudomGimdom" kur paleidziamas susikurus pasauliui.
        for (int i = 1; i <= simuliuojamuMetuSkaicius; i++) {
            sendinamZudomGimdom(gimstamumas);
        }
    }

    public void sendinamZudomGimdom(double gimstamumas) {
        double cikloPradziosLaikas = System.currentTimeMillis();
        double cikloPabaigosLaikas;
        double cikloTrukme;
        Pasaulis.metaiNuoSukurimo++;
        ArrayList<Zmogus> gimdymoNamai = new ArrayList<>();
        ArrayList<Zmogus> laidojimoNamai = new ArrayList();

        for (Zmogus xxx : zmoniuSarasas) {
            //GIMDYMO GENERAVIMAS
            xxx.amzius++;
            if (xxx.amzius >= minGimdymoAmzius && xxx.amzius <= maxGimdymoAmzius && Math.random() < gimstamumas) {
                Zmogus naujagimis = new Zmogus(0, 0);
                gimdymoNamai.add(naujagimis);
//                System.out.println("GIMIMAS: " + xxx.amzius + " metu. ID numeris: " + xxx.idNumeris);
                StatistiniaiDuomenys.gimusiuPerVisaIstorija++;
            }
            //MIRCIU GENERAVIMAS
            if (xxx.amzius < 20) {
                deathNumber = Math.random();
                if (deathNumber < deathProbUnder20) {
                    laidojimoNamai.add(xxx);
//                    System.out.println("MIRTIS " + xxx.amzius + " metu. ID numeris: " + xxx.idNumeris);
                    StatistiniaiDuomenys.mirciuNuo0iki19++;
                    StatistiniaiDuomenys.mirciuPerVisaIstorija++;
                }
            } else if (xxx.amzius < 30) {
                deathNumber = Math.random();
                if (deathNumber < deathProb20to29) {
                    laidojimoNamai.add(xxx);
                    StatistiniaiDuomenys.mirciuNuo20iki29++;
                    StatistiniaiDuomenys.mirciuPerVisaIstorija++;
                }
            } else if (xxx.amzius < 50) {
                deathNumber = Math.random();
                if (deathNumber < deathProb30to49) {
                    laidojimoNamai.add(xxx);
                    StatistiniaiDuomenys.mirciuNuo30iki49++;
                    StatistiniaiDuomenys.mirciuPerVisaIstorija++;
                }
            } else if (xxx.amzius < 60) {
                deathNumber = Math.random();
                if (deathNumber < deathProb50to59) {
                    laidojimoNamai.add(xxx);
                    StatistiniaiDuomenys.mirciuNuo50iki59++;
                    StatistiniaiDuomenys.mirciuPerVisaIstorija++;
                }
            } else if (xxx.amzius >= 60) {
                deathNumber = Math.random();
                if (deathNumber < deathProbOver60) {
                    laidojimoNamai.add(xxx);
                    StatistiniaiDuomenys.mirciuVirs60++;
                    StatistiniaiDuomenys.mirciuPerVisaIstorija++;
                }
            }
        }
        //pridedam GIMUSIUS ir isimam mirusius is pasaulio Zmoniu saraso
        zmoniuSarasas.removeAll(laidojimoNamai);
        zmoniuSarasas.addAll(gimdymoNamai);

        //spausdinam pasaulio statistika
        System.out.println(" / Metai: " + Pasaulis.metaiNuoSukurimo + " / Populiacija: " + Pasaulis.zmoniuSarasas.size() + " /  Mire: " + laidojimoNamai.size() + " / Gime: " + gimdymoNamai.size());
        System.out.println("Mire 0-19 = " + StatistiniaiDuomenys.mirciuNuo0iki19 + " / Mire 20-29 = " + StatistiniaiDuomenys.mirciuNuo20iki29 + " / Mire 30-49 = " + StatistiniaiDuomenys.mirciuNuo30iki49 + " / Mire 50-59 = " + StatistiniaiDuomenys.mirciuNuo50iki59 + " / Mire 60+ = " + StatistiniaiDuomenys.mirciuVirs60 + " / Mire per visa istorija = " + StatistiniaiDuomenys.mirciuPerVisaIstorija + " / Gime per visa istorija = " + StatistiniaiDuomenys.gimusiuPerVisaIstorija);
        System.out.println(Pasaulis.metaiNuoSukurimo + " metu statistikos pabaiga =============================");
        System.out.println();

        //Isnuliniam mirusiu ciklo metu counterius
        StatistiniaiDuomenys.mirciuNuo0iki19 = 0;
        StatistiniaiDuomenys.mirciuNuo20iki29 = 0;
        StatistiniaiDuomenys.mirciuNuo30iki49 = 0;
        StatistiniaiDuomenys.mirciuNuo50iki59 = 0;
        StatistiniaiDuomenys.mirciuVirs60 = 0;
        cikloPabaigosLaikas = System.currentTimeMillis();
        cikloTrukme = cikloPradziosLaikas - cikloPabaigosLaikas;
        System.out.println(cikloTrukme);
    }
}
/*
METODAI kuriuos reikia sukurti:
1. Pradinei populiacijai generuoti random amziu
2. sukelti pradine populiacija i pasauli
3. sendintiPopuliacija vieneriais metais, tuo paciu generuoti mirties tikimybe ir siusti zmogaus objektus i kapiniu sarasa.
Tuo paciu generuoti gimdymo tikimybe ir gimdyti naujus zmones bei siusti gimusius i gimimo namu sarasa.
4. Istrinti visus kapinese esancius zmones is pasaulio.
5. Ikelti visus gimusius i pasauli is gimdymo namu saraso.
6. Testuoti programa sukant Ciklus.
7. Padaryti kad kiekvieno ciklo pabaigoje spausdintu gyventoju skaiciu ir mirusiu gimisiu skaicius
8. OPTIONAL: padaryti kad spausdintu populiacijos sudeti pagal amziaus grupes;
9. OPTIONAL: padaryti RANDOM EVENTS. Pandemics, Gamtiniai kataklizmai ir t.t.
*/