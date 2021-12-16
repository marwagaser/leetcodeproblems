
public class medianTwoSorted{
public static double  mergeArray(int []  a, int [] b){

int pointerA =0;
int pointerB =0;
int k =0;
int [] mergedArray = new int [a.length+b.length];
while (pointerA<a.length && pointerB<b.length){
if (a[pointerA] < b[pointerB]){
mergedArray [k] = a[pointerA];
pointerA+=1;

}
else{

mergedArray [k] = b[pointerB];
pointerB+=1;
}
k+=1;
}

while (pointerA<a.length){

mergedArray [k] = a[pointerA];
pointerA+=1;
k+=1;

}
while (pointerB < b.length){
mergedArray [k] = b[pointerB];
pointerB+=1;
k+=1;
}
if (mergedArray.length==1)
return mergedArray[0];

else if (mergedArray.length%2 ==0)
return ((mergedArray[mergedArray.length/2]+mergedArray[((mergedArray.length/2)-1)])/2.0);

else
return mergedArray[mergedArray.length/2];

}


public static void print(int [] p){
	for (int i=0;i<p.length;i++){
		System.out.print(p[i]+ " ");
	}
}
	public static void main (String [] args){

 double p = mergeArray(new int [] {0,0}, new int [] {0,0});
//print(p);
System.out.println(p);
}

}
