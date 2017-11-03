package Statistics;

/**
 * Created by alexiaborchgrevink on 11/2/17.
 */
public abstract class EstadisticasEducacion {

    private int objectId;
    private double porcentajePoblaMenor5AsisteKinder;
    private double porcentajePoblaMasDe65AsisteCentroDiurno;
    private double porcentajePoblaAnalfabetaTotal;

    public EstadisticasEducacion(int objectId, double porcentajePoblaMenor5AsisteKinder, double porcentajePoblaMasDe65AsisteCentroDiurno, double porcentajePoblaAnalfabetaTotal, double porcentajePoblaAnalfabetaHombres, double porcentajePoblaAnalfabetaMujeres, double porcentajeAsistenciaEduReg, double porcentajeAsistenciaEduRegPublica, double porcentajeAsistenciaEduRegPrivada, double porcentajePobla5a15EduReg, double porcentajeAsistenciaEduAbierta, double porcentajeAsistenciaEduAbiertaHombres, double porcentajeAsistenciaEduAbiertaMujeres, double porcentajePoblaMasDe15ConSecundaria, double porcentajePoblaMasDe15ConSecundariaHombres, double porcentajePoblaMasDe15ConSecundariaMujeres, double porcentajePoblaMasDe17ConEduSuperior, double porcentajePoblaMasDe17ConEduSuperiorHombres, double porcentajePoblaMasDe17ConEduSuperiorMujeres, double porcentajeTituloUniversitario, double porcentajeEscolaridad, double porcentajeEscolaridadHombres, double porcentajeEscolaridadMujeres, double porcentajePobla7a17Rezago, double porcentajePobla7a17RezagoHombres, double porcentajePobla7a17RezagoMujeres, double porcentajePoblaMasDe5Celular, double porcentajeInternet) {
        this.objectId = objectId;
        this.porcentajePoblaMenor5AsisteKinder = porcentajePoblaMenor5AsisteKinder;
        this.porcentajePoblaMasDe65AsisteCentroDiurno = porcentajePoblaMasDe65AsisteCentroDiurno;
        this.porcentajePoblaAnalfabetaTotal = porcentajePoblaAnalfabetaTotal;
        this.porcentajePoblaAnalfabetaHombres = porcentajePoblaAnalfabetaHombres;
        this.porcentajePoblaAnalfabetaMujeres = porcentajePoblaAnalfabetaMujeres;
        this.porcentajeAsistenciaEduReg = porcentajeAsistenciaEduReg;
        this.porcentajeAsistenciaEduRegPublica = porcentajeAsistenciaEduRegPublica;
        this.porcentajeAsistenciaEduRegPrivada = porcentajeAsistenciaEduRegPrivada;
        this.porcentajePobla5a15EduReg = porcentajePobla5a15EduReg;
        this.porcentajeAsistenciaEduAbierta = porcentajeAsistenciaEduAbierta;
        this.porcentajeAsistenciaEduAbiertaHombres = porcentajeAsistenciaEduAbiertaHombres;
        this.porcentajeAsistenciaEduAbiertaMujeres = porcentajeAsistenciaEduAbiertaMujeres;
        this.porcentajePoblaMasDe15ConSecundaria = porcentajePoblaMasDe15ConSecundaria;
        this.porcentajePoblaMasDe15ConSecundariaHombres = porcentajePoblaMasDe15ConSecundariaHombres;
        this.porcentajePoblaMasDe15ConSecundariaMujeres = porcentajePoblaMasDe15ConSecundariaMujeres;
        this.porcentajePoblaMasDe17ConEduSuperior = porcentajePoblaMasDe17ConEduSuperior;
        this.porcentajePoblaMasDe17ConEduSuperiorHombres = porcentajePoblaMasDe17ConEduSuperiorHombres;
        this.porcentajePoblaMasDe17ConEduSuperiorMujeres = porcentajePoblaMasDe17ConEduSuperiorMujeres;
        this.porcentajeTituloUniversitario = porcentajeTituloUniversitario;
        this.porcentajeEscolaridad = porcentajeEscolaridad;
        this.porcentajeEscolaridadHombres = porcentajeEscolaridadHombres;
        this.porcentajeEscolaridadMujeres = porcentajeEscolaridadMujeres;
        this.porcentajePobla7a17Rezago = porcentajePobla7a17Rezago;
        this.porcentajePobla7a17RezagoHombres = porcentajePobla7a17RezagoHombres;
        this.porcentajePobla7a17RezagoMujeres = porcentajePobla7a17RezagoMujeres;
        this.porcentajePoblaMasDe5Celular = porcentajePoblaMasDe5Celular;
        this.porcentajeInternet = porcentajeInternet;
    }

