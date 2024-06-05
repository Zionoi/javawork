package programers;

import java.util.Arrays;

public class note {

	public static void main(String[] args) {
		/*		String my_string = "He11oWor1d";
				String overwrite_string = "lloworld";
				int s = 2;
				
						
						
						int k = 0;
						int i = 0;
										char[] cArray1 = my_string.toCharArray();
										char[] cArray2 = overwrite_string.toCharArray();
		//		System.out.println(Arrays.toString(cArray1));
				 
						
							for(i = 0; i<cArray1.length;i++)
								System.out.print(cArray1[i]);
								if(i>= s )
									cArray1[i] = cArray2[s];
								System.out.print(cArray1[s]);
								s++;
						
					String answer = my_string.substring(0,s)+overwrite_string+my_string.substring(s+overwrite_string.length());
			//	System.out.print(my_string.substring(0,(s+1))+overwrite_string);
		*/
		String str1 = "aaaaa";
		String str2 = "bbbbb";
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		
	       String answer = "";
	        for(int i =0; i<str1.length();i++){
	          answer += char1[i];
	          answer += char2[i];
	            }
	        
	        
	        
	        
	        
	        System.out.println(answer);
	    
		
		
		
	}

}
