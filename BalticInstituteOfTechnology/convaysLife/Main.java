package namuDarbai.convaysLife;

public class Main {

    public static void main(String[] args) {
        TheWorld myWorld = new TheWorld(20, 20, 0.6,"Q");
        myWorld.initialSeed();
        myWorld.printWorldToConsole(0);
        for(int i = 1; i < 200; i++) {
//            System.out.println("\033[2J"); //Kursoriaus grazinimo eilute neveikianti
            myWorld.lifeDeathCycle();
            myWorld.transferFromTempToRealWorld();
            myWorld.printWorldToConsole(i);
        }
    }

}


//0-1 DIES
//2-3 STAYS ALIVE
//4+ DIES
//DEAD with 3 live neighbours becomes LIVE

//Any live cell with fewer than two live neighbours dies, as if by underpopulation.
//Any live cell with two or three live neighbours lives on to the next generation.
//Any live cell with more than three live neighbours dies, as if by overpopulation.
//Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
//These rules, which compare the behavior of the automaton to real life, can be condensed into the following:
//
//Any live cell with two or three neighbors survives.
//Any dead cell with three live neighbors becomes a live cell.
//All other live cells die in the next generation. Similarly, all other dead cells stay dead.
//The initial pattern constitutes the seed of the system. The first generation is created by applying the above rules simultaneously to every cell in the seed; births and deaths occur simultaneously, and the discrete moment at which this happens is sometimes called a tick. Each generation is a pure function of the preceding one. The rules continue to be applied repeatedly to create further generations.