package Animales;

public class Test {

	public static void main(String[] args) {

		// creamos dos animales, un gato y un perro
		Perro r = new Perro("Rocky", 1, "OK", "11022017");
		Gato g = new Gato("Negro", 2, "OK", "05012016");

		// aqui le pedimos que nos imprima el nombre y estado de los elegidos
		System.out.println(r.getNombreI());
		System.out.println(g.getEstado());
		// creamos un inventario
		Inventario i = new Inventario();

		// insertamos los animales
		i.insertaMascota(r);
		i.insertaMascota(g);

		// los imprimimos por pantalla a todos y luego a los perros por separado
		i.imprtimirTodos();
		i.imprimirPerros();

		// vaciamos la lista
		i.vaciar();

		// imprimimos nuevamente para comprobar q se eliminaron
		i.imprtimirTodos();
		i.imprimirPerros();

	}

}
