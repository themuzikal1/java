package exercise2;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 23, 3, 4, 5, 2, 1};

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        String[] greetings = new String[]{"hello", "howdy", "hallo", "hola", "bonjour", "ciao", "أهلا"};
        for (int j = 0; j < greetings.length; j++) {
            System.out.println(greetings[j]);
        }

        int[] binaries = new int[]{0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0};
        for (int k = 0; k < binaries.length; k++) {
            System.out.println(binaries[k]);
        }


    }
}
