import java.io.*;
public class Feuille{

public String recto,verso;
public boolean recto_visible;
public static int nbr_feuille=0;
public Feuille dessous;

public Feuille(String r, String v){
	recto=r;
	verso=v;
	recto_visible=true;
	nbr_feuille++;
}

void lis(){
	if(recto_visible){
		System.out.println(recto);
	}else{
		System.out.println(verso);
	}
}

void retourne(){
	if(recto_visible){
		recto_visible=false;
	}else{
		recto_visible=true;
	}
}

Feuille dupliquer(){
	Feuille f = new Feuille(this.recto,this.verso);
	f.recto_visible=recto_visible;
	nbr_feuille++;
	return f;
}

boolean egalite(Feuille f){
if(f.recto.compareTo(this.recto)==0 && f.verso.compareTo(this.verso)==0){
	return true;
}else{
	return false;
}
}

}
