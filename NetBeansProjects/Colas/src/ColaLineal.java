/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiante
 */
public class ColaLineal {
    private static final int MAXTAMQ=39;
    private int frente;
    private int fin;
    private Object [] listaCola;
    public ColaLineal()
    {
        frente=0;
        fin=-1;
        listaCola=new Object[MAXTAMQ];
    }
    public void insertar(Object element) throws Exception
    {
        if(colaLlena())
        {
            listaCola[++fin]= element;
        }
    }
    public Object quitar() throws Exception
    {
        if(colaVacia())
        return listaCola[frente++];
        else
            throw Exception("Cola Vacia");
    }
    public boolean colaLlena()
    {
        return fin==MAXTAMQ;
    }
    public boolean colaVacia()
    {
        return frente>fin;
    }

    private Exception Exception(String cola_Vacia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String args[])
    {
        
    }
}
