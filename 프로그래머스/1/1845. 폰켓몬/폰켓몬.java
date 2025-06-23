import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int my_po = (nums.length)/2;
        ArrayList<Integer> po_list = new ArrayList<>();
        
        for (int i=0; i<nums.length; i++){
            if(po_list.size() < my_po){
                if (!po_list.contains(nums[i])){
                po_list.add(nums[i]);
                }
            }
            
        }
        
        
        return po_list.size();
    }
}