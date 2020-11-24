public class Employe{
Bureau b;
Batiment bat;
static int nbr_employe;

public Employe(Batiment bati, int n){
bat=bati;
b=new Bureau(n);
}

void aller(Batiment t, int n){

	if(b.ouvert()==false){
		b.ouvrir();
	}

	System.out.println("il quitte le bureau numéro: " + b.numero + " dans le batiment " + bat.numero);

	bat=t;
	b.numero=n;

	if(b.ouvert()==false){
		b.ouvrir();
	}

	System.out.println("il rejoint le bureau numéro: " + b.numero + " dans le batiment " + bat.numero);

	}
}
