// Last updated: 7/7/2025, 8:25:25 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {  

         if(ransomNote.length() > magazine.length()){

           return false;

        }else{

            // we need to iterate through the magazine element and keep count of the elelments
            // using hash map

            Map<Character, Integer> magzineMap = new HashMap<>();

            // we need to traverse and insert the key
            // Already present update the counter

            for(int i = 0 ; i < magazine.length();i++){

                char ch = magazine.charAt(i);

                if(!magzineMap.containsKey(ch)){

                    magzineMap.put(ch,1);

                }else{

                    magzineMap.put(ch,magzineMap.get(ch)+1);
                }


            }


            // we need to traverse the ransom note and check
            // element is present and check the count

            for(int i= 0 ; i < ransomNote.length();i++){
                char chRan = ransomNote.charAt(i);

                if(!magzineMap.containsKey(chRan)){

                    return false;
                } if(magzineMap.containsKey(chRan) && magzineMap.get(chRan) == 0){

                    return false;
                }

                    magzineMap.put(chRan,magzineMap.get(chRan) -1);

                


            }

            return  true;






        }





    }

        
    
}