import java.io.*;
public class TextFile 
{
    public static void main(String args[])throws IOException
    {
	try
	{
	    FileInputStream fil=new FileInputStream("FILE.txt");
	    int i,c=-1,l=0,w=0;
	    while((i=fil.read())!=-1)
	    {
		c++;
		if(i=='\n')
		{
		    l++;
		}
		if(i==' '||i=='\n')
		{
		    w++;
		}
	    }
	    System.out.println("Number of characters: "+c);
	    System.out.println("Number of lines: "+l);
	    System.out.println("Number of words: "+w);
	    fil.close();
	}
	catch(Exception e)
        {
            System.out.println("No such file found");
            return;
        }
    }
}
