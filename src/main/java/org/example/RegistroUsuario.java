package org.example;

public class RegistroUsuario {

    // Método principal de registro que valida los datos
    public void registrar(String nombre, int edad) throws IllegalArgumentException {
        validarNombre(nombre);
        validarEdad(edad);
        System.out.println("  Usuario registrado: " + nombre + ", " + edad + " años...");
    }

    // Validación de nombre: no debe ser nulo ni vacío
    private void validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("  Nombre no puede estar vacío...");
        }
    }

    // Validación de edad: debe ser un número positivo
    private void validarEdad(int edad) {
        if (edad <= 0) {
            throw new IllegalArgumentException("  La edad debe ser mayor que cero...");
        }
    }
}
public class Aplicacion {

    public static void main(String[] args) {
        ejecutarRegistroDeUsuarios();
    }

    private static void ejecutarRegistroDeUsuarios() {
        RegistroUsuario registro = new RegistroUsuario();

        try {
            registro.registrar("Ana", 25); // caso válido
            registro.registrar("", 30);    // error: nombre vacío
        } catch (IllegalArgumentException e) {
            System.out.println("Error al registrar usuario: " + e.getMessage());
        }
    }
}