package com.example.choxxalci;

public class Exp {
	char ch[]=new char[15];
	

	String tmp="";
	double x,stck[];
	int cc=-1,j=0,d=0,m=0,a=0,s=0,opcount=0;
	
	Exp(String exp,int l) 
	{
		
		stck=new double[l];	//dynamically creating stack
		
		
		
		 
		for(int i=0;i<exp.length();i++)
		{
			
			if(exp.charAt(i)=='/')
				d++;
			if(exp.charAt(i)=='*')
				m++;
			if(exp.charAt(i)=='+')
				a++;
			if(exp.charAt(i)=='-')
				s++;
			opcount=d+m+a+s;
			//char ch[]=new char[opcount];
			if(exp.charAt(i)=='+'|| exp.charAt(i)=='-' || exp.charAt(i)=='*' || exp.charAt(i)=='/'||exp.charAt(i)==' ')
			{
	
				
				
				if(exp.charAt(i)==' ')
				{
					
				}
				else
				ch[j]=exp.charAt(i);
				j++;
				//stck[]=new double[5];
				stck[++cc]=Double.parseDouble(tmp);
				tmp="";
				
			
			}//if close
			else
			tmp=tmp+exp.charAt(i);
			
			
		}// for loop end
}//Exp end

public  double calc()
{
	try{
	caldivide();
	//System.out.println("-----------------------------------------------");

	calmulti();
	caladd();
	calsub();
	
		
	}catch (Exception e) {
		// TODO: handle exception
		
	}
	return stck[0];
	//System.out.println("Length:   "+stck.length);

}//calc end

public  void calcCh(char ph[],int pos)
{
	int len=ch.length,count=-1;
	char newt[]=new char[len-1];
	for(int i=0;i<pos;i++)
	{
		newt[++count]=ph[i];
	}
	for(int i=pos+1;i<ch.length;i++)
	{
		newt[++count]=ch[i];
	}
	ch=newt;
	System.out.println("Length:ch   ----------"+ch.length);
	for(int i=0;i<ch.length;i++)
	{
		System.out.println("ch:   "+ch[i]);
	}
	System.out.println("ggg"+d+m+a+s);
	calc();
}




public  void caldivide()
{
	if(d>0)
	{
	int i=0,ct=-1;
	while(i<=ch.length-1)
	{
	
	if(ch[i]=='/')
	{
		x=stck[i]/stck[i+1];
		stck[i]=x;
		double temp[]=new double[cc];
		for(int j=0;j<=i;j++)
		{
			temp[++ct]=stck[j];
		}
		for(j=i+2;j<stck.length;j++)
		{
			temp[++ct]=stck[j];
		}
		stck=temp;
		System.out.println("Length:ch   "+ch.length);
		break;
	}
	i++;
	}//while end
	d=d-1;
	calcCh(ch,i--);
	
	
	
	}//if end
	else return;
	
	caldivide();
}//caldivide end


public  void calmulti()
{
	if(m>0)
	{
	int i=0,ct=-1;
	while(i<=ch.length-1)
	{
	
	if(ch[i]=='*')
	{
		
		//System.out.println("Length:   "+ch.length);
		
		x=stck[i]*stck[i+1];
		stck[i]=x;
		double temp[]=new double[cc];
		for(int j=0;j<=i;j++)
		{
			temp[++ct]=stck[j];
		}
		for(j=i+2;j<stck.length;j++)
		{
			temp[++ct]=stck[j];
		}
		stck=temp;
		System.out.println("Length:ch   "+ch.length);
		
		break;
	}
	i++;
	}//while end
	m--;
	calcCh(ch,i--);
	
	
	
	}//if end
	else return;
	calmulti();
}


public  void caladd()
{
	if(a>0)
	{
	int i=0,ct=-1;
	while(i<=ch.length-1)
	{
	
	if(ch[i]=='+')
		
	{
		//exp="7-4/2*6/3-6/6-7+4 "==  5-6*6/2+10-2*5/5+8
		//System.out.println("Length:   "+ch.length);
		//if(i) 
		if(i>=1)
		{
			if(((ch[i-1])=='-'))
		{
				x=-stck[i]+stck[i+1];
				if(x>0)
					{
					ch[i-1]='+';
					a++;
					}
				else if(x<0)
					{
					x=x*-1;
					ch[i-1]='-';
					s++;
					}
				else{}
				
		}
			
			
			System.out.println("xxxxxxxxxx="+x);
		}
		else
			x=stck[i]+stck[i+1];
		
		stck[i]=x;
		double temp[]=new double[cc];
		for(int j=0;j<=i;j++)
		{
			temp[++ct]=stck[j];
		}
		for(j=i+2;j<stck.length;j++)
		{
			temp[++ct]=stck[j];
		}
		stck=temp;
		System.out.println("Length:ch   "+ch.length);
		break;
	}
	i++;
	}//while end
	a--;
	calcCh(ch,i--);
	
	
	
	}//if end
	else return;
	caladd();
}


public  void calsub()
{
	if(s>0)
	{
	int i=0,ct=-1;
	while(i<=ch.length-1)
	{
	
	if(ch[i]=='-')
	{
		
		//System.out.println("Length:   "+ch.length);
		
		x=stck[i]-stck[i+1];
		stck[i]=x;
		double temp[]=new double[cc];
		for(int j=0;j<=i;j++)
		{
			temp[++ct]=stck[j];
		}
		for(j=i+2;j<stck.length;j++)
		{
			temp[++ct]=stck[j];
		}
		stck=temp;
		System.out.println("Length:ch   "+ch.length);
		break;
	}
	i++;
	}//while end
	s--;
	calcCh(ch,i--);
	
	
	
	}//if end
	else return;
	calsub();
}




}//class end

