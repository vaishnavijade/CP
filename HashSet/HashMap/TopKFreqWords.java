package HashSet.HashMap;

import java.util.*;
class TopKFreqWords {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> hm=new HashMap<>();
        for(String str:words){
            hm.put(str,hm.getOrDefault(str,0)+1);
        }
        List<String> res=new ArrayList<>();
        PriorityQueue<String> pq=new PriorityQueue<>(
            (a,b)->hm.get(a).equals(hm.get(b))?a.compareTo(b):hm.get(b)-hm.get(a)
        );
        pq.addAll(hm.keySet());
        for(int i=0;i<k;i++){
            res.add(pq.poll());
        }return res;
        
    }
}

/*Given an array of strings words and an integer k, return the k most frequent strings.

Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.

 

Example 1:

Input: words = ["i","love","leetcode","i","love","coding"], k = 2
Output: ["i","love"]
Explanation: "i" and "love" are the two most frequent words.
Note that "i" comes before "love" due to a lower alphabetical order.
Example 2:

Input: words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
Output: ["the","is","sunny","day"]
Explanation: "the", "is", "sunny" and "day" are the four most frequent words, with the number of occurrence being 4, 3, 2 and 1 respectively.
 

Constraints:

1 <= words.length <= 500
1 <= words[i].length <= 10
words[i] consists of lowercase English letters.
k is in the range [1, The number of unique words[i] */