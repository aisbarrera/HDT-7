/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt7;

/**
 *
 * @author andreabarrera
 */
import java.util.*;
public class Diccionario
{
	//Atributos
	private Archivo miArchivo;
	private BST arbol;
	private String palabras;
	private int contador;
        private Set<String> miSet;
	
	//Metodos
	//Constructor
	Diccionario(String texto)
	{
		miArchivo = new Archivo(texto);
		arbol = new BST();
		palabras = miArchivo.leerArchivo();
                miSet = new TreeSet();
                Asociar();
                traduccion();
	}
	
	public void Asociar()
	{
		String[] elemento = palabras.split(" ");
		contador = 0;
		int n = elemento.length;
		int i = 0;
		while (i < n)
		{
                    if(arbol.contains(elemento[i])){
			arbol.contains(elemento[i]);
                        miSet.add(elemento[i]);
                        i++;
		}
                    else{
                        miSet.add("*"+elemento[i]+"*");
                        i++;
                    }
                        
                    }
	}
        public String traduccion(){
            return "frase traducida: \n" + miSet.toArray();
        }
}