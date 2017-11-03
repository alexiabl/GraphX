package Statistics;

/**
 * Created by alexiaborchgrevink on 11/2/17.
 */
public abstract class EstadisticasLaboral {

    private int objectID;
    private double porcentajePoblaMasDe15;
    private double porcentajeFuerzaTrabajoTotal;
    private double porcentajeFuerzaTrabajoOcup;
    private double porcentajeDesempleadaTotal;
    private double porcentajeDesempleadaConExper;
    private double porcentajeDesempleadaSinExper;
    private double porcentajeFueraDeLaFuerzaLaboralTotal;
    private double porcentajePensionado;
    private double porcentajeViveDeAlquiler;
    private double porcentajeFuerzaTrabajoEstudiante;
    private double porcentajeFuerzaTrabajoHogar;
    private double porcentajeFuerzaTrabajoOtros;

    public EstadisticasLaboral(int objectID, double porcentajePoblaMasDe15, double porcentajeFuerzaTrabajoTotal, double porcentajeFuerzaTrabajoOcup, double porcentajeDesempleadaTotal, double porcentajeDesempleadaConExper, double porcentajeDesempleadaSinExper, double porcentajeFueraDeLaFuerzaLaboralTotal, double porcentajePensionado, double porcentajeViveDeAlquiler, double porcentajeFuerzaTrabajoEstudiante, double porcentajeFuerzaTrabajoHogar, double porcentajeFuerzaTrabajoOtros) {
        this.objectID = objectID;
        this.porcentajePoblaMasDe15 = porcentajePoblaMasDe15;
        this.porcentajeFuerzaTrabajoTotal = porcentajeFuerzaTrabajoTotal;
        this.porcentajeFuerzaTrabajoOcup = porcentajeFuerzaTrabajoOcup;
        this.porcentajeDesempleadaTotal = porcentajeDesempleadaTotal;
        this.porcentajeDesempleadaConExper = porcentajeDesempleadaConExper;
        this.porcentajeDesempleadaSinExper = porcentajeDesempleadaSinExper;
        this.porcentajeFueraDeLaFuerzaLaboralTotal = porcentajeFueraDeLaFuerzaLaboralTotal;
        this.porcentajePensionado = porcentajePensionado;
        this.porcentajeViveDeAlquiler = porcentajeViveDeAlquiler;
        this.porcentajeFuerzaTrabajoEstudiante = porcentajeFuerzaTrabajoEstudiante;
        this.porcentajeFuerzaTrabajoHogar = porcentajeFuerzaTrabajoHogar;
        this.porcentajeFuerzaTrabajoOtros = porcentajeFuerzaTrabajoOtros;
    }


    public EstadisticasLaboral() {

    }


    public int getObjectID() {
        return objectID;
    }

    public void setObjectID(int objectID) {
        this.objectID = objectID;
    }

    public double getPorcentajePoblaMasDe15() {
        return porcentajePoblaMasDe15;
    }

    public void setPorcentajePoblaMasDe15(double porcentajePoblaMasDe15) {
        this.porcentajePoblaMasDe15 = porcentajePoblaMasDe15;
    }

    public double getPorcentajeFuerzaTrabajoTotal() {
        return porcentajeFuerzaTrabajoTotal;
    }

    public void setPorcentajeFuerzaTrabajoTotal(double porcentajeFuerzaTrabajoTotal) {
        this.porcentajeFuerzaTrabajoTotal = porcentajeFuerzaTrabajoTotal;
    }

    public double getPorcentajeFuerzaTrabajoOcup() {
        return porcentajeFuerzaTrabajoOcup;
    }

    public void setPorcentajeFuerzaTrabajoOcup(double porcentajeFuerzaTrabajoOcup) {
        this.porcentajeFuerzaTrabajoOcup = porcentajeFuerzaTrabajoOcup;
    }

    public double getPorcentajeDesempleadaTotal() {
        return porcentajeDesempleadaTotal;
    }

    public void setPorcentajeDesempleadaTotal(double porcentajeDesempleadaTotal) {
        this.porcentajeDesempleadaTotal = porcentajeDesempleadaTotal;
    }

    public double getPorcentajeDesempleadaConExper() {
        return porcentajeDesempleadaConExper;
    }

    public void setPorcentajeDesempleadaConExper(double porcentajeDesempleadaConExper) {
        this.porcentajeDesempleadaConExper = porcentajeDesempleadaConExper;
    }

    public double getPorcentajeDesempleadaSinExper() {
        return porcentajeDesempleadaSinExper;
    }

    public void setPorcentajeDesempleadaSinExper(double porcentajeDesempleadaSinExper) {
        this.porcentajeDesempleadaSinExper = porcentajeDesempleadaSinExper;
    }

    public double getPorcentajeFueraDeLaFuerzaLaboralTotal() {
        return porcentajeFueraDeLaFuerzaLaboralTotal;
    }

    public void setPorcentajeFueraDeLaFuerzaLaboralTotal(double porcentajeFueraDeLaFuerzaLaboralTotal) {
        this.porcentajeFueraDeLaFuerzaLaboralTotal = porcentajeFueraDeLaFuerzaLaboralTotal;
    }

    public double getPorcentajePensionado() {
        return porcentajePensionado;
    }

    public void setPorcentajePensionado(double porcentajePensionado) {
        this.porcentajePensionado = porcentajePensionado;
    }

    public double getPorcentajeViveDeAlquiler() {
        return porcentajeViveDeAlquiler;
    }

    public void setPorcentajeViveDeAlquiler(double porcentajeViveDeAlquiler) {
        this.porcentajeViveDeAlquiler = porcentajeViveDeAlquiler;
    }

    public double getPorcentajeFuerzaTrabajoEstudiante() {
        return porcentajeFuerzaTrabajoEstudiante;
    }

    public void setPorcentajeFuerzaTrabajoEstudiante(double porcentajeFuerzaTrabajoEstudiante) {
        this.porcentajeFuerzaTrabajoEstudiante = porcentajeFuerzaTrabajoEstudiante;
    }

    public double getPorcentajeFuerzaTrabajoHogar() {
        return porcentajeFuerzaTrabajoHogar;
    }

    public void setPorcentajeFuerzaTrabajoHogar(double porcentajeFuerzaTrabajoHogar) {
        this.porcentajeFuerzaTrabajoHogar = porcentajeFuerzaTrabajoHogar;
    }

    public double getPorcentajeFuerzaTrabajoOtros() {
        return porcentajeFuerzaTrabajoOtros;
    }

    public void setPorcentajeFuerzaTrabajoOtros(double porcentajeFuerzaTrabajoOtros) {
        this.porcentajeFuerzaTrabajoOtros = porcentajeFuerzaTrabajoOtros;
    }


}
