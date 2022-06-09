/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import ar.edu.uner.fcad.ed.arbolesabbyavl.ArbolABB;
import ar.edu.uner.fcad.ed.arbolesabbyavl.NodoABB;

/**
 *
 * @author David Zarcó
 */
public class ArbolABBExt <T extends Comparable<T>> extends ArbolABB <T> implements ArbolABBExtInterfaz {

    @Override
    public T min() {
        
        NodoABB <T> nodoActual = raiz;
        
       if (!raiz.tieneHijoIzquierdo()) {
           return raiz.getValor();
       } else 
       
       while (nodoActual.tieneHijoIzquierdo() != false){
           nodoActual = nodoActual.getHijoIzquierdo();
       }
       return nodoActual.getValor();
    }

    @Override
    public T max() {
       NodoABB <T> nodoActual = raiz;
        
       if (!raiz.tieneHijoDerecho()) {
           return raiz.getValor();
       } else 
       
       while (nodoActual.tieneHijoDerecho() != false){
           nodoActual = nodoActual.getHijoDerecho();
       }
       return nodoActual.getValor(); 
    }

    @Override
    public T floor(Comparable valor) {
       NodoABB <T> nodoAux = raiz;
       
       if (valor == raiz.getValor()){
           return raiz.getValor();
       }
       
       while (nodoAux.tieneHijoIzquierdo() || nodoAux.tieneHijoDerecho()){
           
           
       }
       
       return null;
    }

    @Override
    public T ceiling(Comparable valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean esPerfecto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
