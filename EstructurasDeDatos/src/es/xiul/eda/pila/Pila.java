package es.xiul.eda.pila;
//Implementado por Xiul para www.xiul.es

// Implementación simple de la estructura de datos Pila
//Está parametrizada con T, siendo T el tipo de los elementos que contendrá la pila
public class Pila<T> {
	
	private Nodo<T> cima;//Es el nodo que se encuentra en la cima de la pila
	private int tam=0;//Es el tamaño de la pila
	
	
	//Esta función añade un elemento a la cima de la pila
	public void push(T elemento){
		cima=new Nodo<T>(cima,elemento);
		tam++;
	}
	
	//Esta función retira un elemento de la cima de la pila y lo devuelve
	public T pop(){
		T element=null;
		if(cima!=null){
			element=cima.getElemento();
			cima=cima.getInferior();
			tam--;
		}
		
		return element;
	}
	
	//Esta función devuelve el elemento que está en la cima de la pila sin retirarlo 
	public T peek(){
		T element=null;
		if(cima!=null)
			element=cima.getElemento();
		
		return element;
	}
	
	//Esta función devuelve el tamaño de la pila
	public int tamanio(){
		return tam;
	}
	
	//Esta función devuelve true si la pila está vacía
	public boolean vacia(){
		return tam==0;
	}
	
	//Sobreescritura de la función toString de la clase Object que imprime los elementos 
	//de la pila, siendo los que aparecen más a la izquierda los que están en la cima
	public String toString(){
		Nodo<T> el=cima;
		String s="[";
		if(cima!=null)
			while(el.getInferior()!=null){
				s+=el.getElemento()+",";
				el=el.getInferior();
			}
		s+=el.getElemento()+"]";
		
		return s;
	}
}
