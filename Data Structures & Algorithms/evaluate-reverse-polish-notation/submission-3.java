class Solution {
    public int evalRPN(String[] tokens) {
        List<String> temp = List.of("*", "+", "-", "/");
        Stack<String> st = new Stack<>();
        int ans = 0;

        if(tokens.length == 1){
            return Integer.parseInt(tokens[0]);
        }

        for(String s : tokens){
            if(!temp.contains(s)){
                st.push(s);
            } else {
                if(st.size() >=2){
                    int a = Integer.parseInt(st.pop());
                    int b = Integer.parseInt(st.pop());
                    switch(s){
                        case "*" :
                            ans = a*b;
                            break;
                        case "-" :
                            ans = b-a;
                            break;
                        case "+" :
                            ans = a+b;
                            break;
                        case "/" :
                            ans = b/a;
                            break;
                    }
                st.push(Integer.toString(ans));
                }
                    
            }
        }
        return ans;
    }
}





