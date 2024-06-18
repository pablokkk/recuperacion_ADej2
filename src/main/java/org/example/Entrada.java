package org.example;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Entrada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titulo;
    private String contenido;
    private String url;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public Entrada() {
    }

    public Entrada(String titulo, String contenido, String url, Date fecha) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.url = url;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Entrada [id=" + id + ", titulo=" + titulo + ", contenido=" + contenido + ", url=" + url + ", fecha="
                + fecha + "]";
    }
}
