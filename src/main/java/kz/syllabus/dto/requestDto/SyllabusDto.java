package kz.syllabus.dto.requestDto;


import kz.syllabus.entity.DisciplineInfo;
import kz.syllabus.entity.Postrequisite;
import kz.syllabus.entity.Prerequisite;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SyllabusDto {
    private Integer id;
    private String name;
    private String language;
    private Integer credits;
    private Integer lectureHoursPerWeek;
    private Integer practiceHoursPerWeek;
    private Integer iswHoursPerWeek;
    private List<DisciplineInfo> disciplineInfo;
    private List<Prerequisite> prerequisites;
    private List<Postrequisite> postrequisites;
}
