package pe.edu.upeu.sysalmacen.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upeu.sysalmacen.model.VentCarrito;

import java.util.List;

public interface IVentCarritoRepository extends ICrudGenericoRepository<VentCarrito, Long> {
    @Query("SELECT v FROM VentCarrito v WHERE v.dniruc = :dniruc")   //  Consulta jpql     vas a poder llamar datos de una tablas diferentes
    List<VentCarrito> listaCarritoCliente(@Param("dniruc") String dniruc);

    void deleteByDniruc(String dniruc);  //sivre para eliminar por DNI es este caso el id es dni_ruc
}
