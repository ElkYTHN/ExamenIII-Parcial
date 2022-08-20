package com.elkin.exameniii_parcial;

public class Medicamentos {
        public int id_medicamento;
        public String Descripcion;
        public int Cantidad;
        public String Tiempo;
        public int Periocidad;
        public String Imagen;

    public Medicamentos(int id_medicamento, String descripcion, int cantidad, String tiempo, int periocidad, String imagen) {


        this.id_medicamento = id_medicamento;
        Descripcion = descripcion;
        Cantidad = cantidad;
        Tiempo = tiempo;
        Periocidad = periocidad;
        Imagen = imagen;
    }

    public int getId_medicamento() {
        return id_medicamento;
    }

    public void setId_medicamento(int id_medicamento) {
        this.id_medicamento = id_medicamento;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public String getTiempo() {
        return Tiempo;
    }

    public void setTiempo(String tiempo) {
        Tiempo = tiempo;
    }

    public int getPeriocidad() {
        return Periocidad;
    }

    public void setPeriocidad(int periocidad) {
        Periocidad = periocidad;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }
}
