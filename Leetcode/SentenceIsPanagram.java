package Leetcode;

public class SentenceIsPanagram {
    public boolean checkIfPangram(String sentence) {
        boolean[] letters  = new boolean[26];
        
        for(char c : sentence.toCharArray()) {
            letters[c - 'a'] = true;
        }
        
        //find any letter that not exist
        for(boolean existLetter : letters) {
            if(!existLetter) return false;
        }
        
        return true;
        
    }
}
//  if(sentence.length()<26 || sentence == null)
//             return false;
        
//         for(char i=97;i<=122;i++){
//             if(!sentence.contains(String.valueOf(i)))
//                 return false;
//         }
//         return true;
