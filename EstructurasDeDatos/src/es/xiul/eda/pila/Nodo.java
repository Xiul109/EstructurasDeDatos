package es.xiul.eda.pila;
//Implementado por Xiul para www.xiul.es

//Clase para la estructura Nodo, que almacenará los elementos de la pila
class Nodo<T> {
	private Nodo<T> inferior; //Será el nodo de la pila que se encuentre debajo, es decir, que se haya apilado antes
	private T elemento; //Se trata del elemento que almacena el nodo

	//El constructor sencillamente toma como parámetros los dos atributos de la clase y se los asigna
	public Nodo(Nodo<T> inferior, T elemento) {
		this.inferior = inferior;
		this.elemento = elemento;
	}

	//Esta función permite acceder al nodo que se encuentra debajo
	public Nodo<T> getInferior(){
		return inferior;
	}

	//Esta función permite acceder al elemento que se almacena en el nodo 
	public T getElemento(){
		return elemento;
	}
}

