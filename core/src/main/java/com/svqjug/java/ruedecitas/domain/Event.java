package com.svqjug.java.ruedecitas.domain;

import org.codehaus.jackson.annotate.JsonProperty;

@SuppressWarnings("UnusedDeclaration")
public class Event {

    final String titulo;
    final Fecha fecha;
    final String descripcion;

    public Event(@JsonProperty("titulo") final String titulo,
                 @JsonProperty("fecha") final Fecha fecha,
                 @JsonProperty("descripcion") final String descripcion) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
