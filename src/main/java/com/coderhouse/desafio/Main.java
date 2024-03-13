package com.coderhouse.desafio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Crear 5 personas distintas
        Persona persona1 = new Persona("Juan", "Perez");
        Persona persona2 = new Persona("Maria", "Gomez");
        Persona persona3 = new Persona("Jose", "Lopez");
        Persona persona4 = new Persona("Pedro", "Gonzalez");
        Persona persona5 = new Persona("Ana", "Martinez");

        //Crear una lista de personas
        List<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);

        //Ordenar la lista de personas por nombre
        Persona.ordenarPersonas(personas, Comparator.comparing(Persona::getNombre));
        //Imprimir la lista de personas ordenada
        System.out.println("Lista de personas ordenada por nombre:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        //Ordenar la lista de personas por apellido
        Persona.ordenarPersonas(personas, Comparator.comparing(Persona::getApellido));
        //Imprimir la lista de personas ordenada
        System.out.println("\nLista de personas ordenada por apellido:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        //Ordenar la lista de personas por apellido de forma inversa
        Persona.ordenarPersonas(personas, Comparator.comparing(Persona::getApellido).reversed());
        //Imprimir la lista de personas ordenada
        System.out.println("\nLista de personas ordenada por apellido de forma inversa:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}