package kz.syllabus.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "instructors")
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer userId;
    private Integer disciplineInfoId;
    @OneToMany(targetEntity = DisciplineInfoProgram.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "instructorId", referencedColumnName = "id")
    private List<DisciplineInfoProgram> disciplineInfoProgram;
}
