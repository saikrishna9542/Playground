import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String st;
		Scanner obj= new Scanner(System.in);
		st= obj.next();
		char ch[]= st.toCharArray();
		Arrays.sort(ch);
		int count=1;
	    for(int i=0;i<ch.length;  )
	    {
	        count=1;
	        for(int j=i+1;j<ch.length;j++)
	        {
	            if(ch[i]== ch[j])
	            count++;
	            else 
	            break;
	        }
	        System.out.printf("%c%d\n",ch[i],count);
	        i=i+count;
	    }
		
	}
}