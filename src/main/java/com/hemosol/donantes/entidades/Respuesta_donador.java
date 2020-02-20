
package com.hemosol.donantes.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;


@Entity
public class Respuesta_donador { //es la respuesta del donador, es decir, si cumple los requisitos para donar, puede o no donar. si acepta, el contador de donadores necesarios debe bajar

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id_respuesta;

    public Respuesta_donador() {
    }

    /**
     * @return the id_respuesta
     */
    public String getId_respuesta() {
        return id_respuesta;
    }

    /**
     * @param id_respuesta the id_respuesta to set
     */
    public void setId_respuesta(String id_respuesta) {
        this.id_respuesta = id_respuesta;
    }

}
