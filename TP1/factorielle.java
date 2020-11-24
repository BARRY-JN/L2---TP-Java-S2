public class factorielle{
	int val;
	
	int fact(){
		int r,m;
		
		r=1;
		m=val;
		
		while(m!=0){
			r=r*m;
			m--;
		}
		return r;
		
	}

	public static void main(String args[]){
		int n=0;
		factorielle a=new factorielle();
		
		for(int i=0;i<args.length;i++){
			n=Integer.parseInt(args[i]);
			a.val=n;
			System.out.println("Factorielle "+n+" = "+a.fact());
		}
	}

}
