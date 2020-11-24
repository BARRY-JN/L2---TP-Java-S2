public class verre{
	int contenance, quantite;
	
	public verre(int c){
		contenance=c;
		quantite=0;
	}
	
	void remplir(int q){
		quantite+=q;
	}
	
	void boire(int q){
		quantite-=q;
	}

}
