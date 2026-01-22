package es.etg.daw.dawes.jsp.productos.application.usecase;

import org.springframework.stereotype.Service;

import es.etg.daw.dawes.jsp.productos.application.command.CreateProductoCommand;
import es.etg.daw.dawes.jsp.productos.domain.model.producto.Producto;
import es.etg.daw.dawes.jsp.productos.domain.repository.ProductoRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CreateProductoUseCase {

    // Atributos
    private final ProductoRepository productoRepository;

    public Producto create(CreateProductoCommand comando) {

        Producto producto = Producto.builder() // Se puede usar comando.id() y no getId() por usar @Accessors(fluent = true) en la clase CreateProductoCommand
                .nombre(comando.nombre())
                .precio(comando.precio()).build();

        return productoRepository.save(producto);
        
    }
}
