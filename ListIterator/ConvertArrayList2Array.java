//Convert ArrayList To Array
package ListIterator;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayList2Array {
    public static void main(String[] args) {
        //1> Implement ArrayList
        List<String>l = new ArrayList<>();
        l.add("OM");
        l.add("NAMAH");
        l.add("SHIVAAY");
        l.add("OM");
        l.add("NAMO");
        l.add("PARVATI");
        l.add("PATE");
        l.add("HAR");
        l.add("HAR");
        l.add("MAHADEV");
        l.add("RADHA");
        l.add("RANI");
        l.add("KI");
        l.add("JAI");

        //2>Print ArrayList
        System.out.println("Printing an ArrayList "+l);

        //3> Convert Arraylist to an array...
        System.out.println("Convert Arraylist to an array...");
          //USING toArray()
        String[]arr = l.toArray(new String[40]);
        for (String i:arr){
            System.out.print(i+ " ");
        }
    }
}
//NOTE:--

//1>IF WE PUT ARRAY SIZE EQUIVALENT TO THE SIZE OF ARRAYLIST THEN IT PRINTS(DATA) AS IT IS
//2>IF WE PASS AN ARRAY OF SIZE GREATER THAN THE SIZE OF AERRAYLIST THEN
            //....THE ELEMNTS OF THE ARRAYLIST COPIED TO THE RESPECTIVE ARRAYS
            //......  REMAINING PART GOES AS NULL---->NOT A GOOD CONVENTION
            //NOT RECOMMENDED...
//3>IF WE PUT ARRAY SIZE LESS THAN THE SIZE OF THE ARRAYLIST IT WILL WORK FINE...