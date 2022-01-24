package com.abduk.user;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @SequenceGenerator(name = "user_id",sequenceName = "user_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_id_sequence")
    private Integer id;
    private String name;
    private String email;
}
