package com.example.choxxalci;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CalcActivity extends Activity implements android.view.View.OnClickListener {

	
	ImageButton ii1,ii2,ii3,ii4,ii5,ii6,ii7,ii8,ii9,ii0,iplus,iminus,imultiply,idivide,iequal,iclear,idot;
	Button sin,cos,tan,sqrt,sqr,log,ln,fact,power,ex;
	double x;
	int a=0,b=0,counter1=1,op=0;
		String exp="",s="",ss="";
	
	EditText et,chk;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_calc);
		/*
		*/
		chk=(EditText) findViewById(R.id.check);
		et=(EditText) findViewById(R.id.data);
		et.setBackgroundResource(R.drawable.et);
		et.setInputType(InputType.TYPE_NULL);
		chk.setBackgroundResource(R.drawable.et);
		chk.setInputType(InputType.TYPE_NULL);
		ii1= (ImageButton) findViewById(R.id.num1);
		ii2= (ImageButton) findViewById(R.id.i2);
	ii3= (ImageButton) findViewById(R.id.i3);
		ii4= (ImageButton) findViewById(R.id.i4);
		ii5= (ImageButton) findViewById(R.id.i5);
	ii6= (ImageButton) findViewById(R.id.i6);
		ii7= (ImageButton) findViewById(R.id.i7);
		ii8= (ImageButton) findViewById(R.id.i8);
	ii9= (ImageButton) findViewById(R.id.i99);
	ii0= (ImageButton) findViewById(R.id.i0);
		iplus= (ImageButton) findViewById(R.id.bplus);
		iminus= (ImageButton) findViewById(R.id.bminus);
		imultiply= (ImageButton) findViewById(R.id.bmulti);
		//iequal= (ImageButton) findViewById(R.id.equals);
		//iclear= (ImageButton) findViewById(R.id.bclear);
	idivide= (ImageButton) findViewById(R.id.bdivide);
		idot=(ImageButton) findViewById(R.id.bdot);
		ii1.setOnClickListener(this);
		ii2.setOnClickListener(this);
		ii3.setOnClickListener(this);
		ii4.setOnClickListener(this);
		ii5.setOnClickListener(this);
		ii6.setOnClickListener(this);
		ii7.setOnClickListener(this);
		ii8.setOnClickListener(this);
		ii9.setOnClickListener(this);
		ii0.setOnClickListener(this);
		iplus.setOnClickListener(this);
		iminus.setOnClickListener(this);
		imultiply.setOnClickListener(this);
		idivide.setOnClickListener(this);
		idot.setOnClickListener(this);
		
		
		
			
			sin=(Button) findViewById(R.id.sin);
			 
			cos=(Button) findViewById(R.id.cos);
			tan=(Button) findViewById(R.id.tan);
			log=(Button) findViewById(R.id.log);
			ln=(Button) findViewById(R.id.ln);
			fact=(Button) findViewById(R.id.fact);
			ex=(Button) findViewById(R.id.ex);
			sqrt=(Button) findViewById(R.id.sqrt);
			sqr=(Button) findViewById(R.id.sqr);
			power=(Button) findViewById(R.id.power);
		sin.setOnClickListener(this);
		 
		cos.setOnClickListener(this);
		tan.setOnClickListener(this);
		log.setOnClickListener(this);
		ln.setOnClickListener(this);
		fact.setOnClickListener(this);
		sqr.setOnClickListener(this);
		sqrt.setOnClickListener(this);
		ex.setOnClickListener(this);
		power.setOnClickListener(this);
	
	}//on create end

	
	@Override
	public void onClick(View v) {
	
		switch(v.getId())
		
	
		
		{
		
		case R.id.i0:
			exp=exp+"0";
			
			et.setText(exp);
			
			break;
		case R.id.num1:  exp=exp+"1";
			et.setText(exp);
			break;
		case R.id.i2:exp=exp+"2";
			et.setText(exp);

						break;
		case R.id.i3:	exp=exp+"3";
						et.setText(exp);

						break;
		case R.id.i4:	exp=exp+"4";
		et.setText(exp);
						break;
		case R.id.i5:	exp=exp+"5";
						et.setText(exp);
						break;
		case R.id.i6:	exp=exp+"6";
		et.setText(exp);

						break;
		case R.id.i7:	exp=exp+"7";
		et.setText(exp);

						break;
		case R.id.i8:	exp=exp+"8";et.setText(exp);
						break;
		case R.id.i99:
		exp=exp+"9";
		
		et.setText(exp);
		
						break;
		case R.id.bdot:exp=exp+".";	
			et.setText(exp);

							
							break;
		case R.id.bplus:	exp=exp+"+";et.setText(exp);

							
							break;
		case R.id.bminus:	exp=exp+"-";
		et.setText(exp);

							break;
		case R.id.bmulti:	exp=exp+"*";et.setText(exp);

							break;
		case R.id.bdivide:	exp=exp+"/";
			et.setText(exp);

							break;
		case R.id.sin:	
		Toast.makeText(this, "hehehe, ye kaam ni karega abbi.. :-)", 1000).show();
		
		
		break;
		
		case R.id.power:
			
			Toast.makeText(this, "hehehe, ye kaam ni karega abbi.. :-)", 1000).show();
			break;
		
		case R.id.cos:	Toast.makeText(this, "hehehe, ye kaam ni karega abbi.. :-)", 1000).show();
			//et.setText("cos()");
			break;
			
		case R.id.tan:	
			Toast.makeText(this, "hehehe, ye kaam ni karega abbi.. :-)", 1000).show();
			break;
			
		case R.id.log:	
			Toast.makeText(this, "hehehe, ye kaam ni karega abbi.. :-)", 1000).show();
			break;
			
		case R.id.ln:	
			Toast.makeText(this, "hehehe, ye kaam ni karega abbi.. :-)", 1000).show();
			break;
			
		case R.id.fact:	
			Toast.makeText(this, "hehehe, ye kaam ni karega abbi.. :-)", 1000).show();
			break;
			
		case R.id.sqr:	
			Toast.makeText(this, "hehehe, ye kaam ni karega abbi.. :-)", 1000).show();
			break;
			
		case R.id.sqrt:	
			Toast.makeText(this, "hehehe, ye kaam ni karega abbi.. :-)", 1000).show();
			break;
			
		case R.id.ex:	
			Toast.makeText(this, "hehehe, ye kaam ni karega abbi.. :-)", 1000).show();
			break;
						
	 

		}// switch closed
	
		
	}// onclick() closed
	
	
	public void calculate(View v)
	{
		
		
		exp=exp+" ";
		for(int i=0;i<exp.length();i++)
		{
			if(exp.charAt(i)=='+'|| exp.charAt(i)=='-' || exp.charAt(i)=='*' || exp.charAt(i)=='/'||exp.charAt(i)==' ')
				op++;
			
		}
		Exp x=new Exp(exp,op);
		try{
		chk.setText(" "+x.calc());
		}
		catch (Exception e) {
			chk.setText("ERROR");
		}
		exp="";
		et.setText(exp);
		
	}//calculate() end

	public void clean(View v)
	{
		Intent ii=getIntent();
		finish();
		startActivity(ii);
	}
	
	public void closebrac(View v)
	{
		Toast.makeText(this, "hehehe, ye kaam ni karega abbi.. :-)", 1000).show();
	}

}//class end