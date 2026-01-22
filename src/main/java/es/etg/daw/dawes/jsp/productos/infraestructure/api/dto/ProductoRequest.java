package es.etg.daw.dawes.jsp.productos.infraestructure.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Datos devueltos por el servicio
 */
@Data
@AllArgsConstructor
public class ProductoRequest {

    private String nombre;
    private Double precio;
    private int categoriaId;
}
