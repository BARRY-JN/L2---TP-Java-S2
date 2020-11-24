public class CompteRemunere extends Compte{
	private double t;
	private int joursPasses;
	
	public CompteRemunere(int num, Individu u, int s,int d, double t){
		super(num,u,s,d);
		this.t=t;
		this.joursPasses=0;
	}
	
	public void passeJours(int j){
		joursPasses+=j;
	}
	
	public void Depot(int val){
		setsolde((int) ((getsolde()*(1+((t*joursPasses)/365)))+val));
	}
	
	public void Retrait(int val){
		if(getsolde()-val>=getDec()){
			setsolde((int) ((getsolde()*(1+((t*joursPasses)/365)))-val));
		}else{
			System.out.println("Solde insufisant\n");
		}
	}
	
	public void affiche(){
		setsolde((int) (getsolde()*(1+((t*joursPasses)/365))));
		System.out.println("Solde actuel: " + getsolde());
	}
	
	public static void main(String args[]){
		CompteRemunere co;
		Individu ind;
		ind = new Individu("machin", "bidule", 0);
		co = new CompteRemunere(1355, ind, 0,-50, 0.5);
		co.Depot(2000);
		co.passeJours(365);
		co.Retrait(1050);
		co.passeJours(183);
		co.affiche();
	}
}
