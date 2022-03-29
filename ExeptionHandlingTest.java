
public class ExeptionHandlingTest 
{
	
}
abstract class School 
{
	abstract void admission(String location,int age)throws admissioneligibilityexception;
}
class admissioneligibilityexception extends Exception
{
	
}
class PlaySchool extends School
{
    String location;
    int age;

	void admission(String location, int age) throws admissioneligibilityexception 
	{
		
	}
}