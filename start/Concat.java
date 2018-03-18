package create.sql.concatinator
public class Concat {
public static void main (String args [] )
{

	String sql = "Insert Into Users (name, email, pass, address)";

//	sql += " values ('" + user + "'";
	sql = sql + " values ('" + "Swapan" + "'";
//  In the above code multiple string objects are created, as String is 
//	immutable.
//	Whereas only the final object are in use. and object creation take more time thereby 
//	performance will be bad.
	System.out.println(sql);
	
//	StringBuilder is the solution for the same.
	StringBuilder sqlSB = new StringBuilder("Insert Into Users (name, email, pass, address)");
	sqlSB.append(" values ('" + "Swapan" + "')");
	System.out.println(sqlSB);
	
}
}
