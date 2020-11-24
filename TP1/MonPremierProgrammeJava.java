import java.io.*;

public class MonPremierProgrammeJava{

	static String LireCaractere(){
		String s=null;
		//Definition d’une source de donnees (ici le clavier)
		BufferedReader source = new BufferedReader(new InputStreamReader (System.in));
		
		try{
			s=source.readLine();
		}
		catch (java.io.IOException e){
			System.out.println("Erreur de lecture depuis de le clavier");
			System.exit(-1);
		}
		return s;
	}

	public static void main(String args[]){
		int taille=0,min=0,max=0,t=0,i=0,j=0;
		double moyenne=0;
		
		System.out.println("Nombre d'entiers a rentrer:");
		taille = Integer.parseInt(LireCaractere());
		int entiers[] = new int [taille];
		
		for (i = 0 ; i < taille ; i++){	
			System.out.println("Entier " + i + " : ");
			entiers[i] = Integer.parseInt(LireCaractere());
		}
		
		min = entiers[0];
		max = entiers[0];
		
		for (i=0 ; i < taille ; i++){	
			if(entiers[i]<min)
				min=entiers[i];
				
			if(entiers[i]>max)
				max=entiers[i];
			
			moyenne+=entiers[i];
		}
		moyenne=moyenne/taille;
		
		for (i=0 ; i < taille ; i++){	
			for (j=0 ; j < taille ; j++){	
				if(i<j){
					if(entiers[i]>entiers[j]){
						t=entiers[i];
						entiers[i]=entiers[j];
						entiers[j]=t;
						
					}
				}
			}
		}
		
		System.out.println("Nombre min: "+min+" Nombre max: "+max+" Moyenne: "+moyenne);
		
		for (i=0 ; i < taille ; i++){	
			System.out.println("Entier "+i+": "+entiers[i]);
		}
		
	}
	
}
