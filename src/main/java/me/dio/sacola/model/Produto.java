package me.dio.sacola.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String nome;
}
