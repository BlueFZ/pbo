package pboproject;

public class Jarak {
    public static double convert(String jarakAsal, String jarakAkhir) {
		double idAsal = getIdJarak(jarakAsal), idAkhir = getIdJarak(jarakAkhir);
	
			return idAkhir/idAsal;
		}
	
	  public static int getIdJarak(String jarak){
		int id = 1;
		switch(jarak){
		  case "km" :
			id = 1;
			break;
		  case "hm" :
			id = 10;
			break;
		  case "dam" : 
			id = 100;
			break;
		  case "m" : 
			id = 1000;
			break;
		  case "dm" : 
			id = 10000;
			break;
		  case "cm" : 
			id = 100000;
			break;
		  case "mm" : 
			id = 1000000;
			break;
		}
	
		return id;
	  }
}
