package org.store.gpsmapping.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data@Table(name = "arch_1004901")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Date date;
    int id_device;
    double latitude;
    double longitude;
}
