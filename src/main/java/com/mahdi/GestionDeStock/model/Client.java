package com.mahdi.GestionDeStock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "client")
public class Client extends AbstractEntity  {
    @Column(name = "nom")
    private String nom ;
    @Column(name = "prenom")
    private String prenom ;
    // private Adresse adresse ;
    @Column(name = "photo")
    private  String photo ;
    @Column(name = "email")
    private String email ;
    @Column(name = "numtel")
    private String numTel ;

    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClients ;

}
