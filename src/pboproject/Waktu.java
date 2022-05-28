package pboproject;

public class Waktu {
    public static double convert(String waktuAwal, String waktuAkhir) {
		double idAwal = getIdWaktu(waktuAwal), idAkhir = getIdWaktu(waktuAkhir);
		return idAkhir / idAwal;
	}

	public static double getIdWaktu(String waktu) {
		double id = 1;

		switch (waktu) {
			case "Detik" -> id = 3600;
			case "Menit" -> id = 60;
			case "Jam" -> id = 1;
		}
		return id;
	}
}
