public class Bateaux{
	private Point p;
	private boolean is_horiz;
	private int size,impact;
	
	public Bateaux(Point l,boolean hor, int s){
		p=l;
		is_horiz=hor;
		size=s;
		impact=0;
	}
	
	public void coup(int a,int b){
		int x_min, x_max,y_min,y_max;
		
		if(is_horiz){
			x_min=p.getX();
			x_max=p.getX()+size;
			y_min=p.getY();
			y_max=p.getY();
		}else{
			x_min=p.getX();
			x_max=p.getX();
			y_min=p.getY();
			y_max=p.getY()+size;
		}
		if(a>=x_min&&a<=x_max,b>=y_min&&b<=y_max){
			System.out.println("Touché");
			impact++;
			if(impact==size){
				System.out.println("Coulé");
			}
		}
	}
}
