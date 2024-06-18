package org.example;

import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BlogManager manager = new BlogManager();

        manager.addEntrada(new Entrada("Titulo 1", "Noticia 1", "http://urlnoticia1.com", new Date()));
        manager.addEntrada(new Entrada("Titulo 2", "Noticia 2", "http://urlNoticia2.com", new Date()));
        manager.addEntrada(new Entrada("Titulo 3", "Noticia 3", "http://urlNoticia3.com", new Date()));
        manager.addEntrada(new Entrada("Titulo 4", "Noticia 4", "http://urlNoticia4.com", new Date()));
        manager.addEntrada(new Entrada("Titulo 5", "Noticia 5", "http://urlNoticia5.com", new Date()));


        List<Entrada> todasEntradas = manager.getAllEntradas();
        System.out.println("entradas:");
        for (Entrada entrada : todasEntradas) {
            System.out.println(entrada);
        }


        List<Entrada> ultimasEntradas = manager.getLast3Entradas();
        System.out.println("\nLas últimas 3 entradas:");
        for (Entrada entrada : ultimasEntradas) {
            System.out.println(entrada);
        }
    }
}