    public EstadisticasEducacion() {

    }

    private double porcentajePoblaAnalfabetaHombres;
    private double porcentajePoblaAnalfabetaMujeres;
    private double porcentajeAsistenciaEduReg;
    private double porcentajeAsistenciaEduRegPublica;
    private double porcentajeAsistenciaEduRegPrivada;
    private double porcentajePobla5a15EduReg;
    private double porcentajeAsistenciaEduAbierta;
    private double porcentajeAsistenciaEduAbiertaHombres;
    private double porcentajeAsistenciaEduAbiertaMujeres;
    private double porcentajePoblaMasDe15ConSecundaria;
    private double porcentajePoblaMasDe15ConSecundariaHombres;
    private double porcentajePoblaMasDe15ConSecundariaMujeres;
    private double porcentajePoblaMasDe17ConEduSuperior;
    private double porcentajePoblaMasDe17ConEduSuperiorHombres;
    private double porcentajePoblaMasDe17ConEduSuperiorMujeres;
    private double porcentajeTituloUniversitario;
    private double porcentajeEscolaridad;
    private double porcentajeEscolaridadHombres;
    private double porcentajeEscolaridadMujeres;
    private double porcentajePobla7a17Rezago;
    private double porcentajePobla7a17RezagoHombres;
    private double porcentajePobla7a17RezagoMujeres;
    private double porcentajePoblaMasDe5Celular;
    private double porcentajeInternet;


    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public double getPorcentajePoblaMenor5AsisteKinder() {
        return porcentajePoblaMenor5AsisteKinder;
    }

    public void setPorcentajePoblaMenor5AsisteKinder(double porcentajePoblaMenor5AsisteKinder) {
        this.porcentajePoblaMenor5AsisteKinder = porcentajePoblaMenor5AsisteKinder;
    }

    public double getPorcentajePoblaMasDe65AsisteCentroDiurno() {
        return porcentajePoblaMasDe65AsisteCentroDiurno;
    }

    public void setPorcentajePoblaMasDe65AsisteCentroDiurno(double porcentajePoblaMasDe65AsisteCentroDiurno) {
        this.porcentajePoblaMasDe65AsisteCentroDiurno = porcentajePoblaMasDe65AsisteCentroDiurno;
    }

    public double getPorcentajePoblaAnalfabetaTotal() {
        return porcentajePoblaAnalfabetaTotal;
    }

    public void setPorcentajePoblaAnalfabetaTotal(double porcentajePoblaAnalfabetaTotal) {
        this.porcentajePoblaAnalfabetaTotal = porcentajePoblaAnalfabetaTotal;
    }

    public double getPorcentajePoblaAnalfabetaHombres() {
        return porcentajePoblaAnalfabetaHombres;
    }

    public void setPorcentajePoblaAnalfabetaHombres(double porcentajePoblaAnalfabetaHombres) {
        this.porcentajePoblaAnalfabetaHombres = porcentajePoblaAnalfabetaHombres;
    }

    public double getPorcentajePoblaAnalfabetaMujeres() {
        return porcentajePoblaAnalfabetaMujeres;
    }

