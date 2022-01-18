package one.digitalinnovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity // Define this class as entity (persistence)
@Data // Insert getters and setters (lombok)
@Builder //Project pattern for constructors (lombok)
@AllArgsConstructor //Insert constructors (lombok)
@NoArgsConstructor //Insert constructors (lombok)
public class Person {
    @Id // Define id as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Defines the primary key strategy
    private Long id;

    @Column(nullable = false) // Creates a database rule. This field cannot be null
    private String firstName;

    @Column(nullable = false) // Creates a database rule. This field cannot be null
    private String lastName;

    @Column(nullable = false, unique = true) // Creates a database rule. This field is unique and cannot be null
    private String cpf;

    private LocalDate birthDate;

    @OneToMany(fetch = FetchType.LAZY, // Creates a database relationship one to many, strategy to get data as LAZY
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Phone> phones;
}
