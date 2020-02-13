/*
3 namu darbas, 2 uzduotis
*/
public class Uzduotis2 
{
	public static void main (String[] args)
	{
		int[][] matrix = {
				{1, 2, 3, 4, 5},
				{10, 20, 30, 40, 50},
				{100, 200, 300, 400, 500}
			};
		//Eiluciu sumu apaskaiciavimas

		for (int i = 0; i < matrix.length; i++) {
			int eilutesSuma = 0;
			for (int ii = 0; ii < matrix[i].length; ii++){
				eilutesSuma += matrix[i][ii];
				if(ii == (matrix[i].length - 1)) {
					System.out.println((i+1) + " eilutes suma = " + eilutesSuma);
				}
			}
		}
		//Stulpeliu sumos apskaiciavimas
		int stulpelis1 = 0;
		int stulpelis2 = 0;
		int stulpelis3 = 0;
		int stulpelis4 = 0;
		int stulpelis5 = 0;

		for (int j = 0; j < matrix.length; j++) {
			for (int jj = 0; jj < matrix[j].length; jj++){
				switch (jj) {
					case 0:
						stulpelis1 += matrix[j][jj];
						break;
					case 1:
						stulpelis2 += matrix[j][jj];
						break;
					case 2:
						stulpelis3 += matrix[j][jj];
						break;
					case 3:
						stulpelis4 += matrix[j][jj];
						break;
					case 4:
						stulpelis5 += matrix[j][jj];
						break;
					default:
						System.out.println("Reikia itraukti daugiau stulpeliu kintamuju");
				}
			}
		}
		System.out.println("1 stulpelio skaiciu suma = " + stulpelis1);
		System.out.println("2 stulpelio skaiciu suma = " + stulpelis2);
		System.out.println("3 stulpelio skaiciu suma = " + stulpelis3);
		System.out.println("4 stulpelio skaiciu suma = " + stulpelis4);
		System.out.println("5 stulpelio skaiciu suma = " + stulpelis5);
//END OF MAIN BLOCK
	}
}