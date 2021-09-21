package Leetcode;

public class GreatestCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> newList = new ArrayList<>();
        int max =0;
        for(int i :candies){
            if(i>max){
                max = i;
            }
        }
        for(int i = 0;i <candies.length; i++){
             if(candies[i] + extraCandies >= max){
                 newList.add(true);
             }
                else newList.add(false);
        }
            return newList;
    }
}
