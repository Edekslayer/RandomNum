import java.util.Collections;
import java.util.LinkedList;

public class RandomString
{
    public static void main(String[] args) {
      LinkedList<String> nums = new LinkedList<String>();
      nums.add("hey");
      nums.add("its");
      nums.add("your");
      nums.add("boi");
      nums.add("hi");
      nums.add("how");
      nums.add("are");
      nums.add("you");
      
      Collections.shuffle(nums); System.out.println(nums.get(1));
    }
}