package ui;
import java.util.Scanner;

public class Intwork1{
	public static final int number1=1;
	public static Scanner us = new Scanner(System.in);
	
/**
* name: ln <br>
*  calculates the value of the natural logarithm given by the user by evaluating it 1000 times in the summation <br>
* <b>pre: </b> value!=null <br>
* <b>post:  </b> deploy in the screen the value of natural logarithm <br>
* @param value is double. the parameter is the value given by the user. value greater or equal 0.1 and value lees or equal to 2
*/
/*
	
/*
inputs= value to be evaluated (value)
process= calculates the value of the natural logarithm given by the user by evaluating it 1000 times in the summation
outputs= returns nothing but displays the final value of the natural logarithm on the screen
*/
	public static void ln(double value){
		  double ln = 0.0;
                    for(int i = number1; i<1000; i++){
                        ln += (power(-number1,i+number1)*power(value-number1,i)/i);
                    }
                    System.out.println(ln);
	}
/**
* name: sen <br>
*  calculates the value of the sine given by the user evaluating it 1000 times in the summation <br>
* <b>pre: </b> value!=null <br>
* <b>post:  </b> deploy in the screen the value of sine function <br>
* @param value is double. the parameter is the value given by the user. value greater or equal -35 and value lees or equal to 35
*/
	
/*
inputs= value to be evaluated (value)
process= calculates the value of the sine given by the user evaluating it 1000 times in the summation
outputs= returns nothing but displays the final value of the sine (resultsen) 
*/
	public static void sen(double value){
		  double resultsen = 0.0;
                    for(double i=0; i<100; i++){
                        resultsen += power(-number1,i)/subfactorial(2*i+number1)*power(value,2*i+number1);
                    }
                    System.out.println(resultsen);
	}

/**
* name: menu <br>
*  allows the user to choose what he/she wants to do with the calculator <br>
* <b>pre: </b> options!=null <br>
* <b>post:  </b> deploy in the screen the menu <br>
* @param options int
* @return  options that is an int that saves the option selected by the user in the menu
*/	
	
/*
inputs= value to be read by user for the menu (options)
process= allows the user to choose what he/she wants to do with the calculator
outputs= return user's decision (options)
*/
	public static int  menu(int options){
	String continued="";
		boolean validoption= true;
					System.out.println("Select an option: \n" +
							"Option 1: Calculate Natural logarithm (only numbers between 0.1 and 2 are allowed) \n"+
							"option 2: Calculate Sine (only numbers between -35 and 35 are allowed)\n"+
							"option 3: exit");
					options=us.nextInt();
					us.nextLine();
            switch(options){
                case 1:
	
				do{
						System.out.println("You selected the natural logarithm, do you want to continue?");
								continued=us.nextLine();
					if (continued.equalsIgnoreCase("yes")==true){
						options=number1;
						validoption=false;
					}else{
						if(continued.equalsIgnoreCase("no")==true){
							options=0;
							validoption=false;
						}
						else{
							System.out.println("Invalid answer");
							options=0;
						}
					}	
                    break;
                }while (validoption==true);
                    break;

                case 2:
				
					do{
						System.out.println("You have selected the sine function, do you want to continue?");
								continued=us.nextLine();
					if (continued.equalsIgnoreCase("yes")==true){
						options=2;
						validoption=false;
					}else{
						if(continued.equalsIgnoreCase("no")==true){
							options=0;
							validoption=false;
						}
						else{
							System.out.println("Invalid answer");
								options=0;
						}
					}	
                }while (validoption==true);
                    break;
            
                case 3:
				
				do{
				System.out.println("You selected exit, do you wish to continue?");
								continued=us.nextLine();
					if (continued.equalsIgnoreCase("yes")==true){
						options=3;
						System.out.println("Goodbye");
						validoption=false;
					}else{
						if(continued.equalsIgnoreCase("no")==true){
							options=0;
							validoption=false;
						}
						else{
							System.out.println("Invalid answer");
								options=0;
						}
					}	
                    
                }while (validoption==true);
				break;
				default:
							System.out.println("Invalid Value.");
					break;
               
    }
	return options;
	}
	
/**
* name: power <br>
*   performs the power of a number until it reaches a given value by multiplying it by itself  <br>
* <b>pre: </b> base!=null and numberpower!=null <br>
* <b>post:  </b> return  the power of the number in a determinate value <br>
* @param base double 
* @param numberpower double
* @return result  that is an int that save the power of the number in a determinate value
*/	
		
	
/*
inputs= the number to be affected by the power (base) and the power itself (numberpower)
process= performs the power of a number until it reaches a given value by multiplying it by itself 
output= returns the power result
*/
	 public static double power (double base, double numberpower){
        double result = 1.0;
        for(double i=numberpower; i > 0; i--){
            result *= base;
        }
        return result;
    }

/**
* name: subfactorial <br>
*  performs the factorial by multiplying the expression by itself until the expression reaches 0 <br>
* <b>pre: </b> factorial!=null  <br>
* <b>post:  </b> returns the factorial of the number in a determinate value <br>
* @param factorial double 
* @return factorial that is an double that save the factorial of the number in a determinate value
*/		
	
/*
inputs= the expression to be affected by the factorial (factorial)
process= performs the factorial by multiplying the expression by itself until the expression reaches 0
outputs=returns the factorial 
*/
    public static double subfactorial (double factorial){
        for(double e = factorial-1; e > 0; e--){
            factorial*=e;
        }
        return factorial;
    }
	
/**
* name: main <br>
*  read the number to calculate and direct the sub-processes <br>
* <b>pre: </b> <br>
* <b>post: </b> direct the sub-processes based in a determinate value <br>
*@param args
*/		
	
/*
inputs= the number to calculate (value)
process=read the number to calculate and direct the sub-processes 
outputs= show nothing
*/
    public static void main(String[] args){
			
			int options=0;
			double value=0.0;
		do{
				options= menu(options);
		if (options==1){
			System.out.println("Enter the number to calculate");
				value=us.nextDouble();
			if (value>0 && value<=2){
				ln(value);
			}else{
			System.out.println("out-of-range value");
			}
		}
		
		if (options==2){
			System.out.println("Enter the number to calculate");
				value=us.nextDouble();
			if (value>=-35 && value<=35){
				sen(value);
			}else{
				System.out.println("out-of-range value");
			}
			
		}
			
		}while(options<3);
		
    } 
   
}