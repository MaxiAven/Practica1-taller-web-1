package ar.edu.tallerweb;

public class Cuadrado {
	
	float lado;
	
	
	public Cuadrado(float lado){
		
		this.lado = lado;
		
	}
	
	public float area(){
		
		float area = lado*lado;
		return area;
	}

	public float perimetro(){
			
			float perimetro = 4*lado;
			return perimetro;
		}
}
