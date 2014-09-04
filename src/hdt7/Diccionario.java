package hdt7;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author andreabarrera
 */
public class Diccionario {
  private Archivo miArchivo;  
  private Set miSet;
  private String datos;
  
  public Diccionario(String texto){
        miArchivo = new Archivo (texto);
        miSet = new TreeSet <String>();
	datos = miArchivo.leerArchivo();
  }
}
