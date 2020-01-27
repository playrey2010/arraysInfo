public class FindingItem {
    public static void main(String[] args) {

        String[] names = {"John", "Gary", "Maria", "Beth"};

        // loop through array
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Maria")) {
                System.out.println("Maria is in the array 'names'");
            }
        }
    }
}
