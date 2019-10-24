package library;

public class Curso {

	public String nomeCurso;
 	public String materia;
	public int semestre = 1;
	
	public Curso(String nomeCurso, String materia , int semestre) {
		this.nomeCurso = nomeCurso;
		this.materia = materia;
		this.semestre = semestre;
		
	}
	
	public Curso(String nomeCurso , String materia) {
		this.nomeCurso = nomeCurso;
		this.materia = materia;
	}

}
