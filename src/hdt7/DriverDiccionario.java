//****************************************************************
// Autores: Andrea Barrera Carne: 13655 Otto Wantland Carne: 13663 Diego Rodriguez Carne: 13111
// Seccion: 20
//Fecha 12/9/14
// Nombre de Archivo: DriverDiccionario.java
// Breve Descripcion: Driver para la clase diccionario
//*****************************************************************

//Constructor del main
public class DriverDiccionario
{
	public static void main (String[] args)
	{
		Diccionario miDiccionario = new Diccionario("Diccionario", "Oracion");
		miDiccionario.Asociar();
		miDiccionario.Ejecutar();
                miDiccionario.inOrder();
                
	}
}