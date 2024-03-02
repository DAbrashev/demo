package entities;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class BasedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
