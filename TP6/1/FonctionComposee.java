import java.io.*;

public class FonctionComposee extends Fonction{
	private Fonction f1,f2;
	
	public FonctionComposee(Fonction fa, Fonction fb){
		f1=fa;
		f2=fb;
	}
	public int fonction(int x){
		return f1.applique(f2.applique(x));
	}
	
	public static void main(String args[]){
		Increment f = new Increment();
		Carre g = new Carre();
		FonctionComposee h = new FonctionComposee(g,f);
		System.out.println("h(h(6)) = "+h.iteree(2,6));
		FonctionComposee i = new FonctionComposee(f,h);
		System.out.println("i(i(6)) = "+i.iteree(2,6));
	}
}
