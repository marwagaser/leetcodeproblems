class Solution {
    public boolean isValid(String s) {
       Stack <Character> stack = new Stack <> ();
        if (s.length()%2 !=0){ return false;}
for (int i=0; i<s.length();i++){

if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
stack.push(s.charAt(i));
else{
if (stack.isEmpty()) return false;
else{
char curr = stack.peek(); 
if ((curr == '(' && s.charAt(i) != ')') || (curr == '[' && s.charAt(i) != ']') || (curr == '{' && s.charAt(i) != '}')) return false;
else stack.pop();
}
}

}
        if (stack.isEmpty()) return true; return false;
 
    }
}
