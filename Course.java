public class Course {
	//declaring private variables
	private int courseId;
	private String instructor;
	private String subject;
	
	//default constructor
	public Course()
	{
		courseId = 0;
		instructor ="?";
		subject = "?";
	}
	//overloaded constructor
	public Course(int courseId, String instructor,String subject)
	{
		this.courseId = courseId;
		this.instructor = instructor;
		this.subject = subject;
	}
	//accessor methods
	public int getCourseId() //returns course id
	{
		return courseId;
	}
	public String getInstructor() //returns instructor name
	{
		return instructor;
	}
	public String getSubject() //returns subject name
	{
		return subject;
	}
	//mutator methods
	public void setCourseId(int someCourseId)//changes courseid to somecourseid
	{
		courseId = someCourseId;
	}
	public void setInstructor(String someInstructor)//changes instructor to someinstructor
	{
		instructor = someInstructor;
	}
	public void setSubject(String someSubject)//changes subject to somesubject
	{
		subject = someSubject;
	}
	public String toString() //returns a string with all the information
	{
		String toString = "\nCourse information:\nCourse ID:\t"+courseId+"\nInstructor:\t"+instructor+"\nSubject:\t"+subject+"\n";
		return toString;
	}
}
