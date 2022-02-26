import java.io.*;
import java.util.Scanner;
class LineNumber 
{
    public static void main(String[] args)throws IOException
    {
	try
	{
	    FileInputStream fil=new FileInputStream("FILE.txt");
	    int i=0,l=1;
	    while((i=fil.read())!=-1)
	    {
		if((char)i=='\n')
		{
		    System.out.print((l)+"_");
		    System.out.print((char)i);
		    l++;
		}
		System.out.print((char)i);
	    }
	    fil.close();
	}
        catch(Exception e)
        {
            System.out.println("No such file found");
            return;
        }
    }
}
