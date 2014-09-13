//****************************************************************
// Autores: Otto Wantland Carne: 13663 Diego Rodriguez Carne: 13111 Andrea Barrera
// Seccion: 20
//Fecha 12/9/14
// Nombre de Archivo: Archivo.java
// Breve Descripcion: Clase que se encarga de cargar el archivo de texto para poder usarlo en la calculadora
//*****************************************************************
import java.io.*;
public class Archivo 
{
    //ATRIBUTOS
    private File archivo;
    private BufferedReader br;
    private FileReader fr;
    private String datos;

    //Constructor
    //Busca el archivo y prepara un filereader y bufferreader para poder transformarlo a String
    public Archivo(String texto)
    {
            archivo = new File(texto+".txt");
            if(!archivo.exists())
            {
                    System.out.print("El archivo no se encuentra");
            }
            else
            {
                    try
                    {
                            fr = new FileReader(archivo);
                            br = new BufferedReader(fr);
                    }
                    catch (Exception e)
                    {
                            System.out.println(e.getMessage());
                    }
            }

    }

    //Metodo que se encarga de convertir los datos del texto en String
    //Metodo basado en un metodo de Mykong
    //Encontrado en: http://www.mkyong.com/java/how-to-read-file-from-java-bufferedreader-example/
    public String leerArchivo()
    {
    	try
    	{
            datos = br.readLine();	
    	}
    catch (IOException e)
    {
    	e.printStackTrace();
    }
    finally
    {
    	return datos;
    }
    }
}