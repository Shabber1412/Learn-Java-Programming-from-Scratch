package com.javaoops.javaclassesandobjects;
/* 
 * Java Naming Conventions
 * Java naming conventions are rules to follow when deciding what to name your identifiers, such as class, package, variable, constant, method, etc.
 * Following these conventions makes your code more readable and understandable for other developers.
 * Here are some common Java naming conventions:
 * 
 * 1. Class Names: Class names should be nouns and start with an uppercase letter. If the class name consists of multiple words, use camel case (e.g., MyClass, EmployeeDetails).
 * 2. Package Names: Package names should be in all lowercase letters and typically follow the reverse domain name convention (e.g., com.example.project).
 * 3. Variable Names: Variable names should start with a lowercase letter and use camel case for multiple words (e.g., myVariable, employeeName).
 * 4. Constant Names: Constant names should be in all uppercase letters with words separated by underscores (e.g., MAX_VALUE, DEFAULT_TIMEOUT).
 * 5. Method Names: Method names should start with a lowercase letter and use camel case for multiple words (e.g., calculateTotal, getEmployeeName).
 * 6. Interface Names: Interface names should be nouns or adjectives and start with an uppercase letter (e.g., Runnable, Comparable).
 * 7. Enum Names: Enum names should be in all uppercase letters with words separated by underscores (e.g., DAYS_OF_WEEK, COLORS).   
 * 8. Type Parameter Names: Type parameter names should be a single uppercase letter (e.g., T for type, E for element).
 * By following these naming conventions, you can create code that is easier to read and maintain.
 * For more detailed information, you can refer to the official Java documentation on naming conventions: https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html
 * 
 */


//1. Class Names: Class names should be nouns and start with an uppercase letter. If the class name consists of multiple words, use camel case (e.g., MyClass, EmployeeDetails).
public class JavaNamingConventions {
    /*
    public class Employee{
    }
     */

}

/* 2. Interface: 
It should start with the uppercase letter.
It should be an adjective such as Runnable, Remote, ActionListener.
Use appropriate words, instead of acronyms.
*/
interface Printable
{
//code snippet
}


/* 3. Method:
It should start with lowercase letter.
It should be a verb such as main(), print(), println().
If the name contains multiple words, start it with a lowercase letter followed by an uppercase letter such as actionPerformed().
 */
class Employee
{
// method
void draw()
{
//code snippet
}
}

/* 4. Variable:
It should start with a lowercase letter such as id, name.
It should not start with the special characters like & (ampersand), $ (dollar), _ (underscore).
If the name contains multiple words, start it with the lowercase letter followed by an uppercase letter such as firstName, lastName.
Avoid using one-character variables such as x, y, z.
*/
class Employee1
{
// variable
int id;
//code snippet
}

/* 5. Package:
 * It should be a lowercase letter such as java, lang.
 * If the name contains multiple words, it should be separated by dots (.) such as java.util, java.lang.
 */

//package
/* package com.javatpoint;
class Employee
{
//code snippet
}
*/



/* 6. Constant
It should be in uppercase letters such as RED, YELLOW.
If the name contains multiple words, it should be separated by an underscore(_) such as MAX_PRIORITY.
It may contain digits but not as the first letter. */
class Employee2
{
//constant
static final int MIN_AGE = 18;
//code snippet
}