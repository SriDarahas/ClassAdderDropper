public class Student {
	//declaring private variables
	private int id;
	private String major;
	private Course course;
	
	public Student()//default constructor
	{
		id = 0;
		major = "?";
		course = new Course();
	}
	public Student(int id, String major, Course course) //overloaded constructor
	{
		this.id = id;
		this.major = major;
		this.course = course;
	}
	//accessor methods
	public int getId()//returns id
	{
		return id;
	}
	public String getMajor()//returns major
	{
		return major;
	}
	public Course getCourse()//returns the course object
	{
		return course;
	}
	public void setId(int someId)//changes id to someId
	{
		id = someId;
	}
	public void setMajor(String someMajor)//changes major to someMajor
	{
		major = someMajor;
	}
	public void setCourse(int courseId,String instructor,String subject) //changes variables in course to variables provided
	{
		course.setCourseId(courseId);
		course.setInstructor(instructor);
		course.setSubject(subject);
	}
	public String toString()//returns the information in string format
	{
		String toString = "\nStudent information:\nStudent Id:\t"+id+"\nMajor:\t\t"+major+"\n"+course.toString();
		return toString;
	}
}