    public void setPorcentajePoblaAnalfabetaMujeres(double porcentajePoblaAnalfabetaMujeres) {
        this.porcentajePoblaAnalfabetaMujeres = porcentajePoblaAnalfabetaMujeres;
    }

    public double getPorcentajeAsistenciaEduReg() {
        return porcentajeAsistenciaEduReg;
    }

    public void setPorcentajeAsistenciaEduReg(double porcentajeAsistenciaEduReg) {
        this.porcentajeAsistenciaEduReg = porcentajeAsistenciaEduReg;
    }

    public double getPorcentajeAsistenciaEduRegPublica() {
        return porcentajeAsistenciaEduRegPublica;
    }

    public void setPorcentajeAsistenciaEduRegPublica(double porcentajeAsistenciaEduRegPublica) {
        this.porcentajeAsistenciaEduRegPublica = porcentajeAsistenciaEduRegPublica;
    }

    public double getPorcentajeAsistenciaEduRegPrivada() {
        return porcentajeAsistenciaEduRegPrivada;
    }

    public void setPorcentajeAsistenciaEduRegPrivada(double porcentajeAsistenciaEduRegPrivada) {
        this.porcentajeAsistenciaEduRegPrivada = porcentajeAsistenciaEduRegPrivada;
    }

    public double getPorcentajePobla5a15EduReg() {
        return porcentajePobla5a15EduReg;
    }

    public void setPorcentajePobla5a15EduReg(double porcentajePobla5a15EduReg) {
        this.porcentajePobla5a15EduReg = porcentajePobla5a15EduReg;
    }

    public double getPorcentajeAsistenciaEduAbierta() {
        return porcentajeAsistenciaEduAbierta;
    }

    public void setPorcentajeAsistenciaEduAbierta(double porcentajeAsistenciaEduAbierta) {
        this.porcentajeAsistenciaEduAbierta = porcentajeAsistenciaEduAbierta;
    }

    public double getPorcentajeAsistenciaEduAbiertaHombres() {
        return porcentajeAsistenciaEduAbiertaHombres;
    }

    public void setPorcentajeAsistenciaEduAbiertaHombres(double porcentajeAsistenciaEduAbiertaHombres) {
        this.porcentajeAsistenciaEduAbiertaHombres = porcentajeAsistenciaEduAbiertaHombres;
    }

    public double getPorcentajeAsistenciaEduAbiertaMujeres() {
        return porcentajeAsistenciaEduAbiertaMujeres;
    }

    public void setPorcentajeAsistenciaEduAbiertaMujeres(double porcentajeAsistenciaEduAbiertaMujeres) {
        this.porcentajeAsistenciaEduAbiertaMujeres = porcentajeAsistenciaEduAbiertaMujeres;
    }

    public double getPorcentajePoblaMasDe15ConSecundaria() {
        return porcentajePoblaMasDe15ConSecundaria;
    }

    public void setPorcentajePoblaMasDe15ConSecundaria(double porcentajePoblaMasDe15ConSecundaria) {
        this.porcentajePoblaMasDe15ConSecundaria = porcentajePoblaMasDe15ConSecundaria;
    }

    public double getPorcentajePoblaMasDe15ConSecundariaHombres() {
        return porcentajePoblaMasDe15ConSecundariaHombres;
    }

    public void setPorcentajePoblaMasDe15ConSecundariaHombres(double porcentajePoblaMasDe15ConSecundariaHombres) {
        this.porcentajePoblaMasDe15ConSecundariaHombres = porcentajePoblaMasDe15ConSecundariaHombres;
    }

    public double getPorcentajePoblaMasDe15ConSecundariaMujeres() {
        return porcentajePoblaMasDe15ConSecundariaMujeres;
    }

    public void setPorcentajePoblaMasDe15ConSecundariaMujeres(double porcentajePoblaMasDe15ConSecundariaMujeres) {
        this.porcentajePoblaMasDe15ConSecundariaMujeres = porcentajePoblaMasDe15ConSecundariaMujeres;
    }

