package com.example.venta.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class VentaDetalle {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer vDetalleId;
   private Double vDetalleCantidad;
   private Double vDetallePrecio;
   private Integer productoId;

   public VentaDetalle() {

      this.vDetalleCantidad = (double) 0;
      this.vDetallePrecio = (double) 0;
   }
}