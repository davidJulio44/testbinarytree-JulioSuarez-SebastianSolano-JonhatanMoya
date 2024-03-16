package mundo;

class ArbolBinario {
    Nodo raiz;

    ArbolBinario() {
        raiz = null;
    }


    void insertar(int valor) {
        raiz = insertarNodo(raiz, valor);
    }

    Nodo insertarNodo(Nodo nodo, int valor) {

        if (nodo == null) {
            nodo = new Nodo(valor);
            return nodo;
        }


        if (valor < nodo.valor)
            nodo.izquierda = insertarNodo(nodo.izquierda, valor);
        else if (valor > nodo.valor)
            nodo.derecha = insertarNodo(nodo.derecha, valor);


        return nodo;
    }


    void inorder(Nodo nodo) {
        if (nodo != null) {
            inorder(nodo.izquierda);
            System.out.print(nodo.valor + " ");
            inorder(nodo.derecha);
        }
    }
    
    void preorder(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preorder(nodo.izquierda);
            preorder(nodo.derecha);
        }
    }

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.insertar(15);
        arbol.insertar(7);
        arbol.insertar(18);
        arbol.insertar(3);
        arbol.insertar(12);
        arbol.insertar(2);
        arbol.insertar(4);
        arbol.insertar(11);
        arbol.insertar(0);
        arbol.insertar(16);
        arbol.insertar(19);
        arbol.insertar(17);
        arbol.insertar(31);
        arbol.insertar(22);

        System.out.println("Recorrido inorder del árbol binario:");
        arbol.inorder(arbol.raiz);
        
        System.out.println("\nRecorrido preorder del arbol binario: ");
        arbol.preorder(arbol.raiz);
    }
}

