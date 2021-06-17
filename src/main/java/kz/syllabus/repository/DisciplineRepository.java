package kz.syllabus.repository;

import kz.syllabus.dto.requestDto.SyllabusDto;
import kz.syllabus.entity.Discipline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisciplineRepository extends JpaRepository<Discipline, Integer> {


    @Query(value = "select * from disciplines \n" +
            "full join discipline_info\n" +
            "on disciplines.id = discipline_info.discipline_id\n" +
            "full join prerequisites\n" +
            "on disciplines.id = prerequisites.discipline_id\n" +
            "full join postrequisites\n" +
            "on disciplines.id = postrequisites.discipline_id\n" +
            "where disciplines.id = ?;", nativeQuery = true)
    List<Discipline> getSyllabusById(Integer id);
}
