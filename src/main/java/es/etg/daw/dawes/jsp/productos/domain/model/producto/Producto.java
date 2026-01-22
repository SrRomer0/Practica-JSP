package es.etg.daw.dawes.jsp.productos.domain.model.producto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class Producto {
    private ProductoId id;
    private String nombre;
    private Double precio;
}
