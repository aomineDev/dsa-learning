package pe.edu.utp;

import java.util.List;

import javax.swing.tree.TreeNode;

class NodoArbol {
  // Aqui crea tu clase nodo para el arbol
  public int raiz;
  public NodoArbol izquierda, derecha;

  public NodoArbol(int raiz) {
    this.raiz = raiz;
    this.izquierda = null;
    this.derecha = null;
  }
}

public class Test {
  static String respuesta = "";

  public static String solucion(String arbol, String hechizo) {
    // Escribe aqui tu solución
    String[] arbolStr = arbol.split(",");
    NodoArbol nodoArbol = new NodoArbol(Integer.parseInt(arbolStr[0]));
    NodoArbol nodoIzquierda = new NodoArbol(Integer.parseInt(arbolStr[1]));
    NodoArbol nodoDerecha = new NodoArbol(Integer.parseInt(arbolStr[2]));

    nodoArbol.izquierda = nodoIzquierda;
    nodoArbol.derecha = nodoDerecha;

    respuesta = "";

    if (hechizo.equals("preorder")) {
      preorden(nodoArbol);
    } else if (hechizo.equals("inorder")) {
      inorden(nodoArbol);
    } else if (hechizo.equals("postorder")) {
      postorden(nodoArbol);
    }

    return respuesta.substring(0, respuesta.length() - 1);
  }

  static void preorden(NodoArbol nodo) {
    if (nodo != null) {
      respuesta += nodo.raiz + ",";
      preorden(nodo.izquierda);
      preorden(nodo.derecha);
    }
  }

  static void inorden(NodoArbol nodo) {
    if (nodo != null) {
      inorden(nodo.izquierda);
      respuesta += nodo.raiz + ",";
      inorden(nodo.derecha);
    }
  }

  static void postorden(NodoArbol nodo) {
    if (nodo != null) {
      postorden(nodo.izquierda);
      postorden(nodo.derecha);
      respuesta += nodo.raiz + ",";
    }
  }

  public static void main(String[] args) {
    Object[][] testCase1 = { { "10,5,15", "postorder" }, { "5,15,10" } };
    Object[][] testCase2 = { { "1,2,3", "inorder" }, { "2,1,3" } };

    String result = solucion(testCase1[0][0].toString(), testCase1[0][1].toString());

    System.out.println(result);
  }
}
