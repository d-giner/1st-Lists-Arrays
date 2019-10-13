import java.util.LinkedList;

public class QueueImpl<E> implements Queue<E> {

    /**
     * creamos un vector el cual forma la cola
     */
    E[] data;
    int p;//indice que nos dice cuantos elementos hay actualmente en la cola

    public QueueImpl(int len) {//constructor

        this.data = (E[])new Object[len];//se crea la cola con el tamaño que nos pasen en el constructor
        this.p = 0;//el numero de elementos es cero

    }

    /**
     * Mètode que ....
     * @param e element a afegir
     * @throws QueueFullException llença una excepció en el cas que la cua estigui plena
     */
    public void push(E e) throws QueueFullException{

        if (this.isFull()) {
  //          log.warn("Cua Plena")
            throw new QueueFullException();//si la cola esta llena enviar error
        }

//        log.info("afegim "+e +" a pos"+p);
        data[p] = e;//añadimos el elemento e incrementamos el indice
        p++;

    }

    /**
     *
     * @return
     * @throws QueueEmptyException
     */
    public E pop() throws QueueEmptyException {//Eliminamos el primer elemento de la cola y desplazamos todos los elementos una posición
        if (this.isEmpty()) throw new QueueEmptyException();

        E res = this.data[0];
//        log.info("desencuem "+res); //
        p=p-1;
        lshift();

        return res;
    }


    private void lshift() {//desplazamos todos los elementos en una posicion
        int i=0;
        while(i<p){
            data[i]=data[i+1];
            i++;
        }
    }

    private boolean isFull() {//comprobar si la cola esta llena
        return (p>=this.data.length);
    }
    private boolean isEmpty() {
        return (this.size()==0);
    }

    public int size() {
        return this.p;
    }
}
