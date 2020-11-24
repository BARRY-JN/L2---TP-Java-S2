public class TesteLettre{
public static void main(String[] args){
	Enveloppe e=new Enveloppe();
	Feuille f1=new Feuille("Initiation","Programmation");
	Feuille f2=new Feuille("Orienté","Objet");
	
	e.accueilleFeuille(f1);
	e.accueilleFeuille(f2);
	e.ferme();
	e.ouvre();
	e.lis();
}
}
