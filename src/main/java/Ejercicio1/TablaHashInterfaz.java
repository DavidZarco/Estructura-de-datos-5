/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author David Zarcó
 */

public interface TablaHashInterfaz<K, T> {
 public void put(K clave, T valor);
 public void remove(K clave);
 public T get(K clave);
 public boolean contains(K clave);

 public void makeEmpty();
 public int size();
 public boolean isFull();

 @Override
 public String toString();
}