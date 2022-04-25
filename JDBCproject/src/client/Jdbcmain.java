package client;
import service.ServiceImp;

public class Jdbcmain{
	public static void main(String[] args) throws Exception{
		ServiceImp obj=new ServiceImp();
		obj.dbConnection();
		obj.updateSalary();
	}
}