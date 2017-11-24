
package entity;


public class Obra {
    String codigo;
    String nombre;
    String lugar;
    String empresa;
    String encargado;

    public Obra() {
    }

    public Obra(String codigo, String nombre, String lugar, String empresa, String encargado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.lugar = lugar;
        this.empresa = empresa;
        this.encargado = encargado;
    }

    public Obra(String nombre) {
        this.nombre = nombre;
    }
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

   

}
