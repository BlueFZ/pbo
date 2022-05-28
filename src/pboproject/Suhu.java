package pboproject;

public class Suhu {
    static double coverter(String suhuAsal, String suhuAkhir, double nilai) {
		double hasil = 0;

		double[] idASal = getIdSuhu(suhuAsal), idAkhir = getIdSuhu(suhuAkhir);

    hasil = ((nilai - idASal[1])* (idAkhir[0]/idASal[0])) + idAkhir[1]; 

		return hasil;
	}

	static double[] getIdSuhu(String suhu) {
		double[] id = new double[2];

		id[0] = switch (suhu) {
			case "C" -> 5;
			case "F" -> 9;
			case "R" -> 4;
			case "K" -> 5;
			default -> 5;
		};

		id[1] = switch (suhu) {
			case "C" -> 0;
			case "F" -> 32;
			case "R" -> 0;
			case "K" -> 273.15;
			default -> 0;
		};

		return id;
	}
}
