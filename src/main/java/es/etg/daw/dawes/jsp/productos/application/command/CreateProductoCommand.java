package es.etg.daw.dawes.jsp.productos.application.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

//Esta clase tiene los datos necesarios para crear un Producto
@Getter
@AllArgsConstructor
@Accessors(fluent = true) // Así los getters no llevan prefijo get
public class CreateProductoCommand {

    private final String nombre;
    private final double precio;
}
