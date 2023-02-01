import java.util.*;

 
public class Main
{
  
private int code;
  
private String hardwareName;
  
private String type;
  
private String employeeName;
  
 
Main (int code, String hardwareName, String type, String employeeName)
  {
    
this.code = code;
    
this.hardwareName = hardwareName;
    
this.type = type;
    
this.employeeName = employeeName;
  
} 
 
public int getCode ()
  {
    
return code;
  
}
  
 
public String getHardwareName ()
  {
    
return hardwareName;
  
}
  
 
public String getType ()
  {
    
return type;
  
}
  
 
public String getEmployeeName ()
  {
    
return employeeName;
  
}
  
 
@Override 
 public String toString ()
  {
    
return "Hardware code: " + this.code + " Hardware Name: " +
      this.hardwareName + " Hardware type: " + this.type + " Assign to: " +
      this.employeeName;
  
}
  
 
public static void main (String[]args)
  {
    
Scanner sc = new Scanner (System.in);
    
 
List < Main > hardwareList = new ArrayList <> ();
    
 
int choice = 1;
    
 
while (choice != 0)
      {
	
System.out.println ("A. Create record");
	
System.out.println ("B. View record");
	
System.out.println ("C. Edit record");
	
System.out.println ("D. Delete record");
	
System.out.println ("E. Report");
	
System.out.println ("F. Exit");
	
System.out.print ("Enter your choice: ");
	
char c = sc.next ().charAt (0);
	
switch (Character.toUpperCase (c))
	  {
	  
case 'A':
	    
System.out.print ("Enter code: ");
	    
int code = sc.nextInt ();
	    
sc.nextLine ();
	    
System.out.print ("Enter hardware name: ");
	    
String hardwareName = sc.nextLine ();
	    
System.out.print ("Enter type: ");
	    
String type = sc.nextLine ();
	    
System.out.print ("Enter employee name: ");
	    
String employeeName = sc.nextLine ();
	    
hardwareList.
	      add (new Main (code, hardwareName, type, employeeName));
	    
System.out.println ("Record created successfully");
	    
break;
	  
case 'B':
	    
System.out.
	      println
	      ("----------------------------------------------------------------------------");
	  
for (Main hardware:hardwareList)
	      {
		
System.out.println (hardware);
	      
}
	    
System.out.
	      println
	      ("----------------------------------------------------------------------------");
	    
break;
	  
case 'C':
	    
System.out.print ("Enter code: ");
	    
code = sc.nextInt ();
	    
boolean found = false;
	  
for (Main hardware:hardwareList)
	      {
		
if (hardware.getCode () == code)
		  {
		    
sc.nextLine ();
		    
System.out.print ("Enter hardware name: ");
		    
hardwareName = sc.nextLine ();
		    
hardware.hardwareName = hardwareName;
		    
System.out.print ("Enter type: ");
		    
type = sc.nextLine ();
		    
hardware.type = type;
		    
System.out.print ("Enter employee name: ");
		    
employeeName = sc.nextLine ();
		    
hardware.employeeName = employeeName;
		    
found = true;
		    
System.out.println ("Record edited successfully");
		    
break;
		  
}
	      
}
	    
if (!found)
	      {
		
System.out.println ("Record not found");
	      
}
	    
break;
	  
case 'D':
	    
System.out.print ("Enter code: ");
	    
code = sc.nextInt ();
	    
int index = -1;
	    
for (int i = 0; i < hardwareList.size (); i++)
	      {
		
if (hardwareList.get (i).getCode () == code)
		  {
		    
index = i;
		    
break;
		  
}
	      
}
	    
if (index != -1)
	      {
		
hardwareList.remove (index);
		
System.out.println ("Record deleted successfully");
	      
}
	    else
	      {
		
System.out.println ("Record not found");
	      
}
	    
break;
	  
case 'E':
	    
System.out.println ("Report");
	    
System.out.
	      println
	      ("----------------------------------------------------------------------------");
	    
System.out.
	      println ("Code\tHardware Name\t\t\tType\t\t\tEmployee Name");
	  
for (Main hardware:hardwareList)
	      {
		
System.out.println (hardware.getCode () + "\t" +
				     hardware.getHardwareName () + "\t\t\t" +
				     hardware.getType () + "\t\t\t" +
				     hardware.getEmployeeName ());
	      
}
	    
System.out.
	      println
	      ("----------------------------------------------------------------------------");
	    
break;
	  
case 'F':
	    
choice = 0;
	    
break;
	  
default:
	    
System.out.println ("Invalid choice");
	    
break;
	  
}
      
}
    
sc.close ();
  
}

}
