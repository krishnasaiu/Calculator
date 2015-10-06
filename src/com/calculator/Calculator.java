package com.calculator;

import java.text.DecimalFormat;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends Activity {

	Button zero, one, two, three, four, five, six, seven, eight, nine, dot, add, sub, mul, div, mod, back, clear, equals, plusMinus, sqrt, sqr, inv;
	TextView result, operations;

	ArrayList<String> operands = new ArrayList<String>();
	ArrayList<String> operation = new ArrayList<String>();

	int newNumFlag=1;  //  Check if the button pressed if for new number or continuation of existing number
	int ndsCount=0;    //  Count for array list of operands
	int tionCount=0;   //  Count for array list of operations
	int dFlag=0;       //  Check if the expression has any float
	int actOpFlag=0;   //  Check for active operation
	int eqFlag=0;      //  Check if last button pressed is "="
	int pmFlag=0;      //  Check for plus minus button

	Double res=0.0;  //  final result

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator);

		zero = (Button) findViewById(R.id.bZero);
		one = (Button) findViewById(R.id.bOne);
		two = (Button) findViewById(R.id.bTwo);
		three = (Button) findViewById(R.id.bThree);
		four = (Button) findViewById(R.id.bFour);
		five = (Button) findViewById(R.id.bFive);
		six = (Button) findViewById(R.id.bSix);
		seven = (Button) findViewById(R.id.bSeven);
		eight = (Button) findViewById(R.id.bEight);
		nine = (Button) findViewById(R.id.bNine);
		dot = (Button) findViewById(R.id.bDot);
		add = (Button) findViewById(R.id.bAdd);
		sub = (Button) findViewById(R.id.bSub);
		mul = (Button) findViewById(R.id.bMul);
		div = (Button) findViewById(R.id.bDiv);
		mod = (Button) findViewById(R.id.bMod);
		plusMinus = (Button) findViewById(R.id.bPlusMinus);
		sqr = (Button) findViewById(R.id.bSqr);
		sqrt = (Button) findViewById(R.id.bSqrt);
		inv = (Button) findViewById(R.id.bInv);
		back = (Button) findViewById(R.id.bBack);
		clear = (Button) findViewById(R.id.bClear);
		equals = (Button) findViewById(R.id.bEquals);
		result = (TextView) findViewById(R.id.tvResult);
		operations = (TextView) findViewById(R.id.tvOperations);

		zero.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try{
					if(newNumFlag==1){
						operands.add(ndsCount,"0");
						newNumFlag=0;
					}
					else{
						if(operands.get(ndsCount).equals("0"))
							operands.set(ndsCount,"0");
						else
							operands.set(ndsCount,operands.get(ndsCount)+"0");
					}
					actOpFlag=0;
					printString();
				}catch(Exception e){
					clear();
				}
			}

		});

		one.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try{
					if(newNumFlag==1){
						operands.add(ndsCount,"1");
						newNumFlag=0;
					}
					else{
						operands.set(ndsCount,operands.get(ndsCount)+"1");
					}
					actOpFlag=0;
					printString();
				}catch(Exception e){
					clear();
				}
			}
		});

		two.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try{
					if(newNumFlag==1){
						operands.add(ndsCount,"2");
						newNumFlag=0;
					}
					else{
						operands.set(ndsCount,operands.get(ndsCount)+"2");
					}
					actOpFlag=0;
					printString();
				}catch(Exception e){
					clear();
				}
			}
		});

		three.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try{
					if(newNumFlag==1){
						operands.add(ndsCount,"3");
						newNumFlag=0;
					}
					else{
						operands.set(ndsCount,operands.get(ndsCount)+"3");
					}
					actOpFlag=0;
					printString();
				}catch(Exception e){
					clear();
				}
			}
		});

		four.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try{
					if(newNumFlag==1){
						operands.add(ndsCount,"4");
						newNumFlag=0;
					}
					else{
						operands.set(ndsCount,operands.get(ndsCount)+"4");
					}
					actOpFlag=0;
					printString();
				}catch(Exception e){
					clear();
				}
			}
		});

		five.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try{
					if(newNumFlag==1){
						operands.add(ndsCount,"5");
						newNumFlag=0;
					}
					else{
						operands.set(ndsCount,operands.get(ndsCount)+"5");
					}
					actOpFlag=0;
					printString();
				}catch(Exception e){
					clear();
				}
			}
		});

		six.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try{
					if(newNumFlag==1){
						operands.add(ndsCount,"6");
						newNumFlag=0;
					}
					else{
						operands.set(ndsCount,operands.get(ndsCount)+"6");
					}
					actOpFlag=0;
					printString();
				}catch(Exception e){
					clear();
				}
			}
		});

		seven.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try{
					if(newNumFlag==1){
						operands.add(ndsCount,"7");
						newNumFlag=0;
					}
					else{
						operands.set(ndsCount,operands.get(ndsCount)+"7");
					}
					actOpFlag=0;
					printString();
				}catch(Exception e){
					clear();
				}
			}
		});

		eight.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v ) {
				try{
					if(newNumFlag==1){
						operands.add(ndsCount,"8");
						newNumFlag=0;
					}
					else{
						operands.set(ndsCount,operands.get(ndsCount)+"8");
					}
					actOpFlag=0;
					printString();
				}catch(Exception e){
					clear();
				}
			}
		});

		nine.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try{
					if(newNumFlag==1){
						operands.add(ndsCount,"9");
						newNumFlag=0;
					}
					else{
						operands.set(ndsCount,operands.get(ndsCount)+"9");
					}
					actOpFlag=0;
					printString();
				}catch(Exception e){
					clear();
				}
			}
		});

		dot.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try{
					if(dFlag==0){
						if(newNumFlag==1){
							operands.add(ndsCount,"0.");
							newNumFlag=0;
						}
						else{
							operands.set(ndsCount,operands.get(ndsCount)+".");
						}
						dFlag=1;
						printString();
					}
					else{
						Vibrator vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
						vib.vibrate(100);  // Vibrate for 100 milliseconds
					}
				}catch(Exception e){
					clear();
				}
			}
		});

		plusMinus.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try{
					if(newNumFlag==0)
						if(pmFlag==0){
							operands.set(ndsCount, "-"+operands.get(operands.size()-1));
							pmFlag=1;
						}
						else{
							operands.set(ndsCount, operands.get(operands.size()-1).substring(1, operands.size()));
							pmFlag=0;
						}
					printString();
				}catch(Exception e){
					clear();
				}
			}
		});

		sqr.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{
					String temp = Double.toString(Math.pow(parseArrayLists(),2));
					clear();
					operands.add(ndsCount, temp);
					result.setText(temp);
					ndsCount++;
					newNumFlag=0;
				}catch(Exception e){
					clear();
				}
			}
		});

		sqrt.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try{
					String temp = Double.toString(Math.sqrt(parseArrayLists()));
					clear();
					operands.add(ndsCount, temp);
					result.setText(temp);
					ndsCount++;
					newNumFlag=0;
				}catch(Exception e){
					clear();
				}
			}
		});

		inv.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try{
					String temp = Double.toString(1/parseArrayLists());
					clear();
					operands.add(ndsCount, temp);
					result.setText(temp);
					ndsCount++;
					newNumFlag=0;
				}catch(Exception e){
					clear();
				}
			}
		});

		add.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				try{
					if(newNumFlag!=1){
						if(actOpFlag!=0){
							tionCount--;
							ndsCount--;
							operation.remove(tionCount);  // remove the last operation
						}
						operation.add(tionCount,"+");
						res = parseArrayLists();

						if(res == (res.intValue())){
							result.setText(Integer.toString(res.intValue()));
						}
						else
							result.setText(new DecimalFormat(".####").format(res));
					}

					pmFlag=0;
					dFlag=0;
					tionCount++;
					ndsCount++;    //  takes new number to next location of array list nds
					actOpFlag=1;   //  this operation is active
					newNumFlag=1;  //  sets new number has to be taken from now
					eqFlag = 0;
				}catch(Exception e){
					clear();
				}
			}
		});

		sub.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try{
					if(newNumFlag!=1){
						if(actOpFlag!=0){
							tionCount--;
							ndsCount--;
							operation.remove(tionCount);  // remove the last operation
						}
						operation.add(tionCount,"-");
						res = parseArrayLists();

						if(res == (res.intValue())){
							result.setText(Integer.toString(res.intValue()));
						}
						else
							result.setText(new DecimalFormat(".####").format(res));
					}

					pmFlag=0;
					dFlag=0;
					tionCount++;
					ndsCount++;    //  takes new number to next location of array list nds
					actOpFlag=1;   //  this operation is active
					newNumFlag=1;  //  sets new number has to be taken from now
					eqFlag = 0;
				}catch(Exception e){
					clear();
				}
			}
		});

		mul.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try{
					if(newNumFlag!=1){
						if(actOpFlag!=0){
							tionCount--;
							ndsCount--;
							operation.remove(tionCount);  // remove the last operation
						}
						operation.add(tionCount,"*");
						res = parseArrayLists();

						if(res == (res.intValue())){
							result.setText(Integer.toString(res.intValue()));
						}
						else
							result.setText(new DecimalFormat(".####").format(res));
					}

					pmFlag=0;
					dFlag=0;
					tionCount++;
					ndsCount++;    //  takes new number to next location of array list nds
					actOpFlag=1;   //  this operation is active
					newNumFlag=1;  //  sets new number has to be taken from now
					eqFlag = 0;
				}catch(Exception e){
					clear();
				}
			}
		});

		div.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try{
					if(newNumFlag!=1){
						if(actOpFlag!=0){
							tionCount--;
							ndsCount--;
							operation.remove(tionCount);  // remove the last operation
						}
						operation.add(tionCount,"/");
						res = parseArrayLists();

						if(res == (res.intValue())){
							result.setText(Integer.toString(res.intValue()));
						}
						else
							result.setText(new DecimalFormat(".####").format(res));

						pmFlag=0;
						dFlag=0;
						tionCount++;
						ndsCount++;    //  takes new number to next location of array list nds
						actOpFlag=1;   //  this operation is active
						newNumFlag=1;  //  sets new number has to be taken from now
						eqFlag = 0;
					}
				}catch(Exception e){
					clear();
				}
			}
		});

		mod.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try{
					if(newNumFlag!=1){
						if(actOpFlag!=0){
							tionCount--;
							ndsCount--;
							operation.remove(tionCount);  // remove the last operation
						}
						operation.add(tionCount,"%");
						res = parseArrayLists();

						if(res == (res.intValue())){
							result.setText(Integer.toString(res.intValue()));
						}
						else
							result.setText(new DecimalFormat(".####").format(res));
					}

					pmFlag=0;
					dFlag=0;
					ndsCount++;    //  takes new number to next location of array list nds
					tionCount++;
					actOpFlag=1;   //  this operation is active
					newNumFlag=1;  //  sets new number has to be taken from now
					eqFlag = 0;
				}catch(Exception e){
					clear();
				}
			}
		});

		back.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try{
					if(newNumFlag==0){
						if(operands.get(ndsCount).equals("0."))
							operands.set(ndsCount, "0");
						else{
							if(operands.get(ndsCount).length()>1)
								operands.set(ndsCount, operands.get(ndsCount).substring(0, operands.get(ndsCount).length()-1));
							else{
								operands.remove(ndsCount);
								ndsCount--;
								newNumFlag=1;
							}
						}
					}
					printString();
				}catch(Exception e){
					clear();
				}
			}
		});

		clear.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				clear();
			}
		});

		equals.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try{
					if(eqFlag==1){
						operands.add(operands.get(operands.size()-1));
						operation.add(operation.get(operation.size()-1));

						ndsCount++;
						tionCount++;
					}
					res = parseArrayLists();
					operations.setText(operations.getText().toString()+result.getText().toString());
					if(res == (res.intValue())){
						result.setText(Integer.toString(res.intValue()));
					}
					else
						result.setText(new DecimalFormat(".####").format(res));
					eqFlag=1;
				}catch(Exception e){
					clear();
				}
			}
		});
	}

	private double parseArrayLists() {
		int opCount=0;
		int i=0;

		try{

			res=Double.parseDouble(operands.get(i));
			for(i=1; i<operands.size(); i++){
				if(opCount<operation.size()){
					Log.w("oper", res+ " "+operation.get(opCount)+" "+operands.get(i));
					if(operation.get(opCount).equals("+"))
						res+=Double.parseDouble(operands.get(i));
					if(operation.get(opCount).equals("-"))
						res-=Double.parseDouble(operands.get(i));
					if(operation.get(opCount).equals("*"))
						res*=Double.parseDouble(operands.get(i));
					if(operation.get(opCount).equals("/")){
						if(!operands.get(i).equals("0"))
							res/=Double.parseDouble(operands.get(i));
						else{
							Toast.makeText(getApplicationContext(), "cannot divide by zero", Toast.LENGTH_LONG).show();
							clear();
						}
					}
					if(operation.get(opCount).equals("%"))
						res%=Double.parseDouble(operands.get(i));
				}
				opCount++;
			}
		}
		catch(Exception e){
			clear();
			return 0;
		}

		Log.w("res",Double.toString(res));
		printString();
		return res;
	}

	private void printString() {
		int opCount=0;
		String s="";
		for(int i=0; i<operation.size(); i++){
			s+=operands.get(i);
			if(opCount<operands.size()){
				s+=operation.get(opCount);
				opCount++;
			}
		}
		result.setText(operands.get(ndsCount));
		operations.setText(s);
	}

	private void clear() {
		operands = new ArrayList<String>();
		operation = new ArrayList<String>();

		newNumFlag=1;  //  Check if the button pressed if for new number or continuation of existing number
		ndsCount=0;    //  Count for array list of operands
		tionCount=0;   //  Count for array list of operations
		dFlag=0;       //  Check if the expression has any float
		actOpFlag=0;
		eqFlag=0;
		res=0.0;  //  final result

		operations.setText("");
		result.setText(Integer.toString(res.intValue()));
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculator, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}