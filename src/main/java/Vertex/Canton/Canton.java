package Vertex.Canton;

import Statistics.EstadisticasEducacion;
import Statistics.EstadisticasLaboral;
import Vertex.Vertex;

/**
 * Created by alexiaborchgrevink on 11/1/17.
 */
public class Canton implements Vertex {

    private String provincia;
    private int objectID;
    private String nombreCanton;
    private EstadisticasEducacion educacion;
    private EstadisticasLaboral fuerzaLaboral;


    public Canton(int objectID, String provincia, String nombreCanton) {
        this.objectID = objectID;
        this.nombreCanton = nombreCanton;
        this.provincia = provincia;
    }

    public void setEducacion(EstadisticasEducacion educacion) {
        this.educacion = educacion;
    }

    public EstadisticasEducacion getEducacion() {
        return this.educacion;
    }

    public void setFuerzaLaboral(EstadisticasLaboral laboral) {
        this.fuerzaLaboral = laboral;
    }

    public EstadisticasLaboral getFuerzaLaboral() {
        return this.fuerzaLaboral;
    }
}
