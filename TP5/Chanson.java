public class Chanson{
	private String titre,texte;
	private int min,sec;
	
	public Chanson(String tit, String tex,int m,int s){
		titre=ti;
		texte=tex;
		min=m;
		sec=s;
	}
	
	public void passe(){
		system.out.println(texte);
	}
	
	public int duree(){
		return sec+(min*60);
	}
	
	public String getTitre(){
		return titre;
	 }
}
