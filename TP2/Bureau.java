public class Bureau{
	int numero;
	boolean etat;

	public Bureau(int n){
	this.numero=n;
	etat=false;
	}

	boolean ouvert(){
		return etat;
	}

	void ouvrir(){
	etat=true;
	if(Batiment.Alarm){
		System.out.println("Alarme en marche");
	}
	
	
	}

	void fermer(){
	etat=false;
	}

}
