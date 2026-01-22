package es.etg.daw.dawes.jsp.productos.domain.repository;

import es.etg.daw.dawes.jsp.common.domain.repository.CRUDRepository;
import es.etg.daw.dawes.jsp.productos.domain.model.producto.Producto;
import es.etg.daw.dawes.jsp.productos.domain.model.producto.ProductoId;

public interface  ProductoRepository extends CRUDRepository<Producto, ProductoId>{
    
}
