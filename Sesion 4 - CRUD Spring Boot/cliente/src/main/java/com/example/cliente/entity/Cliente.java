package com.example.cliente.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Cliente {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer clienteId;
   private String clienteName;
   private String clienteApPaterno;
   private String clienteApMaterno;
   private String clienteDni;
}