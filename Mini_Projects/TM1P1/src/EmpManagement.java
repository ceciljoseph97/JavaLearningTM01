
public class EmpManagement {

	public static void main(String[] args) {
		String [][] emDetails={{"1001","Ashish","01/04/2019","e","R&D","20000","8000","3000"},
				{"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"},
				{"1003","Rahul","12/11/2018","k","Acct","10000","8000","1000"},
				{"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"},
				{"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},
				{"1006","Suman","01/01/2000","e","Manufacturing","23000","9000","4400"},
				{"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"}};
				String [][] DA= {{"e","Engineer","20000"},{"c","Consultant","32000"},{"k","Clerk","12000"},{"r","Receptionist","15000"},{"m","Manager","40000"}};
				//int a=Integer.parseInt(args[0]);
				String userInput= args[0];
				int pos=0;
				boolean flag=false;
				for(int i=0 ;i<emDetails.length;i++) {
					if(emDetails[i][0].equals(userInput)) {
						flag=true;
						pos=i;
						}
				}
				if(flag!=true)
					System.out.printf("There is no Employee with empid %s",args[0]);
				else {
					int salary=0;
					String DeptName="";
					for(int i=0;i<DA.length;i++) {
						if(DA[i][0].equals(emDetails[pos][3])) {
							salary=Integer.parseInt(DA[i][2]);
							DeptName=DA[i][1];
							break;
							}
					}
				salary=salary+Integer.parseInt(emDetails[pos][5])+Integer.parseInt(emDetails[pos][6]) -Integer.parseInt(emDetails[pos][7]);
				System.out.println("Emp No\tEmp Name\tDepartment\tDesignation\tSalary");
				System.out.printf("%s\t%S\t\t%s\t\t%s\t\t%d",args[0],emDetails[pos][1],emDetails[pos][4],DeptName,salary);
				}


	}

}
