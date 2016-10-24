import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Student
{
	int roll;
	String name,dept,university,x;
	double [] GPAsInTerms = new double[8];
	double	CGPA;
	public Student()
	{
		roll= 0;
		name = "";
		dept = "";
		university = "";
		x = "";
		for(int i=0; i<GPAsInTerms.length; i++)
			GPAsInTerms[i] = 0.0;
		CGPA = 0.0;
	}
	
	public int load(int loop) throws Exception
	{
		int condition = 0;
		try
		{
			int i = 0;
			File loadfile = new File("Studentinfo.txt");
			Scanner inp = new Scanner(loadfile);
			if(condition1 > 0)
			{
				
				for(int j=1; j<=loop; j++)
				{
					x = inp.nextLine();
				}
			} 
			x = inp.nextLine();
			System.out.println(x);
			roll = Integer.parseInt(inp.nextLine());
			System.out.println(roll);
			x = inp.nextLine();
			System.out.println(x);
			name = inp.nextLine();
			System.out.println(name);
			x = inp.nextLine();
			System.out.println(x);
			dept = inp.nextLine();
			System.out.println(dept);
			x = inp.nextLine();
			System.out.println(x);
			university = inp.nextLine();
			System.out.println(university);
			x = inp.nextLine();
			System.out.println(x);
			while(inp.hasNextDouble() == true)
			{
				GPAsInTerms[i] = inp.nextDouble();
				i++;
			}
			for(int j=0; GPAsInTerms[j]!=0; j++)
			{
				System.out.print(GPAsInTerms[j] + " ");
			}
			System.out.println();
			if(inp.hasNextLine() == true)
				condition = 1;
			else
				condition= 2;
			inp.close();
		}
		catch(Exception xxx)
		{
			
		}
		return condition;
	}
	public void updateStudentById()
	{
		int term = 0;
		double GPA = 0.0;
		double [] term11 = new double[9];
		double [] term12 = new double[10];
		double [] term21 = new double[8];
		for(int i=0; GPAsInTerms[i]!=0; i++)
		{
			term = i+1;
		}
		if(term == 0)
		{
			
		}
		if(term == 1)
		{
			
		}
		if(term == 2)
		{
			
		}
	}
	public double calculateCGPA()
	{
		double sum= 0.0;
		int credit = 0;
		for(int i=0; GPAsInTerms[i]!=0; i++)
		{
			total += GPAsInTerms[i];
			credit = i+1;
		}
		CGPA = sum/credit;
		return CGPA;
	}
	
	public void save() throws Exception
	{
		int cnt = 0;
		try
		{
			File out = new File(roll + ".txt");
			PrintWriter wte = new PrintWriter(out);
			wte.println("Info:");
			wte.println("Roll : " + roll);
			wte.println("Name : " + name);
			wte.println("Department : " + dept);
			wte.println("University : " + university);
			wte.print("GPAs in different terms : ");
			for(int i=0; GPAsInTermsTerms[i]!=0; i++)
			{
				cnt += 1;
			}
			for(int i=0; i<cnt-1; i++)
			{
				wte.print(GPAsInTerms[i] + " ");
			}
			wte.format("%.2f",GPAsInTerms[cnt-1]);
			wte.println();
			wte.format("CGPA : %.2f",calculateCGPA());
			wte.close();
		}
		catch(Exception xxx)
		{
			System.out.println("Error occurred");
		}
	}
}
public static void main(String[] args) 
{
Student [] st = new Student[120];
int a1=0,a2=0;
for(int i=0;i<120;i++)
{
   st[i]=new Student();
}
for(int i=0;i<120;i++)
{
if(s[i].load(a1)==1)
a1+=10;
else
break;
}
}

