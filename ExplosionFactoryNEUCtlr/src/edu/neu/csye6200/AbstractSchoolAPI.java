package edu.neu.csye6200;

/**
 * AbstractSchoolAPI
 * @author danielgmp
 *
 * 1. Derive a Person class from the AbstractPersonAPI abstract class.
 * 2. Derive a Student class from the Person class.
 * 3. Derive an Employee class from the Person class. 
 * 4. Derive a UniversityBase class from this AbstractSchoolAPI, implementing methods to:
 * 		a. hire Employee objects;
 * 		b. enroll Student objects;
 * 		c. show state (all employed Employee and enrolled Student objects)
 * 5. Derive a NortheasternU class from the UniversityBase class,
 * 	  implementing a demo method to:
 * 		a. Instantiate two Student objects derived from Person class, derived from AbstractPersonAPI.
 * 		b. Instantiate two Employee objects derived from Person class, derived from AbstractPersonAPI.
 * 		c. Instantiate a NortheasternU object.
 * 			1. Add All Student and Employee objects to NortheasternU object
 * 			2. Show the state of NortheasternU object
 * 
 * 6. 20 Points: Submit a zipped (e.g. 7-zip) Eclipse workspace with all your work;
 *		a. All source and class files (.java, .class) must be in an eclipse workspace named to identify your name, Eclipse version and programming language, for example my Eclipse Oxygen workspace containing my C++ solution would be named:
 *		workspace-o2-dan-peters-java-university
 * 		b. Paste all console output into Driver as a comment.
 * 7.  
 */
public abstract class AbstractSchoolAPI {
	/**
	 * API
	 */
	public abstract void show();
}
