package com.example.globalExceptionHandlersks.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pvt_car")
@Entity
public class PvtCarMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int makeID;
    private String makeName;
    private int modelID;
    private String modelName;
    private String variance;
    private int wheels;
    private String operatedBy;
    private int cc;
    private int seatingCapacity;
    private int carryingCapacity;
    private int vehTypeID;
    private String vehTypeName;
}
