import java.util.*;
public class checkParanthesis{

    public static boolean isProper(String s){
    
    Stack  <Character> para_stack= new Stack <> ();
    if (s.length() % 2 != 0)
    return false;
    else if (s.length()==0)
    return true;
    else {
    if (s.charAt(0)=='{' |s.charAt(0)=='('|s.charAt(0)=='[')
    para_stack.push(s.charAt(0));
    else 
    return false;
    for (int i =1; i<s.length();i++){
    if (s.charAt(i)=='}'){
    if (!para_stack.isEmpty() && para_stack.peek()=='{') para_stack.pop();
    else return false;
    }
    else if (s.charAt(i)==']'){
    if (!para_stack.isEmpty() && para_stack.peek()=='[') para_stack.pop();
    else return false;
    }
    else if (s.charAt(i)==')'){
    if (!para_stack.isEmpty() && para_stack.peek()=='(') para_stack.pop();
    else  return false;
    
    }
    else para_stack.push (s.charAt(i));
    
    }
   
    
    }
    if (para_stack.isEmpty())
    return true;
    else 
    return false;
    
    }
    public static void main (String [] args){

        System.out.println(isProper("[{()}]"));
    }
}
    
    