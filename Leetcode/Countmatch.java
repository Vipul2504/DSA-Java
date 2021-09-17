package Leetcode;

public class Countmatch {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
         int k=0;
         if(ruleKey.equals("color")){
             k=1;
         }
         else if(ruleKey.equals("name")){
             k=2;
         }
         for(List b: items){
             if(b.get(k).equals(ruleValue)){
                 count++;
             }
         }
         return count;
     }
}
