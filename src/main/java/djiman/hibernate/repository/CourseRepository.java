package djiman.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import djiman.hibernate.mapping.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
