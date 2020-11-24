public class bouteille{
	int quantite;
	boolean estouverte;

	public bouteille(int q){
		quantite=q;
	}
	
	void ouvrir(){
		estouverte=true;
	}
	void fermer(){
		estouverte=false;
	}

	void verseDans(verre v, int q){
		ouvrir();
		quantite-=q;
		v.remplir(q);
		fermer();
	}
	
	public static void main(String args[]){
		bouteille orange=new bouteille(100);
		bouteille citron=new bouteille(100);
		
		verre cocktail=new verre(20);
		
		citron.verseDans(cocktail,8);
		orange.verseDans(cocktail,12);
		
		cocktail.boire(cocktail.quantite);
		
		System.out.println("Quantite: " + cocktail.quantite);
		
	}
}
