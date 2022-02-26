import java.util.*;
import java.io.*;
class writerclass
{
    public static void main(String args[]) throws Exception
    {
        try
	{
    	    Scanner sc = new Scanner(System.in);
    	    FileWriter fw = new FileWriter("FILE.txt");
    	    String name = sc.nextLine();
    	    String address = sc.nextLine();
	    fw.write(name+"\n");
	    fw.write(address);
 	    fw.close();
	    FileReader fr=new FileReader("FILE.txt");
    	    int ch;
    	    while((ch=fr.read())!=-1)
            {
        	System.out.println((char)ch);
            }
    	    fr.close();
    	}
    	catch(Exception e)
	{
	    System.out.println(e);
	}
    }
}
