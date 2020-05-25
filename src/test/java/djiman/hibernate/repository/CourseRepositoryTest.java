package djiman.hibernate.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@ComponentScan("djiman.hibernate.repository")
class CourseRepositoryTest {

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private InstructorRepository instructorRepository;

	@Test
	void getInstructorFromCourse_UnidirectionnalOneToOne() {
		assertEquals("Djiman", courseRepository.findById(1L).get().getInstructor().getFirstName());
	}

	@Test
	void getCourseFromInstructor_BidirectionnalOneToOne() {
		assertEquals("French", instructorRepository.findById(1L).get().getCourse().getTitle());
	}

}
