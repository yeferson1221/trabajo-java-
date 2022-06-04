package workshopThree;

/**
 * [
 *   la interfaces contiene los cuatro metodos reglamentarios
 * ]
 * @version [1,0.0]
 *
 * @author [Yeferson Valencia, alejandro.yand@gmail.com]
 * @since [1,0,0]
 *
 */
public interface Deliverable {
    public void entregar();
    public void  devolver();
    public boolean isEntregado();

    public int compareTo(Object o);

}
