public abstract class Fonction{
	public abstract int fonction(int x);

	public int applique (int x){
		return fonction(x);
	}
	
	public int iteree(int n,int x){
		int v,i;
		v=x;
		
		for(i=0;i<n;i++){
			v=applique(v);
		}
	 return v;
	}
	
}
