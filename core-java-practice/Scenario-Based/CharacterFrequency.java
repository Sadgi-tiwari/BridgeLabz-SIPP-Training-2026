public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "I Love Coding";

        int[] freq = new int[128];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        System.out.println("Character Frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("'" + (char) i + "' = " + freq[i]);
            }
        }
    }
}