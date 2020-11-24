public class Mer{
	private Bateaux bat[];
	private int nbr_bateau;
	
	public ajouteBateau(Bateaux b){
		bat[nbr_bateau]=b
		nbr_bateau++;
	}
	
	public void coup(int a,int b){
		int i;
		for(i=0;i<nbr_bateau;i++){
			bat[i].coup(a,b);
		}
	}
}
