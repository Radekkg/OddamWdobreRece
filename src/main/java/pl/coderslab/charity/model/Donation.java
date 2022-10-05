package pl.coderslab.charity.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "donations")
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //TODO di srawdzenia validacja min max
    //@Min()
    private Integer quantity;

    @ManyToMany(fetch = FetchType.LAZY)
    List<Category> categories;

    @ManyToOne(fetch = FetchType.LAZY)
    Institution institution;

    @Length(min = 9)
    private String phone;

    @Length(min = 2)
    private String street;

    @Length(min = 2)
    private String city;

    @Length(min = 2)
    private String zipCode;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate pickUpDate;

    private LocalTime pickUpTime;

    private String pickUpComment;
}
