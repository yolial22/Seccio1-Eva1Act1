import java.io.File;

import java.io.FilenameFilter;

import java.io.IOException;

import java.util.Date;
import java.util.Iterator;
import java.text.DateFormat;

import java.util.Scanner;

public class EvaAct1 implements FilenameFilter
{
	String extension;
	
	EvaAct1(String extension)
	{
        this.extension = extension;
    }
	
	public static void getInformacio(String directori,String ficher) 
	{
		File directori1 = new File(directori);
		
		File ficher1 = new File(ficher);
		
		//Indica el nom del directori i el nom del ficher.
		System.out.println("El nom del directori es: " +  directori1.getName());
		System.out.println("El nom del ficher es: " +  ficher1.getName());
		System.out.println(" ");
		
		// Indica si es un ficher o no.
		if(ficher1.isFile()) 
		{
			System.out.println("El ficher: " + ficher1.getName() + " si es un ficher.");
		}
		else 
		{
			System.out.println("El ficher: " + ficher1.getName() + " no es un ficher.");
		}
		
		// Indica si es un directori o no.
		if(directori1.isDirectory()) 
		{
			System.out.println("El directori: " +  directori1.getName() + " si es un directori.");
		}
		else 
		{
			System.out.println("El ficher: " + directori1.getName() + " no es un directori.");
		}
		
		System.out.println(" ");
		
		// Indica la ruta completa del ficher i del directori.
		System.out.println("La ruta completa del ficher es: " + ficher1.getAbsolutePath());
		System.out.println("La ruta completa del directori es: " + directori1.getAbsolutePath());
		System.out.println(" ");
		
		// Indica la fecha de modificaciò del ficher i del directori.
		Date d = new Date(directori1.lastModified());
		Date f = new Date(ficher1.lastModified());
		System.out.println("La fecha de modificació del ficher ha sigut el: " +  f);
		System.out.println("La fecha de modificació del directori ha sigut el: " + d);
		System.out.println(" ");
		
		// Indica si el ficher esta ocult o no.
		if(ficher1.isHidden()) 
		{
			System.out.println("El ficher: " +  ficher1.getName() + " no esta ocult.");
		}
		else 
		{
			System.out.println("El ficher: " +  ficher1.getName() + " si esta ocult.");
		}
		
		// Indica si es directori esta ocult o no.
		if(directori1.isHidden()) 
		{
			System.out.println("El directori: " +  directori1.getName() + " no esta ocult");
		}
		else 
		{
			System.out.println("El directori: " +  directori1.getName() + " si esta ocult");
		}
		System.out.println(" ");
		
		// Indica el tamany del ficher.
		if(ficher1.isFile()) 
		{
			System.out.println("El tamany del ficher: " + ficher1.getName() + " es de: " + ficher1.length() + " bytes.");
		}
		else 
		{
			System.out.println("El tamany del ficher: " + ficher1.getName() + " es de: " + ficher1.length() + " bytes perque no existix el ficher.");
		}
		System.out.println(" ");
		
		// Indica el numero d'elements i el espai que hi ha en el directori.
		String[] llistardirectori = directori1.list();
		
		int contaor = 0;
		
		System.out.println("Contingut del directori: " + directori1.getName());
		System.out.println(" ");
		
		if(directori1.isDirectory())
		{
			for(int i = 0; i < llistardirectori.length; i++) 
			{
				contaor = contaor + 1;
				System.out.println(llistardirectori[i]);
			}
			
			System.out.println("El nombre d'elements que hi ha en el directori es de: " + contaor);
			System.out.println(" ");
			
			System.out.println("Espai lliure: " + directori1.getUsableSpace());
			System.out.println("Espai disponible: " + directori1.getFreeSpace());
			System.out.println("Espai Total: " + directori1.getTotalSpace());
		}
		else 
		{
			System.out.println("El nombre d'elements que hi ha en el directori es de: " + contaor + " perque el directori no existix.");
		}
	}
	
