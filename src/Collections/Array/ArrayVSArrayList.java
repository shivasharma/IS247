package Collections.Array;

import java.util.ArrayList;
import java.util.Arrays;

class ArrayVsArrayList {

  public static void main(String[] args) {
    
    //[0][1][2][3]
    
    // Create
    String[] friendsArray = {"John", "Chris", "Eric", "Luke"};
    //or
    String[] friendsArray2 = new String[4];
    
    ArrayList<String> friendsArrayList =
        new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));
    //or
    ArrayList<String> friendsArrayList2 = new ArrayList<>();
    
    //Get element
    System.out.println(friendsArray[1]);
    System.out.println(friendsArrayList.get(1));
    
    //Get size
    System.out.println(friendsArray.length);
    System.out.println(friendsArrayList.size());
    
    //Add an element
    //You can't do this with Arrays :(
    friendsArrayList.add("Mitch");
    System.out.println(friendsArrayList.get(4));

    //Set an element
    friendsArray[0] = "Carl";
    System.out.println(friendsArray[0]);
    friendsArrayList.set(0, "Carl");
    System.out.println(friendsArrayList.get(0));
    
    //Remove an element
    // Can't do this with arrays :(
    friendsArrayList.remove("Chris");
    System.out.println(friendsArrayList.get(1));

    //Print
    //Doesn't work well for Arrays! Must loop through all elements instead.
    System.out.println(friendsArray);
    System.out.println(friendsArrayList);
    
  }

}
