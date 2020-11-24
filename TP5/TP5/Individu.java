public class Individu{
	private String nom;
	private String prenom;
	private int annee;
	
	public Individu(String n, String p, int a){
		nom=n;
		prenom=p;
		annee=a;
	}
	
	public String getnom(){
		return nom;
	}
	
	public String getprenom(){
		return nom;
	}
	
	public int getannee(){
		return annee;
	}
	
	boolean Egal(Individu u){
		return (getnom()==u.getnom()&&getprenom()==u.getprenom()&&getannee()==u.getannee());
	}
	
	public Individu Copie(){
		Individu ind = new Individu(getnom(),getprenom(),getannee());
		return ind;
	}
}
