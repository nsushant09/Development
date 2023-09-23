package DSA.slidingwindow;

public class MaxVowelInSubstring {

    public static void main(String[] args) {
        System.out.println(maxVowels("weallloveyou", 7));
    }
    public static int maxVowels(String s, int k) {
        int maximum = 0;
        int count = 0;
        for(int i = 0; i < k; i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        if(count > maximum){
            maximum = count;
        }

        for(int i = 1; i <= s.length() - k; i++){
            if(isVowel(s.charAt(i - 1))){
                count--;
            }
            if(isVowel(s.charAt(i - 1 + k))){
                count++;
            }
            if(count > maximum){
                maximum = count;
            }
        }
        return maximum;
    }

    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
