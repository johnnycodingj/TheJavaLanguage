public class MainMethod {
    public static void main(String[] args) {
        
    }
}
/*this is called a main method within the java langauge
 * main method is entry point of the program.
 * Its job is to be the starting place where the program begins execution.
 * it is located in the code/instruction segement in a process's address space
 */

 // the key word public used in the main method is used to make this 
 //method accessable to other code outside of the class it was declared in.
 // the reason the main method needs to be public is so that the jvm can
 // access the main method (entry point) once the program starts

 //the purpose of the static key word in java is so that the jvm doesnt have to create 
 //an instance of the main method  to run it. without it the jvm would 
 //need to create an object to run it which the jvm cant do

 // the key word void just tells the compiler that that there is no return on the method

 // the args perrameter holds an array of command line arguments that could be present while the code executes