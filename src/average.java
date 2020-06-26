import java.util.*; 
import java.util.stream.IntStream; 
  
class average { 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        // creating a stream 
        IntStream stream = IntStream.of(2, 3, 4, 5, 6, 7, 8); 
  
        // OptionalDouble is a container object 
        // which may or may not contain a 
        // doouble value. 
        OptionalDouble obj = stream.average(); 
  
        // If a value is present, isPresent() will 
        // return true and getAsDouble() will 
        // return the value 
        if (obj.isPresent()) { 
            System.out.println(obj.getAsDouble()); 
        } 
        else { 
            System.out.println("-1"); 
        } 
    } 
}