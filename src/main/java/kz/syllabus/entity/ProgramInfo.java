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
@Table(name = "program_info")
public class ProgramInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer programId;
    private String lectureTheme;
    private String practiceTheme;
    private String iswTheme;
    private Integer week;
    @OneToMany(targetEntity = ProgramDetail.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "programInfoId", referencedColumnName = "id")
    private List<ProgramDetail> programDetail;
}
