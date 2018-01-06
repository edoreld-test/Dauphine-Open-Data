package io.github.oliviercailloux.opendata.entity;

import java.io.Serializable;
import java.util.Locale;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="Course", namespace="Course2")
@Entity
/**
 * Course object to represent a Dauphine course. 
 * @author     Zakaria BENZAIT  
 * @author     Ouafa BOUCENNA
 * @version     %I%, %G%
 * @since       1.0
 */
public class Course  implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	/**
     *  The id Course
     */
	private String idCourse;
	/**
     *  the description course
     */
	private String description;	
	/**
     * List of teachers and witch kind of course they will teach
     */
	private Set<PersonAndCourseType> teachersAndCourseType;
	/**
     * The name of the course
     */ 
	private String courseName;
	/**
     * the language of the course in witch it written 
     */
	private Locale teachingLangs ;
	/**
     * The course's credit
     */
	private int credits;
	/**
     * Le parcours 
     */
	private TypeParcours  parcours ;
	
	 /** 
	  * Course constructor without fields
     */
	public Course() {
		
		}
	/** 
	  * Course constructor with fields
	  * 
	  * @param courseName  the name of the course ( Big Data, ...)
    */
	
	public Course( String courseName) {
		this.courseName = courseName;
	}

	// put the idCourse on property of the element
	@XmlAttribute(name="idCourse")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	
	
	public String getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(String idCourse) {
		this.idCourse = idCourse;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<PersonAndCourseType>  getAuthor() {
		return teachersAndCourseType;
	}

	public void setAuthor(Set<PersonAndCourseType> teachersAndCourseType) {
		this.teachersAndCourseType =  teachersAndCourseType;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Locale getTeachingLangs() {
		return teachingLangs;
	}

	public void setTeachingLangs(Locale teachingLangs) {
		this.teachingLangs = teachingLangs;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public TypeParcours getParcours() {
		return parcours;
	}

	public void setParcours(TypeParcours parcours) {
		this.parcours = parcours;
	}

	
}