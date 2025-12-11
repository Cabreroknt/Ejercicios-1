
// Crea una clase Coche con marca, modelo y velocidad.
// Implementa métodos para acelerar y frenar.
// Completa lo que falta.
//

class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    public Coche(String marca, int velocidad, String modelo) {
        this.marca = marca;
        this.velocidad = velocidad;
        this.modelo = modelo;
    }

    // Método acelerar (suma +10)
    public void acelerar() {
        velocidad += 10;
    }

    // Método frenar (resta -10 y nunca menor que 0)
    public void frenar() {
        velocidad -= 10;
        if (velocidad < 0) {
            velocidad = 0;
        }
    }


    // Método mostrarDatos
    public void mostrarDatos() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Velocidad: " + velocidad + " km/h");
    }
}



// Un Alumno tiene nombre y una lista de notas (ArrayList<Integer>)
// Implementa: añadirNota, calcularMedia, mostrarInfo.
// Deja todo lo necesario para que el alumno complete.
//

import java.util.ArrayList;

class Alumno {
    private String nombre;
    private ArrayList<Integer> notas;

    // Constructor
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    // Método añadirNota
    public void anadirNota(int nota) {
        notas.add(nota);
    }

    // Método calcularMedia
    public double calcularMedia() {
        if (notas.isEmpty()) {
            System.out.println("No hay notas");
        }
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return (double) suma / notas.size();
    }
    

    // Método mostrarInfo
    public void mostrarInfo() {
        System.out.println("Alumno: " + nombre);
        System.out.println("Notas: " + notas);
        System.out.println("Media: " + calcularMedia());
    }
}


// La CuentaBancaria debe tener titular, saldo y métodos
// ingresar(), retirar() y mostrarSaldo().
// Añade control para no permitir saldo negativo.
//

class CuentaBancaria {
    // atributos
    private String titular;
    private double saldo;

    // constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = (saldoInicial >= 0) ? saldoInicial : 0;
    }

    // método ingresar
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    // método retirar
    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            System.out.println("No se puede retirar: saldo insuficiente o cantidad inválida.");
        }
    }

    // método mostrarSaldo
    public void mostrarSaldo() {
        System.out.println("Titular: " + titular + ", Saldo: " + saldo + " €");
    }
}

// Clase Libro: titulo, autor, disponible.
// Clase Biblioteca: ArrayList<Libro>, métodos añadirLibro,
// prestarLibro(titulo), devolverLibro(titulo).
// Deja huecos para que lo desarrollen.
//


package clases;

// Clase Libro: titulo, autor, disponible.
class Libro {
    // atributos
    private String titulo;
    private String autor;
    private boolean disponible;

    // constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    // método mostrarInfo
    public void mostrarInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Disponible: " + (disponible ? "Sí" : "No"));
    }

    // Getters and setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

//_________________________//


class Biblioteca {

    // lista de libros COMPLETAR
    

    // añadirLibro COMPLETAR
    

    // prestarLibro COMPLETAR
    

    // devolverLibro COMPLETAR
    
}




// Producto: nombre, precio.
// Carrito: lista de productos, añadirProducto(), calcularTotal().
//


class Producto {

    // atributos COMPLETAR
   

    // constructor COMPLETAR
    

    // getters opcionales COMPLETAR
    
}



class Carrito {

    // lista de productos COMPLETAR
    

    // añadirProducto COMPLETAR
    

    // calcularTotal COMPLETAR
    

}




// El main está vacío para que cada alumno pruebe los ejercicios
// que quiera. Pueden crear objetos y llamar métodos.
//

public class Main {
    public static void main(String[] args) {

        // EJERCICIO 1: Coche
        // Enunciado:
        //   - Crear un coche con marca y modelo.
        //   - Llamar varias veces a acelerar() y frenar().
        //   - Mostrar los datos finales del coche.

        // EJERCICIO 2: Alumno y notas
        // Enunciado:
        //   - Crear un alumno con su nombre.
        //   - Añadir varias notas con añadirNota().
        //   - Mostrar la información completa.
        //   - Calcular y mostrar la media.

        // EJERCICIO 3: Cuenta Bancaria
        // Enunciado:
        //   - Crear una cuenta bancaria con titular y saldo inicial.
        //   - Ingresar una cantidad.
        //   - Retirar otra cantidad.
        //   - Intentar retirar más de lo disponible (debe impedirse).
        //   - Mostrar el saldo final.

        // EJERCICIO 4: Biblioteca y Libros
        // Enunciado:
        //   - Crear varios libros.
        //   - Añadirlos a una biblioteca.
        //   - Prestar un libro por título.
        //   - Devolver un libro.
        //   - Mostrar si realmente cambia su disponibilidad.
  
        // EJERCICIO 5: Producto y Carrito
        // Enunciado:
        //   - Crear 3 productos con nombre y precio.
        //   - Añadirlos al carrito.
        //   - Calcular el total del carrito.

    }
}

