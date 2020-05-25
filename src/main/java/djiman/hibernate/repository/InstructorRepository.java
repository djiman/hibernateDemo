package djiman.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import djiman.hibernate.mapping.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {

}
