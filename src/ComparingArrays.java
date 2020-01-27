public class ComparingArrays {
    public static void main(String[] args) {

        int[] numbers1 = {2,3,6,8,10};
        int[] numbers2 = {3,5,7,8,11};



        // using a nested for loop +
        for (int i = 0; i < numbers1.length; i++) {

            for (int j = 0; j < numbers2.length; j++) {
                if (numbers1[i] == numbers2[j]) {
                    System.out.println("Both arrays have the number " + numbers1[i]);
                }
            }
        }

    }
}
