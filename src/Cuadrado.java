
public class Cuadrado {

	
		double lado;
		
		public double  CalculaArea(double lado){
			
			this.lado = lado;
			double area = this.lado*this.lado;
			return area;
		}
		
		
		public double  CalculaPerimetro(double lado){
			
			this.lado = lado;
			double perimetro = 4*this.lado;
			return perimetro;
			
		}
		
}

