

public class Voiture {
	private String immatriculation;
	private String modele;
	private int kilometrage;
	
	public Voiture(String immatriculation, String modele, int kilometrage) {
		this.immatriculation = immatriculation;
		this.modele = modele;
		this.kilometrage = kilometrage;
	}
    public Voiture () {
    	
    }
		public int getKilometrage() {
		return kilometrage;
	}

public  String  getImmatriculation() {
	return this.immatriculation;
}
public  void  setKilometrage(int k) {
	this.kilometrage=k;
}
public  void  setImmatriculation(String imm) {
	this.immatriculation=imm;;
}

	public String toString() {
		return "Voiture : immatriculation=" + immatriculation + ", modele=" 
				+ modele + ", kilometrage=" + kilometrage;
	}
	
	
}
