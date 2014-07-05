package com.svqjug.java.ruedecitas.domain;

import org.codehaus.jackson.annotate.JsonProperty;

@SuppressWarnings("UnusedDeclaration")
public class Fecha {

    final String dia;
    final String mes;
    final String horaComienzo;
    final String horaFin;

    public Fecha(@JsonProperty("dia") final String dia,
                 @JsonProperty("mes")final String mes,
                 @JsonProperty("horaComienzo")final String horaComienzo,
                 @JsonProperty("horaFin")final String horaFin) {
        this.dia = dia;
        this.mes = mes;
        this.horaComienzo = horaComienzo;
        this.horaFin = horaFin;
    }

    public String getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public String getHoraComienzo() {
        return horaComienzo;
    }

    public String getHoraFin() {
        return horaFin;
    }
}
