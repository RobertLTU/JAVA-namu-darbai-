/*
1 uzduotis
-nustatyti ar didejanti ar mazejanti seka ar isvis jokios sekos.
- 
*/

public class Uzduotis1
{
	public static void main(String[] args) 
	{
		int[] seka = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		int sekosTipas = 0; //Jeigu seka yra didejanti arba mazejanti, atitinkamai prasukus FOR cikla skaicius bus lygus sekos ilgiui -1. Jeigu seka didejanti, skaicius bus TEIGIAMAS, jeigu mazejanti bus NEIGIAMAS.
		System.out.println("3 namu darbas 1 Uzduotis");
		//Sukam cikla kuris priklausomai nuo sekos modifikuoja kintamaji "Sekos Tipas"
	for (int i = 0; i < (seka.length - 1); i++)
	{
		if (seka[i] < seka[i + 1] ) {
			sekosTipas++;
		} 
		else if (seka[i] > seka[i + 1] ) 
		{
			sekosTipas--;
		} 
	}
		if (sekosTipas == (seka.length - 1)) { 
			System.out.println("Skaiciu seka yra didejanti");
		} else if (sekosTipas == (1 - seka.length)) {
			System.out.println("Skaiciu seka yra mazejanti");
		} else {
			System.out.println("Skaiciu seka yra atsitiktine");
		}
		// Atvirkstines sekos isvedimas OUT
		for (int j = 10; j >= 0; j--) {
			System.out.println(seka[j]);
		}

		// Skaiciaus 5 suradimas ir jo indekso isvedimas:
		for (int k = 0; k < seka.length; k++ ) {
			if (seka[k] == 5){
				System.out.println("Skaiciaus 5 indeksas : " + k);
				break;
			}
		}
		//Kas antro elemento isvedimas:
		System.out.println("Kas antro elemento isvedimas:");
		for (int m = 0; m < seka.length; m += 2 ) {
			System.out.println(seka[m]);
		}
	}
}