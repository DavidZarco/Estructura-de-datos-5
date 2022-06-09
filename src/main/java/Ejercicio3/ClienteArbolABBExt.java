package Ejercicio3;

import ar.edu.uner.fcad.ed.arbolesabbyavl.ArbolABB;

/**
 *
 * @author David Zarcó
 */
public class ClienteArbolABBExt {
    
    public static void main(String[] args) {
        
    
      ArbolABBExt<Integer> tree = new ArbolABBExt<>();
      
      tree.add(20);
      tree.add(9);
      tree.add(92);
      tree.add(90);
      tree.add(10);
      tree.add(31);
      tree.add(99);
      tree.add(19);
      tree.add(3);
      tree.add(13);
      tree.add(84);
      tree.add(55);
      tree.add(4);
      tree.add(17);
      
      System.out.println("Nodo con menor valor de clave: " + tree.min());
      System.out.println("Nodo con mayor valor de clave: " + tree.max());
        
    }
}
//que down mal bldo que MOGOLICOO