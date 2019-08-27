public class StringBuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Intialize String
			String info = "";
			
			// Build onto string
			
			info += "My Name is Bob";
			info += " ";
			info += " I am a builder";
			
			System.out.println(info);

			//String builder 
			StringBuilder sb =  new StringBuilder();
			//Append text 
			sb.append("My Name is Sue.");
			sb.append(" ");
			sb.append("I am a Lion tamer.");
			
			//output
			System.out.println(sb.toString());
		}
}
