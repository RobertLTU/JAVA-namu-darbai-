package namuDarbai.convaysLife;

public class TheWorld {
    public int x;         // World HEIGHT
    public int y;         // World WIDTH
    public String liveSymbol = "Q";
    public double seedLifeProb = 0.05;
    public int organismCount = 0;
    String[][] lifeArray;
    String[][] temporaryArray;


    public TheWorld(int height, int width, double seedLifeProbability, String liveSymbol) {
        this.x = height;
        this.y = width;
        this.seedLifeProb = seedLifeProbability;
        this.liveSymbol = liveSymbol;
        lifeArray = new String[x][y];
        temporaryArray = new String[x][y];
    }

    public void initialSeed() {
        // INITIAL RANDOM SEED ====================
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (Math.random() < seedLifeProb) {
                    lifeArray[i][j] = liveSymbol;
                    organismCount++;
                } else {
                    lifeArray[i][j] = " ";
                }
            }
        }
        System.out.println("Organism count after random seed: " + organismCount);
    }

    public void lifeDeathCycle() {
        organismCount = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                //Vidiniu organizmu gyvu kaimynu skaiciavimas
                if (i != 0 && i != x - 1 && j != 0 && j != y - 1) {

                    int liveCount = 0;

                    if (!lifeArray[i - 1][j - 1].equals(" ")) liveCount++;
                    if (!lifeArray[i - 1][j].equals(" ")) liveCount++;
                    if (!lifeArray[i - 1][j + 1].equals(" ")) liveCount++;

                    if (!lifeArray[i][j - 1].equals(" ")) liveCount++;
                    if (!lifeArray[i][j + 1].equals(" ")) liveCount++;

                    if (!lifeArray[i + 1][j - 1].equals(" ")) liveCount++;
                    if (!lifeArray[i + 1][j].equals(" ")) liveCount++;
                    if (!lifeArray[i + 1][j + 1].equals(" ")) liveCount++;

                    //Ikelimas i tarpini masyva
                    if (liveCount < 2 || liveCount > 3) {
                        temporaryArray[i][j] = " ";

                    } else if (liveCount == 2 && lifeArray[i][j].equals(" ")) {
                        temporaryArray[i][j] = " ";

                    } else if (liveCount == 2 && !lifeArray[i][j].equals(" ")) {
                        temporaryArray[i][j] = liveSymbol;
                        organismCount++;

                    } else if (liveCount == 3) {
                        temporaryArray[i][j] = liveSymbol;
                        organismCount++;

                    }
//                    System.out.println("i= " + i + "|| j= " + j + "|| liveCount = " + liveCount + "lifeArray Value = " + lifeArray[i][j]);
                } else {
                    //Krastiniu organizmu gyvu kaimynu skaiciavimas
                    int liveCount = 0;
                    // i = 1; j = 3;
                    if (i - 1 >= 0 && j - 1 >= 0) {
                        if (!lifeArray[i - 1][j - 1].equals(" ")) liveCount++;

                    }
                    if (i - 1 >= 0) {
                        if (!lifeArray[i - 1][j].equals(" ")) liveCount++;
                    }
                    if (i - 1 >= 0 && j + 1 < y) {
                        if (!lifeArray[i - 1][j + 1].equals(" ")) liveCount++;
                    }

                    if (j - 1 >= 0) {
                        if (!lifeArray[i][j - 1].equals(" ")) liveCount++;

                    }
                    if (j + 1 < y) {
                        if (!lifeArray[i][j + 1].equals(" ")) liveCount++;
                    }
                    if (i + 1 < x && j - 1 >= 0) {
                        if (!lifeArray[i + 1][j - 1].equals(" ")) liveCount++;
                    }
                    if (i + 1 < x) {
                        if (!lifeArray[i + 1][j].equals(" ")) liveCount++;
                    }
                    if (i + 1 < x && j + 1 < y) {
                        if (!lifeArray[i + 1][j + 1].equals(" ")) liveCount++;
                    }

                    // ========= Ikelimas i tarpini masyva =============

                    if (liveCount < 2 || liveCount > 3) {
                        temporaryArray[i][j] = " ";

                    } else if (liveCount == 2 && lifeArray[i][j].equals(" ")) {
                        temporaryArray[i][j] = " ";

                    } else if (liveCount == 2 && !lifeArray[i][j].equals(" ")) {
                        temporaryArray[i][j] = liveSymbol;
                        organismCount++;

                    } else if (liveCount == 3) {
                        temporaryArray[i][j] = liveSymbol;
                        organismCount++;

                    }
//                    System.out.println("i= " + i + "|| j= " + j + "|| liveCount = " + liveCount + "lifeArray Value = " + lifeArray[i][j]);
                }
            }
        }
    }

    public void transferFromTempToRealWorld() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                lifeArray[i][j] = temporaryArray[i][j];
            }
        }
    }


    public void printWorldToConsole(int itteration) {
        System.out.println("Printing new World after simulation cycle No:" + itteration);
        System.out.println("New organism count = " +  organismCount);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (j != y - 1) {
                    System.out.print(lifeArray[i][j]);
                } else System.out.println(lifeArray[i][j]);
            }
        }
    }

    public void printTemporaryWorld() {
        System.out.println("Printing temporary world:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (j != y - 1) {
                    System.out.print(temporaryArray[i][j]);
                } else System.out.println(temporaryArray[i][j]);
            }
        }
    }

    public void printTemporaryForDebug() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println(temporaryArray[i][j] + " i = " + i + "|| j = " + j);
            }
        }
    }
    public void setCursorPorision(int x, int y) {
        final char escCode = 0x1B;
        System.out.print(String.format("%c[%d;%df", escCode, y, x));
    }
    //END OF CLASS BRACE
}
