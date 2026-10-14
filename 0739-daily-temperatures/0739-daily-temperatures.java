class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[]answer=new int[n];
        Stack<Integer> Stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!Stack.isEmpty() && temperatures[i]> temperatures[Stack.peek()]){
                int previousDay=Stack.pop();
                answer[previousDay]=i-previousDay;

            }
            Stack.push(i);
        }

        return answer;
     }
}