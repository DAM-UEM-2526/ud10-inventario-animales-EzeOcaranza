package Animales;

public abstract class Mascotas {
	protected String nombreI;
	protected int edad;
	protected String estado;
	protected String fechaNacimiento;

	public Mascotas(String nombreI, int edad, String estado, String fechaNacimiento) {
		this.nombreI = nombreI;
		this.edad = edad;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombreI() {
		return nombreI;
	}

	public String getEstado() {
		return estado;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
