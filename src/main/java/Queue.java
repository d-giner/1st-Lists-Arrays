public interface Queue <E> {

    public void push (E e) throws QueueFullException;//Añade un elemento a la cola si esta llena salta la excepción
    public E pop() throws QueueEmptyException;//elimina el primer elemento de la cola(FIFO) y nos lo devuelve
    public int size();//Nos devuelve el tamaño de la cola
}
