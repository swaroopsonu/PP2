package bracket_matching;

public class Bracket_checker {
	private String ip;
	
	public Bracket_checker(String in)
	{
		ip=in;
	}

	public void check()
	{
		int stackSize=ip.length();
		StackX s=new StackX(stackSize);
		for(int j=0;j<stackSize;j++)
		{
			char ch=ip.charAt(j);
			switch(ch)
			{
			case '{':
			case '[':
			case '(':
				s.push(ch);
				break;
				
			case '}':
			case ']':
			case ')':
				if(!s.isEmpty())
				{
					char chx=s.pop();
					if((ch=='}' && chx!='{') || (ch==']' && chx!='[') || (ch==')' && chx!='(') )
					System.out.println("Error:  "+ch+" at "+j);
				}
				else
					System.out.println("Error:  "+ch+" at "+j);
				break;
				default:
				break;
			}//end of switch
		}//end of for
	
		if(!s.isEmpty())
			System.out.println("Error: missing right delimiter");
	}//end check()
	
}//end of class Bracket_checker
