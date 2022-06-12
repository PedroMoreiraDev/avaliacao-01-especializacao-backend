package Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class Movies {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String genre;
    private String urlStream;
}
