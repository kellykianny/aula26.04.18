package br.edu.unievangelica.domain.category;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter //Gera todos os GET's
@Setter //Gera todos os SET's
@Entity
@Table(name = "category") //para adicionar nome da tabela diferente da classe
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_id_seq")
    @SequenceGenerator(name = "category_id_seq", sequenceName = "category_id_seq", allocationSize = 1)
    @Column(name = "id")
    private long id;

    @NotNull //validar campos NULL
    @NotEmpty //validar strings vazias
    @Size(max = 50) //pode adicionar max e min exem: (max = 50, min = 10)
    private String nome;
}
