package oops;

/*
 * Java OOPs Interview Questions -4
 */
public class Problem4 {

	public static void main(String[] args) {
		
		int x; // local variable
		//System.out.println("Output = " + x); // default value for any data type will be applicable only for instance 
		// variables not for local variables because the default value for instance variable is allocated when the object 
		// of a class is created.
	}
}


// Output : Compilation Error -> The local variable x may not have been initialized
// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
// The local variable x may not have been initialized

/*
 * Local variables are not initialized when they are created at method invocation. Therefore, a local variables must be
 * initialized explicitly before being used.
 */


