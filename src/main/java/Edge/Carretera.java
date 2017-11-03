package Edge;

/**
 * Created by alexiaborchgrevink on 11/1/17.
 */
public class Carretera implements Edge {

    private int objectID;
    private String ruta;
    private String tipo;
    private String nRuta;
    private String rl;
    private double shapeLength;

    public Carretera(int objectID, String ruta, String tipo, String nRuta, String rl, double shapeLength) {
        this.objectID = objectID;
        this.ruta = ruta;
        this.tipo = tipo;
        this.nRuta = nRuta;
        this.rl = rl;
        this.shapeLength = shapeLength;
    }
}
