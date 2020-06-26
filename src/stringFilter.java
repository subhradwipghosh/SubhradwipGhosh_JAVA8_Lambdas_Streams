import java.util.*;
import java.util.stream.Collectors;
public class stringFilter {

public static List<String> Result(List<String> list1) {
List<String> res = list1.stream().filter(String->(String.length() == 3) && String.charAt(0) == 'a')
.collect(Collectors.toList());
return res;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter no of strings to be inserted");
int noOfStrings = sc.nextInt();
List<String> list1 = new ArrayList<String>();
System.out.println("Enter the strings:");
sc.nextLine();
for(int i = 0;i < noOfStrings;i++){
String s = sc.nextLine();
list1.add(s);
}
System.out.println("The strings starting with letter 'a' and having length 3 are ");
List<String> res = Result(list1);
res.forEach(t->System.out.println(t));
sc.close();
}
}