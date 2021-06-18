/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_carlossanabria;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author HP1
 */
public class Adminstrar_Autos {
    private ArrayList<Autos> ListasAutos = new ArrayList();
    private File archivo = null;
    
    public Adminstrar_Autos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Autos> getListasAutos() {
        return ListasAutos;
    }

    public void setListasAutos(ArrayList<Autos> listaPersona) {
        this.ListasAutos = listaPersona;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setPersona(Autos a){
        ListasAutos.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            ListasAutos = new ArrayList();
            Autos temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Autos) objeto.readObject()) != null) {
                        ListasAutos.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Autos t : ListasAutos) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