	public static void creaCarpeta() 
	{
		Scanner teclat = new Scanner(System.in);
		
		System.out.print("Introduix el nom d'un directori: ");
		
		String directori = teclat.nextLine();
		
		File directori5 = new File(directori);
		
		// Indica si he creat un directori.
		if(directori5.mkdir()) 
		{
			System.out.println("El directori " + directori5.getName() + " se ha creat correctament.");
		}
		else 
		{
			System.out.println("El directori " + directori5.getName() + " no se ha creat correctament.");
		}
	}
	
	public static void creaFicher() 
	{
		Scanner teclat = new Scanner(System.in);
		
		System.out.print("Introduix el nom d'un ficher: ");
		
		String ficher = teclat.nextLine();
		
		File ficher5 = new File(ficher);
		
		// Indica si es creat un ficher.
		try 
		{
			if(ficher5.createNewFile()) 
			{
				System.out.println("El ficher " + ficher5.getName() + " se ha creat correctament.");
			}
			else 
			{
				System.out.println("El ficher " + ficher5.getName() + " no se ha creat correctament.");
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	 
	public static void elimina() 
	{
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Introduix el nom d'un directori a eliminar: ");
 		
		System.out.println("Introduix el nom d'un ficher a eliminar: ");
		
		String ficher = teclat.nextLine();
		
		String directori = teclat.nextLine();
		
		File directori6 = new File(directori);
		
		File ficher6 = new File(ficher);

		// Indica si he eliminat un directori.
		if(directori6.delete())
		{
			System.out.println("El directori: " + directori6.getName() + " se ha eliminat correctament.");
		}
		else 
		{
			System.out.println("El directori "  + directori6.getName() + " no se ha eliminat correctament perque no existix.");
		}
			
		// Indica si he eliminat un ficher.
		if(ficher6.delete()) 
		{
			System.out.println("El ficher: " + ficher6.getName() + " se ha eliminat correctament.");
		}
		else 
		{
			System.out.println("El ficher " + ficher6.getName() + " no ha eliminat correctament.");
		}
	}
	
	public static void renomena() 
	{
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Introduix el nom d'un directori a renombrar: ");
		System.out.println("Introduix el nom d'un ficher a renombrar: ");
		
		String directori = teclat.nextLine();
		
		String ficher = teclat.nextLine();
		
		String directori1 = teclat.nextLine();
		
		String ficher1 = teclat.nextLine();
		
		File directori5 = new File(directori);
		
		File directori6 = new File(directori1);
		
		File ficher5 = new File(ficher);
		
		File ficher6 = new File(ficher1);
				
		// Indica si el nom del directori ha cambiat o no.
		if(directori5.renameTo(directori6))
		{
			System.out.println("El directori " + directori5.getName() + " ara es diu " + directori6.getName());
		}
		else 
		{
			System.out.println("El directori " + directori5.getName() + " no ha cambiat de nom correctament.");
		}
			
		// Indica si el nom del ficher ha cambiat o no.
		if(ficher5.renameTo(ficher6)) 
		{
			System.out.println("El ficher " + ficher5.getName() + " ara es diu " + ficher6.getName());
		}
		else
		{
			System.out.println("El ficher " + ficher5.getName() + " no ha cambiat de nom correctament.");
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		// TODO Esbozo de método generado automáticamente
		
		Scanner teclat = new Scanner(System.in);
		
		boolean op = false;
		
		int opcio;
		
		String directori = args[0];
		
		String ficher = args[1];
		
		// Indica un menu de text per a elegir una opcio i que faja una funcionalitat.
		do 
		{
			System.out.println("Menu de text per a elegir un numero.");
			System.out.println("1. getInformacio.");
			System.out.println("2. creaCarpeta.");
			System.out.println("3. creaFicher.");
			System.out.println("4. elimina.");
			System.out.println("5. renomena.");
			
			System.out.print("Introduix un numero: ");
			opcio = teclat.nextInt();
			
			switch(opcio) 
			{
				case 1:
					getInformacio(directori, ficher);
					break;
				
				case 2:
					creaCarpeta();
					break;
				
				case 3:
					creaFicher();
					break;
				
				case 4:
					elimina();
					break;
				
				case 5:
					renomena();
					break;
					
				default:
					System.out.println("Introduix un numero del 1 al 5.");
					break;
			}
		} while(op != false);
	}

	public boolean accept(File dir, String name)
	{
        return name.endsWith(extension);
    }
}