package virtualKey;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class menu {

	void welcomeScreen() 
	{
		System.out.println();
		System.out.println("|===============================================|");
		System.out.println("|                                               |");
		System.out.println("|         DEVELOPED BY SAKSHAM TIWARI           |");
		System.out.println("|                                               |");
		System.out.println("|===============================================|");
		System.out.println("|                                               |");
		System.out.println("|               LOCKEDME.COM                    |");
		System.out.println("|                                               |");
		System.out.println("|===============================================|");
		System.out.println("|                                               |");
		System.out.println("|  PATH OF THE GENERATED FILES " + main.p +"    |");
		System.out.println("|                                               |");
		System.out.println("|===============================================|");
		System.out.println("\n\n");
		
	}
	
	void mainmenu() 
	{
		fileOperations fo = new fileOperations();
		Scanner sc = new Scanner(System.in);
		
		while(true) 
		{
			System.out.println("|==============================================================|");
			System.out.println("|                                                              |");
			System.out.println("|                   WELCOME TO THE MENU                        |");
			System.out.println("| PLEASE ENTER YOU CHOICE FROM THE FOLLOWING OPTIONS AVAILABLE |");
			System.out.println("|                                                              |");
			System.out.println("|==============================================================|");
			System.out.println("|                                                              |");
			System.out.println("|       ENTER 1: TO CREATE THE FILE                            |");
			System.out.println("|                                                              |");
			System.out.println("|       ENTER 2: TO DISPLAY ALL THE FILES                      |");
			System.out.println("|                                                              |");
			System.out.println("|       ENTER 3: TO SEARCH THE FILE                            |");
			System.out.println("|                                                              |");
			System.out.println("|       ENTER 4: TO DELETE THE FILE                            |");
			System.out.println("|                                                              |");
			System.out.println("|       ENTER 5: TO EXIT                                       |");
			System.out.println("|                                                              |");
			System.out.println("|==============================================================|");
			int n  = sc.nextInt();
			switch(n) 
			{
			case 1:
				  fo.create();
				  break;
			case 2:
				fo.fileDisplay();
				break;
			case 3:
				ArrayList <String> arr = fo.search();
				if(arr.size()>0)
				{

					System.out.println("!!!!      WARNING     !!!");
					System.out.println("FILE ALREADY EXIST IN THE DIRECTORY");

				}
				else
				{
					System.out.println("!!!!      WARNING     !!!");
					System.out.println("|   FILE CAN'T BE FOUND   |");
				}
				break;
			case 4:
				fo.fileDelete();
				break;
			case 5:
				
				fo.end();
				break;
				
			}
			
			
		}

	
	}

	
}