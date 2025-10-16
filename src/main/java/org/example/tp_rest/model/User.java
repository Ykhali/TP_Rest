package org.example.tp_rest.model;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    int id;
    String nom;
    String mail;
}
