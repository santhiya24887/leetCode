class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count =0;
        String vowels = "aeiou";
        for(int i=left;i<=right;i++){
            String word = words[i];
            char first = word.charAt(0);
            char last = word.charAt(word.length()-1);
            if(vowels.indexOf(first)!=-1 && vowels.indexOf(last)!=-1){
                count++;
            }
        }

        return count;
    }
}