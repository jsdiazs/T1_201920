package model.data_structures;

public class Node 
{
	public Object valor;
	public Node siguiente=null; 	
	
	public Node(Object valor)
	{
		this.valor = valor;
		this.siguiente = null;
	}
	
	public Object obtenerValor()
	{
		return valor;
	}
	
	public void enlazarSiguiente(Node n)
	{
		siguiente=n;
	}
	
	public Node obtenerSiguiente()
	{
		return siguiente;
	}
}
