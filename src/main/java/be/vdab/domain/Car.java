package be.vdab.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by jeansmits on 06/07/15.
 */
@Entity
public class Car {
    @Id
    @GeneratedValue
    private Integer id;

    private String color;
    private String brand;
    private String type;
}
