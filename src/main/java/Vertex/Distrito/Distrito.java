package Vertex.Distrito;

import Statistics.EstadisticasEducacion;
import Statistics.EstadisticasLaboral;
import Vertex.Vertex;

/**
 * Created by alexiaborchgrevink on 11/1/17.
 */
public class Distrito implements Vertex {

    private String provincia;
    private String canton;
    private String nombreDistrito;
    private int objectID;
    private EstadisticasLaboral fuerzaLaboral;
    private EstadisticasEducacion educacion;

    public Distrito(int objectID, String provincia, String canton, String nombre) { //En mismo orden en el que viene en el JSON
        this.nombreDistrito = nombre;
        this.provincia = provincia;
        this.canton = canton;
        this.objectID = objectID;
    }

    public EstadisticasLaboral getFuerzaLaboral() {
        return fuerzaLaboral;
    }

    public void setFuerzaLaboral(EstadisticasLaboral fuerzaLaboral) {
        this.fuerzaLaboral = fuerzaLaboral;
    }

    public EstadisticasEducacion getEducacion() {
        return educacion;
    }

    public void setEducacion(EstadisticasEducacion educacion) {
        this.educacion = educacion;
    }

}
