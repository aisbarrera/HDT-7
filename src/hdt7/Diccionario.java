//****************************************************************
// Autores:Otto Wantland Carne: 13663 Diego Rodriguez Carne: 13111
// Seccion: 20
//Fecha 12/9/14
// Nombre de Archivo: Diccionario.java
// Breve Descripcion: Clase que se ocupa de crear la lista de palabras dentro del arbol y ayudar a traducir
//*****************************************************************
import java.util.*;
public class Diccionario
{
	//Atributos
	private Archivo miArchivo, miOracion;
	private BST arbol;
	private String palabras, oracion;
	private int contador;
	protected  String[] ingles, espaniol;
	
	//Metodos
	//Constructor
	public Diccionario(String texto, String texto2)
	{
		miArchivo = new Archivo(texto);
		miOracion = new Archivo(texto2);
		arbol = new BST();
		palabras = miArchivo.leerArchivo();
		oracion = miOracion.leerArchivo();
               
	}
	
	//Busca la oracion  a traducir
	public void Ejecutar()
	{
		busqueda(oracion);
	}

	//Se ocupa de crear las listas con las palabras en espaniol e ingles
	public void Asociar()
	{
		String[] ingles = new String[6];
		String[] espaniol = new String[6];
		int contadorIngles = 0;
		int contadorEspaniol = 0;
		String[] elemento = palabras.split(",");
		int contador1 = 1;
		contador = 0;
		int n = elemento.length;
		int i = 0;
		//Creas las litas de palabras en espaniol e ingles
		while (i < n)
		{
				if (!elemento[i].equals(","))
				{
					if(!elemento[i].equals("("))
					{
						if(!elemento[i].equals(")"))
						{
							if (contador1 == 1)
							{
								String element[] = elemento[i].split(" ");
								ingles[contadorIngles] = element[1];
								contadorIngles++;
								contador1 = 2;
							}
							else
							{
								String palabra[] = elemento[i].split(" ");
								espaniol[contadorEspaniol] = palabra[0];
								contadorEspaniol++;
								contador1 = 1;
							}
						}
						else
						{
							
						}
					}
					else
					{
						
					}
				}
				else
				{
					
				}
				i++;
			}
		int m = 6;
		int j = 0;
		//Incorpora las palabras en el arbol de busqueda
		while (j < m)
		{
			arbol.put(ingles[j], espaniol[j]);
			j++;
		}
		
		}
	
	//Permite buscar si las palabras estan dentro del arbol para traducir
	public void busqueda(String oracion)
	{
		String[] elemento = oracion.split(" ");;
		int n = elemento.length;
		int i = 0;
		while (i < n)
		{
			leer(elemento[i]);
			i++;
		}
				
	}
	
	//Permite buscar las palabras que estan dentro del arbol a la hora de traducir
	public void leer(String palabra)
	{
		if (arbol.contains(palabra))
		{
			String word = (String) arbol.get(palabra);
			System.out.print(word);
		}
		else
		{
			System.out.print("*" + palabra + "*");
		}
	}
        
        public void inOrder(){
            arbol.inOrder(arbol.getroot());
        }
}