package kz.syllabus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.Text;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "discipline_info")
public class DisciplineInfo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer disciplineId;
    private Integer credits;
    private String aim;
    private String tasks;
    private String results;
    private String methodology;
    @OneToMany(targetEntity = DisciplineInfoProgram.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "disciplineInfoId", referencedColumnName = "id")
    private List<DisciplineInfoProgram> disciplineInfoProgram;
    @OneToMany(targetEntity = Instructor.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "disciplineInfoId", referencedColumnName = "id")
    private List<Instructor> instructor;
}
