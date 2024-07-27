// A normal method syntax
public return_type method_name(parameter_s){
    /* codes */
}

/*
 * return_type -> void, double, int, String -> which type of value we return from methods 
 * like if our method return nothing the return_type will be void
 * parameter_s -> what we want to use from outside when we call a method
*/

// example of a static method
public static void static_method(){
    /* this is a static method that has no parameter */
}

// example of a simple method with parameters and return something
public int simple_method(int a, String s){
    /* this is a simple_method with parameters a and s
     * and this method returns integer value a
     */
    return a;
}




// // normal class syntax

// import Assignment2.Rectangle;

// public class class_name{
//     /* Atributes section - can be private, public, protected */
//     private String Atribute_name; /* Example */

//     /* Constructor - can be parameterized or can be without parameter */
//     /* Constructor is a type of method that has no return type and the name of constructor is same as CLASS_NAME*/
    
//     /* Example of a constructor without parameter */
//     public class_name(){

//     }
// }







public class class_name{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4}; // size = 4

        try{
            System.out.println(arr[3]);
            System.out.println(arr[5]);
            System.out.println(arr[2]);
            System.out.println(arr[0]);
        }
        catch(Exception e){
            System.out.println("Array out of bound");
        }
    }
}
