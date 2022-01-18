package one.digitalinnovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.*;

@Entity // Define this class as entity (persistence)
@Data // Insert getters and setters (lombok)
@Builder //Project pattern for constructors (lombok)
@AllArgsConstructor //Insert constructors (lombok)
@NoArgsConstructor //Insert constructors (lombok)
public class Phone {

    @Id // Define id as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Defines the primary key strategy
    private Long id;

    @Enumerated(EnumType.STRING) // Defines this parameter as enum that use string as value
    @Column(nullable = false) // Create a database rule. This field cannot be null
    private PhoneType type;

    @Column(nullable = false) // Create a database rule. This field cannot be null
    private String number;
}
