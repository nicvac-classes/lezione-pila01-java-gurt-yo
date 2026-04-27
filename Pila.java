import java.util.NoSuchElementException;

class Pila<T>() {

    private Nodo<T> top;

    public Pila<T>() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top==null;
    }

    public void push(T dato) {
        Nodo<T> nodo = new Nodo<>(dato);
        nodo.next = top;
        top = nodo;
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Pila vuota");
        }
        T dato = top.dato;
        top = top.next;
        return dato;
    }

    public T seek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Pila vuota");
        }
        return head.dato;
    }

    public int size() {
        Nodo<T> curr = top;
        int cont = 0;
        while (curr!=null) {
            ++cont;
            curr = curr.next;
        }
        return cont;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[CIMA] ");
        Nodo<T> corrente = top;
        while (corrente != null) {
            sb.append(corrente.dato);
            sb.append(" --> ");
            corrente = corrente.next;
        }
        sb.append("[FONDO]");
        return sb.toString();
    }



}