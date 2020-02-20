
package com.hemosol.donantes.servicios;

import com.hemosol.donantes.entidades.Pedido;
import com.hemosol.donantes.entidades.Requisitos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequisitosUsuario extends JpaRepository<Requisitos, String>{
    
}
