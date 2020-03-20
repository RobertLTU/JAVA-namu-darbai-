package namuDarbai.pasaulioSimuliacija;

public class Zmogus {
    int amzius;
    int idNumeris;
    static int idCounteris;

    public Zmogus (int minAmzius, int maxAmzius) { //Cia yra zmogaus KONSTRUKTORIUS
        if (minAmzius == 0 && maxAmzius == 0) {
            amzius = 0;
            idNumeris = idCounteris + 1;
            idCounteris++;
        } else {
            amzius = (int) (Math.random() * (maxAmzius - minAmzius) + 1);
        }
        }
}
