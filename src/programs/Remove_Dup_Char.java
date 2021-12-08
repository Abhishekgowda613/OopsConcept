package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Remove_Dup_Char {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dup Char");
        String s = br.readLine();
        int l = s.length();
        char ch;
        String ans = " ";
        for(int i=0; i<1; i++)
        {
        	ch = s.charAt(i);
        	if(ch!=' ');
        	ans = ans+ch;
        	s= s.replace(ch, ch);
        	
        }
        System.out.println("World after removing duplicate char : "+ ans);
	}

}
