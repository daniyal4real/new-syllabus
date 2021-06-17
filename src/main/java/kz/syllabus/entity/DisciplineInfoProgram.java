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
@Table(name = "discipline_info_program")
public class DisciplineInfoProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer instructorId;
    private Integer disciplineInfoId;
    private Integer evaluationId;
//    private String competencies;
    @OneToMany(targetEntity = ProgramInfo.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "programId", referencedColumnName = "id")
    private List<ProgramInfo> programInfo;
}
