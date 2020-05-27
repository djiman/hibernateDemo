package djiman.hibernate.mapping;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "title")
	private String title;

	@OneToMany
	@JoinColumn(name = "course_id")
	private Set<CourseInstructor> courseInstructor = new HashSet<CourseInstructor>();

	// Constructeur par defaut, obligatoire pour hibernate
	public Course() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<CourseInstructor> getCourseInstructor() {
		return courseInstructor;
	}

	public void setCourseInstructor(Set<CourseInstructor> courseInstructor) {
		this.courseInstructor = courseInstructor;
	}

}
