package student.example.domain;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Entity(name="categories")
public class Category extends IDalgorithm {
    

    

    @Setter                                    
    @Getter 
    @Id                                         
    @GeneratedValue() 
    long crc32 = super.generatedCode(id);

    @Setter
    @Getter
    @Column(length=80)
    private String name;

    public Category(String name) {
        this.name = name;
    }

    

    
}
