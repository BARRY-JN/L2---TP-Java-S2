public class Pile{
int hauteur;
int cont[]= new int [100] ;

	void empiler(int element){
	
		hauteur++;
		cont[hauteur-1]=element;
	}
	
	int depiler(){
		int k=0;
		if(hauteur-1>0){
			System.out.println("élément "+hauteur+": "+cont[hauteur]);
			k=cont[hauteur-1];
			cont[hauteur-1]=0;
			hauteur--;
			return k;
		}
		return -1;
	}
	
	boolean estVide(){
		return hauteur<=0;
	}
	
	int taille(){
		return hauteur;
	}
	
	public static void main(String args[]){
	Pile p = new Pile();
	p.hauteur=0;
	p.empiler(2);
	p.empiler(5);
	p.empiler(1);
	p.empiler(9);
	p.empiler(7);
	System.out.println(p.cont[0]+" - "+p.cont[1]+" - "+p.cont[2]+" - "+p.cont[3]+" - "+p.cont[4]+" - "+ "--" + p.hauteur);
	
	p.depiler();
	System.out.println(p.cont[0]+" - "+p.cont[1]+" - "+p.cont[2]+" - "+p.cont[3]+" - "+p.cont[4]+" - "+ "--" + p.hauteur);
	}

}
