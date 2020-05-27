package djiman.hibernate.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import djiman.hibernate.AppMain;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { AppMain.class })
@ActiveProfiles("test")
@Transactional
class CourseRepositoryTest {

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private InstructorRepository instructorRepository;

	@Test
	void getInstructorFromCourse_UnidirectionnalOneToMany() {
		assertEquals(2, courseRepository.findById(1L).get().getCourseInstructor().size());
		assertEquals(1, courseRepository.findById(2L).get().getCourseInstructor().size());
	}

//	@Test
//	void getCourseFromInstructor_BidirectionnalOneToOne() {
//		assertEquals("English", instructorRepository.findById(1L).get().getCourse().getTitle());
//	}

}
