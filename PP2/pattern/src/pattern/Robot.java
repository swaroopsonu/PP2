package pattern;

public class Robot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1=3,i2=4;
		String i3="2-2-E";
		String i4=" R M L M L M R M ";
		Robot obj=new Robot();
		String res=obj.moveRobot(i1,i2,i3,i4);
		System.out.println("the result is : "+res);

	}//end of main
	
	public String moveRobot(int input1,int input2, String input3,String input4)
	{
		String str1=input3.replaceAll("-","");
		String str2=input4.replaceAll(" ","");
		str1.trim();
		str2.trim();
        char ch[]=str2.toCharArray();
		int x1=Character.getNumericValue(str1.charAt(0));
		int y1=Character.getNumericValue(str1.charAt(1));
		char D=str1.charAt(2);
		String result = "";
		int flag=0;
		if((x1>=0 && y1>=0)&& (x1<=input1 && y1<=input2) && flag==0)
		{
			for(int i=0 ; i<str2.length();i++)
			{
				//if((x1>=0 && y1>=0 )&& (x1<=input1 && y1<=input2) && flag==0)
				//{
					switch(ch[i])
					{
					 case 'R':
					      {
					    	  if(D=='E')
					    	  {
					    		  D='S';
					    	  }
					    	  else if(D=='W')
					    	  {
					    		 D='N';  
					    	  }
					    	  else if(D=='N')
					    	  {
					    		  D='E';
					    	  }
					    	  else
					    	  {
					    		  D='W';
					    	  }
					       }//END OF CASE R
					      break;
					      
					 case 'L':
					      {
					    	  if(D=='E')
					    	  {
					    		  D='N';
					    	  }
					    	  else if(D=='W')
					    	  {
					    		 D='S';  
					    	  }
					    	  else if(D=='N')
					    	  {
					    		  D='W';
					    	  }
					    	  else
					    	  {
					    		  D='E';
					    	  }
					       }//end of case L
					      break;
					      
					 case 'M':
					       {
					    	    if(D=='E')
						    	  {
						    		  x1++;
						    		  if(x1>input1)
						    		  {
						    			  flag=1;
						    			  x1--;
						    		  }
						    	  }
						    	  else if(D=='W')
						    	  {
						    		 x1-- ;
						    		 if(x1<0)
						    		 {
						    			 flag=1;
						    			 x1++;
						    			
						    		 }
						    	  }
						    	  else if(D=='N')
						    	  {
						    		  y1++;
						    		  if(y1>input2)
						    		  {
						    			  flag=1;
						    			  y1--;
						    			
						    		  }
						    	  }
						    	  else
						    	  {
						    		  y1--;
						    		  if(y1<0)
							    		 {
							    			 flag=1;
							    			 y1++;
							    		 }
						    	  }
						 
					       }//end of case M
					       break;
					       case 'm':
					       {
					    	    if(D=='E')
						    	  {
						    		  x1+=2;
						    		  if(x1>input1)
						    		  {
						    			  flag=1;
						    			  x1-=2;
						    		  }
						    	  }
						    	  else if(D=='W')
						    	  {
						    		 x1-=2 ;
						    		 if(x1<0)
						    		 {
						    			 flag=1;
						    			 x1+=2;
						    			
						    		 }
						    	  }
						    	  else if(D=='N')
						    	  {
						    		  y1+=2;
						    		  if(y1>input2)
						    		  {
						    			  flag=1;
						    			  y1-=2;
						    			
						    		  }
						    	  }
						    	  else
						    	  {
						    		  y1-=2;
						    		  if(y1<0)
							    		 {
							    			 flag=1;
							    			 y1+=2;
							    		 }
						    	  }
						 
					       }//end of case m
					       break;
					   default:
						   break;
					    	   
					 
					}//end of switch
					
				//}// end of if
				/*else
				{
					flag=1;
					break;
				}*/
				
				
			}//end of for loop
			
		}//end of if
		
		if(flag==0)
		{
			result=x1+"-"+y1+"-"+D;
		}
		else if(flag==1)
		{
			result=x1+"-"+y1+"-"+D+"-"+"ER";
		}
		return result;
	}// end of moveRobot

}//end of class