    public double getPorcentajePoblaMasDe17ConEduSuperior() {
        return porcentajePoblaMasDe17ConEduSuperior;
    }

    public void setPorcentajePoblaMasDe17ConEduSuperior(double porcentajePoblaMasDe17ConEduSuperior) {
        this.porcentajePoblaMasDe17ConEduSuperior = porcentajePoblaMasDe17ConEduSuperior;
    }

    public double getPorcentajePoblaMasDe17ConEduSuperiorHombres() {
        return porcentajePoblaMasDe17ConEduSuperiorHombres;
    }

    public void setPorcentajePoblaMasDe17ConEduSuperiorHombres(double porcentajePoblaMasDe17ConEduSuperiorHombres) {
        this.porcentajePoblaMasDe17ConEduSuperiorHombres = porcentajePoblaMasDe17ConEduSuperiorHombres;
    }

    public double getPorcentajePoblaMasDe17ConEduSuperiorMujeres() {
        return porcentajePoblaMasDe17ConEduSuperiorMujeres;
    }

    public void setPorcentajePoblaMasDe17ConEduSuperiorMujeres(double porcentajePoblaMasDe17ConEduSuperiorMujeres) {
        this.porcentajePoblaMasDe17ConEduSuperiorMujeres = porcentajePoblaMasDe17ConEduSuperiorMujeres;
    }

    public double getPorcentajeTituloUniversitario() {
        return porcentajeTituloUniversitario;
    }

    public void setPorcentajeTituloUniversitario(double porcentajeTituloUniversitario) {
        this.porcentajeTituloUniversitario = porcentajeTituloUniversitario;
    }

    public double getPorcentajeEscolaridad() {
        return porcentajeEscolaridad;
    }

    public void setPorcentajeEscolaridad(double porcentajeEscolaridad) {
        this.porcentajeEscolaridad = porcentajeEscolaridad;
    }

    public double getPorcentajeEscolaridadHombres() {
        return porcentajeEscolaridadHombres;
    }

    public void setPorcentajeEscolaridadHombres(double porcentajeEscolaridadHombres) {
        this.porcentajeEscolaridadHombres = porcentajeEscolaridadHombres;
    }

    public double getPorcentajeEscolaridadMujeres() {
        return porcentajeEscolaridadMujeres;
    }

    public void setPorcentajeEscolaridadMujeres(double porcentajeEscolaridadMujeres) {
        this.porcentajeEscolaridadMujeres = porcentajeEscolaridadMujeres;
    }

    public double getPorcentajePobla7a17Rezago() {
        return porcentajePobla7a17Rezago;
    }

    public void setPorcentajePobla7a17Rezago(double porcentajePobla7a17Rezago) {
        this.porcentajePobla7a17Rezago = porcentajePobla7a17Rezago;
    }

    public double getPorcentajePobla7a17RezagoHombres() {
        return porcentajePobla7a17RezagoHombres;
    }

    public void setPorcentajePobla7a17RezagoHombres(double porcentajePobla7a17RezagoHombres) {
        this.porcentajePobla7a17RezagoHombres = porcentajePobla7a17RezagoHombres;
    }

    public double getPorcentajePobla7a17RezagoMujeres() {
        return porcentajePobla7a17RezagoMujeres;
    }

    public void setPorcentajePobla7a17RezagoMujeres(double porcentajePobla7a17RezagoMujeres) {
        this.porcentajePobla7a17RezagoMujeres = porcentajePobla7a17RezagoMujeres;
    }

    public double getPorcentajePoblaMasDe5Celular() {
        return porcentajePoblaMasDe5Celular;
    }

    public void setPorcentajePoblaMasDe5Celular(double porcentajePoblaMasDe5Celular) {
        this.porcentajePoblaMasDe5Celular = porcentajePoblaMasDe5Celular;
    }

    public double getPorcentajeInternet() {
        return porcentajeInternet;
    }

    public void setPorcentajeInternet(double porcentajeInternet) {
        this.porcentajeInternet = porcentajeInternet;
    }


}
