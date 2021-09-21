package Logica;
import java.time.LocalDate;
import java.util.LinkedList;

public class Investigador extends Usuario{
	private String contrato;
	private String profesion;
	private LocalDate vtoContrato;
	private LinkedList<String> listaTareas;
	private LinkedList<Formulario> creacionFormularios;
	
	public void descargarDatos() {
		
	}
}
