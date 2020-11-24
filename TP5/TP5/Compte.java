public class Compte{
private int numero;
private Individu user;
private int solde;
private int decouvert;

public Compte(int num, Individu u, int s,int d){
	numero=num;
	user=u.Copie();
	solde=s;
	decouvert=d;
}

public void setsolde(int n){
	solde=n;
}

public int getsolde(){
	return solde;
}

public int getnum(){
	return numero;
}

public Individu getind(){
	return user;
}

public int getDec(){
	return decouvert;
}

public void Depot(int val){
	setsolde(getsolde()+val);
}

public void Retrait(int val){
	if(getsolde()-val>=decouvert){
		setsolde(getsolde()-val);
	}else{
		System.out.println("Solde insufisant\n");
	}
}

public boolean Crediteur(){
	return (getsolde()>=0);
}

public boolean Egal (Compte c){
	return (c.getsolde()==getsolde()&&c.getnum()==getnum()&&c.getind()==getind()&&c.getDec()==getDec());
}

public Compte Copie(){
	Compte c = new Compte(getnum(),getind(),getsolde(),getDec());
	return c;
}

public void affiche(){
	System.out.println("Solde actuel: " + getsolde());
}

}
