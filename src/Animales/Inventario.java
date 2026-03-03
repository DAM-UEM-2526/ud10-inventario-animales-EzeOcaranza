package Animales;

import java.util.ArrayList;

public class Inventario {
	// creamos el arraylist de animales
	private ArrayList<Mascotas> animales;

	public Inventario() {
		this.animales = new ArrayList();
	}

	// creamos la clase vaciar para eliminar la lista de animales
	public void vaciar() {
		animales.removeAll(animales);
	}

	// realizamos la clase de insertar mascotas, donde hacemos que cada mascota se
	// añada a la
	public void insertaMascota(Mascotas a) {
		animales.add(a);
	}

	// aqui hacemos un for para que recorra toda la lista y si encuentra un nombre
	// que se quiere eliminar, lo elimina
	public void eliminaMascota(String nombreI) {
		for (int i = 0; i < animales.size(); i++) {
			if (animales.get(i).getNombreI().equals(nombreI)) {
				animales.remove(i);
			}
		}
	}

	// con este foreach hacemos que imprima todos los animales
	public void imprtimirTodos() {
		for (Mascotas m : animales) {
			System.out.println(m.getNombreI());
		}
	}

	// y con este foreach con instanceof hacemos que lea solo los perros y los
	// imprima
	public void imprimirPerros() {
		for (Mascotas m : animales) {
			if (m instanceof Perro) {
				System.out.println(m.getNombreI());
			}
		}
	}
}
