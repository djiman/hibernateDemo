package djiman.hibernate.mapping;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "course_instructor")
public class CourseInstructor {

	@EmbeddedId
	private CourseInstructorPk courseInstructorPk;

	public CourseInstructor() {

	}

	public CourseInstructorPk getCourseInstructorPk() {
		return courseInstructorPk;
	}

	public void setCourseInstructorPk(CourseInstructorPk courseInstructorPk) {
		this.courseInstructorPk = courseInstructorPk;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseInstructorPk == null) ? 0 : courseInstructorPk.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseInstructor other = (CourseInstructor) obj;
		if (courseInstructorPk == null) {
			if (other.courseInstructorPk != null)
				return false;
		} else if (!courseInstructorPk.equals(other.courseInstructorPk))
			return false;
		return true;
	}

}
