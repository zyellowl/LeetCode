package A每日一练.T20210730.q347_前K个高频元素;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 利用大根堆（PriorityQueue）实现 o(n*log(k))
 */
class Solution {
    public static void main(String[] args) {
        int[] a={1,1,2,3,4,4,4,4,4,1,2,4,4,4,2,6,6,6,6};
        System.out.println(new Solution().topKFrequent2(a, 10));
    }

    public List<Integer> topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(count::get));

        for (int n : count.keySet()) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        LinkedList<Integer> topK = new LinkedList<>();
        while (!heap.isEmpty()) {
            topK.addFirst(heap.poll());
        }
        return topK;
    }


    public List<Integer> topKFrequent1(int[] nums, int k){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> queue=new PriorityQueue<>(Comparator.comparing(map::get));

        for (int n:map.keySet()){
            queue.add(n);
            if(n>k){
                queue.poll();
            }
        }
        LinkedList linkedList=new LinkedList();
        while (!queue.isEmpty()){
            linkedList.addFirst(queue.poll());
        }
        return linkedList;
    }

    public List<Integer> topKFrequent2(int[] nums, int k){
        PriorityQueue<Integer> queue=new PriorityQueue<>();

        for (int i : nums) {
            queue.add(i);
            if(queue.size()>k){
                queue.poll();
            }
        }
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        return null;
    }
}
