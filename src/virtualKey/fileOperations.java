package virtualKey;

import java.io.File;
import java.util.*;
public class fileOperations {
	
	 ArrayList <String> arrList =  new ArrayList <> ();

	public fileOperations()
	{
		File dp = new File("./");
		String cp[] = dp.list();
		for(int i=0; i<cp.length; i++) {
			arrList.add(cp[i]);
		}
	}

	Scanner sc  =  new Scanner(System.in);
	public  void create() 
	{
		
		System.out.println("\n");
		System.out.println("|=====================================================|");
		System.out.println("|   PLEASE ENTER THE NAME OF FILE YOU WANT TO CREATE  |");
		System.out.println("|=====================================================|");
		System.out.println("\n");
		String s  = sc.next();
		File f  =  new File(s);
		try 
		{
			if(f.createNewFile()) 
			{
				arrList.add(f.getName());
				System.out.println("| FILE CREATED | ----> " + f.getName());
			}
			else 
			{
				System.out.println("\n");
				System.out.println("!!!!           WARNING          !!!");
				System.out.println("FILE ALREADY EXIST IN THE DIRECTORY");
				System.out.println("|         PLEASE TRY AGAIN        |");
				System.out.println("\n");
			}
		}
		catch(Exception e) 
		{
			System.out.println("   !!ERROR!!  "+e);
		}
	}
	  void fileDisplay() 
	{
		  for(int i=0;i<arrList.size();i++) 
		  {
			  for(int j=0;j<arrList.size()-1;j++) 
			  {
				  
				  if(arrList.get(j).compareTo(arrList.get(j+1))>0) 
				  {
					  String temp = arrList.get(j);
					  arrList.set(j,arrList.get(j+1));
					  arrList.set(j+1, temp);
					  
				  }
			  }
		  }
		System.out.println(arrList);
	}
	  ArrayList<String> search()
	  {
		  System.out.println("\n");
		  System.out.println("|=====================================================|");
		  System.out.println("|PLEASE ENTER THE NAME OF THE FILE YOU WANT TO SEARCH |");
		  System.out.println("|=====================================================|");
		  System.out.println("\n");
		  String sea = sc.next();
		  ArrayList<String > a =  new ArrayList<>();
		  int c=0;
		  int index=0;
		  for(int i=0;i<arrList.size();i++) 
		  {
			  if(arrList.get(i).equalsIgnoreCase(sea)) 
			  {
				  a.add(arrList.get(i));
				  c++;
				  index=i;
				  
			  }
			 
		  }
		  return a;

		  
	  }
	  void fileDelete() 
	  {
		  System.out.println("\n");
		  System.out.println("|=====================================================|");
		  System.out.println("|PLEASE ENTER THE NAME OF THE FILE YOU WANT TO DELETE |");
		  System.out.println("|=====================================================|");
		  System.out.println("\n");
		  String s  =sc.next();
		
		 
		  File f2  =  new File("./" + s);
		  
		  
			 if (f2.delete()) {
				 System.out.println("\n");
				 System.out.println("| FILE HAS BEEN DELETED |");
				 for (String K: arrList
					  ) {
					 if(K.equalsIgnoreCase(s))
					 {
						 arrList.remove(K);
						 return;

					 }
				 }


			    } else {
			    	
			    	System.out.println("\n");
					System.out.println("!!!!           WARNING          !!!");
					System.out.println("|        File CAN'T BE FOUND      |");
					System.out.println("|         PLEASE TRY AGAIN        |");
					System.out.println("\n");
			    } 
	  }
	
   void end() 
   {
	    System.out.println("|================================================|");
		System.out.println("|                                                |");
		System.out.println("|                   THANK YOU                    |");
		System.out.println("|                  SEE YOU SOON                  |");
		System.out.println("|                HAVE A NICE DAY :)              |");
		System.out.println("|               REGARDS LOCKEDME.COM             |");
		System.out.println("|                                                |");
		System.out.println("|================================================|");
		System.out.println("\n\n");
		System.exit(0);
   }


}