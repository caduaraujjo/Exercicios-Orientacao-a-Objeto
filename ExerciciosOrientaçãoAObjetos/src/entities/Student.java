package entities;

public class Student {
	public String Name;
	public double Nota1;
	public double Nota2;
	public double Nota3;
	public double result;
	
	public double finalGrade() {
		return result = Nota1 + Nota2 + Nota3;
	
	}
	
	public double missing() {
		return 60 - result;
	}

}
