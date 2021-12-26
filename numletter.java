// list length should be product of length of each 
import java.util.HashMap;
import java.util.*;
public class numletter{

public static HashMap <Integer , String []> populateNumber (){

HashMap <Integer , String [] > numberAlpha = new HashMap <Integer, String [] >();
for (int i = 2; i<=9;i++){
switch (i){
case 2: numberAlpha.put(i, new String [] {"a","b","c"});break;
case 3: numberAlpha.put(i ,new String [] {"d","e","f"}); break;
case 4: numberAlpha.put(i, new String [] {"g","h","i"});break;
case 5: numberAlpha.put(i, new String [] {"j","k","l"});break;
case 6: numberAlpha.put(i, new String [] {"m","n","o"});break;
case 7: numberAlpha.put(i, new String [] {"p","q","r","s"});break;
case 8: numberAlpha.put(i, new String [] {"t","u","v"});break;
case 9: numberAlpha.put(i, new String [] {"w","x","y","z"});break;
}

}
return numberAlpha;

}
public static List<String> getCombinations(String theNum){
HashMap <Integer , String [] > hm = populateNumber();
int size = 1;
for (int i =0; i<theNum.length();i++)
size *= hm.get(Integer.parseInt(""+theNum.charAt(i))).length;
List <String> res = new ArrayList <> ();
int pointer=0;
String temp = "";

if (size <2){
    return res;
}
while (pointer<size)
{
    
for (int i=0;i<theNum.length();i++)
{
int randomIndex = (int) (Math.random() *((hm.get(Integer.parseInt(""+theNum.charAt(i))).length -1 )+1));
temp += hm.get(Integer.parseInt(""+theNum.charAt(i)))[randomIndex];
}
if (!res.contains(temp)){
res.add(temp);
pointer+=1;
}
temp = "";

}
return res;



}


public static void main (String [] args){
 System.out.println( getCombinations("2"));
}

}
