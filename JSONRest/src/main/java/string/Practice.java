package string;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a={1,2,3,4,3,3,5};
		int count;
		int[] b=new int[a.length];
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]!=a[j]){
					b[i]=a[i];
					
				}
			}
		}
		
		System.out.println(Arrays.toString(b));
	}

}
