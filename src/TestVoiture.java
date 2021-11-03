
public class TestVoiture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voiture v=new Voiture("222 TUN 193", "Renault Megane", 20000);
		//Affichage des caractéristiques de la voiture v
		System.out.println(v);
		v.setKilometrage(25000);
		System.out.println("kilometrage="+v.getKilometrage());
		Voiture v1= new Voiture();
	}

}
