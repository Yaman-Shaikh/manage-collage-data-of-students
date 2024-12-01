 import java.util.*;
 
 class Admission
 {String name;
 int id,fees,p_fees;
	Admission(String name,int id,int fees,int p_fees){
	this.name=name;
	this.id=id;
	this.fees=fees;
	this.p_fees=p_fees;
	}
	public int getid()
	{	
		return id;
	}
	
	
	public int getfees()
	{	
		return fees;
	}

	public String getname()
	{	
		return name;
	}
	public int getp_fees()
	{	
		return p_fees;
	}
	
 }
 
 class Collage 
 {//Admission a[];
	//void addNewStudent(Admission a[])
	//{
		
	//}
	
	void showAdmission (Admission a[])
	{//this.a=a;	
	System.out.println("name\t\tid\t\ttotal fees\t\tpaid fees\t\t");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i].getname()+"\t\t"+a[i].getid()+"\t\t"+a[i].getfees()+"\t\t"+a[i].getp_fees());
		}
	}
 }
 
 public class CollageApp1
 {
	public static void main(String x[])
	{
		Scanner xyz=new Scanner (System.in);
		System.out.println("enter the number of Student");
		int size=xyz.nextInt();
		
		Admission a[]=new Admission[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the id ");
		int id=xyz.nextInt();
		xyz.nextLine();
		System.out.println("enter the name ");
		String name=xyz.nextLine();
		
		
		
		System.out.println("total fees");
		int fees=xyz.nextInt();
		
		System.out.println("paid fees");
		int p_fees=xyz.nextInt();	
	
		a[i]=new Admission(name,id,fees,p_fees);
		}
			Collage c=new Collage();
		//	c.addNewStudent(a);
			c.showAdmission(a);
		
	}
 }		