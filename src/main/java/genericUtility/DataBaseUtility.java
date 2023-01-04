package genericUtility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseUtility {
      Connection con=null;
	public String excuteQueryGetData(String query,int columnindex,String expdata) throws SQLException
	{
		boolean flag=false;
		
		ResultSet result = con.createStatement().executeQuery(query);
		while(result.next())
		{
		//	 data = result.getString(columnindex);
		//	if(data.equalsIgnoreCase(expdata))
			if(result.getString(columnindex).equalsIgnoreCase(expdata))
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("-------data verfied");
			return expdata;
		}
		else
		{
			System.out.println("----data not verfied ");
			return "";
		}
}
}
