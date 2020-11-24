
public class Batiment{
	int numero;
	int nbr_bureau;
	public static boolean Alarm;
	//Bureau b[];
	
	public static void metAlarme(boolean b){
		Alarm=b;
	}
	
	public static void securite_on(boolean b){
		;
	}
	
	public Batiment(int num, int n){
		numero=num;
		nbr_bureau=n;
		metAlarme(false);
		//b = new Bureau();
	}
	
	public static void main(String args[]){	
	Batiment b1, b2;
	b1=new Batiment(1,3);
	b2=new Batiment(2,4);
	
	Employe e1, e2;
	e1=new Employe(b1,3);
	e1.aller(b2, 2);
	
	metAlarme(true);
	
	e2=new Employe(b2,3);
	e2.aller(b1, 2);
	
	}
	
	
}

