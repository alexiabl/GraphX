package Edge;

/**
 * Created by alexiaborchgrevink on 11/1/17.
 */
public class Carretera implements Edge {

    private int objectID;
    private String src;
    private String dest;
    private double shapeLength;

    public Carretera(int objectID, String src, String dest, double shapeLength) {
        this.objectID = objectID;
        this.src = src;
        this.dest = dest;
        this.shapeLength = shapeLength;
    }
}
