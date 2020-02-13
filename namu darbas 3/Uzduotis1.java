/*
1 uzduotis
*/

public class Uzduotis1
{
	public static void main(String[] args) 
	{
		int[] seka = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		int sekosTipas = 0;
		System.out.println("Sekos ilgis :" + seka.length);
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
			System.out.println("Seka didejanti");
		} else if (sekosTipas == (1 - seka.length)) {
			System.out.println("Seka mazejanti");
		} else {
			System.out.println("Skaiciu seka atsitiktine");
		}
		// Atvirkstines sekos isvedimas OUT
		for (int j = 10; j >= 0; j--) {
			System.out.println(seka[j]);
		}
	}
}