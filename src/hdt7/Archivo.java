/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author andreabarrera
 */
public class Archivo {
    private File archivo;
    private BufferedReader br;
    private FileReader fr;

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
            String datos = new String("");
            try
            {
                    String SLine;
                    while((SLine=br.readLine())!=null)
                    {
                            datos = SLine;
                    }
                    fr.close();
            }
            catch (Exception e)
            {
                    System.out.println(e.getMessage());
            }

            return datos;
    }
}
