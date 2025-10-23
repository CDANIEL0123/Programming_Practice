import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack_test = new Stack<>();
        
        for(int i =0; i<s.length(); i++){
            char a = s.charAt(i);
            
            if(!stack_test.isEmpty() && stack_test.peek() == a){
                stack_test.pop();
            } else{
                stack_test.push(a);
            }
            
        }
        
        if (stack_test.isEmpty()){
            return 1;
        } else{
            return 0;
        }
    }
}