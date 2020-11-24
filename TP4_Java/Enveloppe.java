import java.io.*;

public class Enveloppe{
Feuille fe;
boolean ouv;

void ouvre(){
	ouv=true;
}

void ferme(){
	ouv=false;
}

int nbFeuilles(){
	return fe.nbr_feuille;
}

void accueilleFeuille(Feuille f){

	if(this.nbFeuilles()<=20){
		if(fe==null){
			this.fe=f;
		}else{
			this.fe.dessous=f;
		}

	}
}

void lis(){
Feuille feu=fe.dupliquer();
if(ouv==true){
	while(feu!=null){
		feu.lis();
		feu.retourne();
		feu.lis();
		feu=feu.dessous;
	}
}
}

Enveloppe dupliquer(){
	Enveloppe e = new Enveloppe();
	e.fe=this.fe.dupliquer();
	e.ouv=true;
	return e;
}

boolean egalite(Enveloppe e){
if(e.fe.recto.compareTo(this.fe.recto)==0&&e.fe.verso.compareTo(this.fe.verso)==0){
	return true;
}else{
	return false;
}
}

}

