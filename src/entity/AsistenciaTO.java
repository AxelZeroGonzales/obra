
package entity;

public class AsistenciaTO {
    private String codEmpleado;
    private String horas;
        private String fecha;

    public AsistenciaTO(String codEmpleado, String horas, String fecha) {
        this.codEmpleado = codEmpleado;
        this.horas = horas;
        this.fecha = fecha;
    }





    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public String getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    
}
