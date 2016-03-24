import java.io.*;
//import java.lang.String.*;
import java.util.Arrays;
import java.util.*;
class m
{

ArrayList<Integer> make;
ArrayList<Integer> pathway;
ArrayList<Integer> got=new ArrayList<Integer>();
PrintWriter fout=null;

public void make() throws Exception
	{
		Scanner sn =new Scanner(System.in);	
		make=new ArrayList<Integer>();
		BufferedReader fin=null;
		
		
		
		fin =new BufferedReader(new FileReader("CreateMaze.txt"));
		String s=fin.readLine();
		while(s!=null)
		{ 
		   String[]z=s.split(" ");
		   int len=z.length;
		   s=fin.readLine();
		   for(int i=0;i<len;i++)
			{ 
			   make.add(Integer.parseInt(z[i]));   
			}
		}
		
			
		
		
		
		
		
	}
	
	
	
	
	public void travel() throws Exception
	{
		Scanner sn =new Scanner(System.in);	
		
		BufferedReader fin=null;
		
		
		fin =new BufferedReader(new FileReader("TraverseMaze.txt"));
		String s=fin.readLine();
		int size=0;
		while(s!=null)
		{ 
			pathway=new ArrayList<Integer>();
		   String[]z=s.split(" ");
		   int len=z.length;
		   s=fin.readLine();
		   for(int i=0;i<len;i++)
			{ 
			   pathway.add(Integer.parseInt(z[i]));   
			}
			
				int my=pathway.get(0);
				for(int j=1;j<pathway.size();j++)
				{
					int room=pathway.get(j);
					int place=make.get(((my-1)*5)+(room+1));
					System.out.print(j+" ");
					System.out.println(my);
					if(place>0)
					{
						my=place;
					}
				}
				got.add(my);
				

			
		}
		
		
				
				
		
		
		
		
	
		
	}
	
	public void destination() throws Exception 
	{
		fout=new PrintWriter(new FileWriter("entry.txt"));
		for(int i=0;i<got.size();i++)
		{
			System.out.println("destination "+(i+1)+":"+got.get(i));
			fout.println(got.get(i));
		}
		
		fout.close();
		
		
	}
	
	
}