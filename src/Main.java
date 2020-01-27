public class Main {
    public static void main(String[] args) {
         /* An array is a container object that holds a fixed number of values of a single type.
         - only one data type per array
         - You must determine length at initialization
         - length = amount of items in array
         */

         /* HOW TO DECLARE AN ARRAY
         - dataType arrayName = new dataType[#]        */
         String[] colors = new String[3];

        /* Method 2
        - dataType arrayName = new dataType[]{value1, value2, value3}         */
        String[] colors2 = new String[]{"orange", "green", "purple"};

         /* Method 3
        - dataType arrayName = {value1, value2, value3};       */
        String[] colors3 = {"red", "blue", "yellow"};

        // Adding values individually
        colors[0] = "pink";
        colors[1] = "brown";
        colors[2] = "gray";

        // Getting the length of the array
        int arrayLength = colors.length;
        System.out.println("The length of the array is " + arrayLength);

        // Printing the array
        for (int index = 0; index < colors.length; index++) {
            System.out.println(colors[index]);
        }

        // Printing the array with an enhanced for loop (a key)
//        for (String s:colors3) {
//            System.out.println(s);
//        }

        // Printing the array with an enhanced for loop (a key)
//        for (String s:colors3) {
//            colors3[s] = "red";
//        }


    }
}
