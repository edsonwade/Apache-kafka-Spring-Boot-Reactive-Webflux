package code.with.vanilson.consumer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_consumers")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Consumer {
    @Id
    @GeneratedValue
    private Long id;
    private String message;


}
