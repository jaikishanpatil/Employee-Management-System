public class Atten {
     public int EmployeeID;
    public String EmployeeDepartment,NameOfEmployee,DateOfBirth,Date;
    
    public Atten(int EmployeeID, String EmployeeDepartment, String NameOfEmployee, String DateOfBirth, String Date)
    {
    this.EmployeeID=EmployeeID;
    this.EmployeeDepartment=EmployeeDepartment;
    this.NameOfEmployee=NameOfEmployee;
    this.DateOfBirth=DateOfBirth;
    this.Date=Date;
   
    
    
    
    }

    Atten(int Int, String string0, String string1, String string2, String string3, String string4, String string5, String string6) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    Atten(int aInt, String string, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    public int getEmployeeID(){
    return EmployeeID;
    }
    
     public String  EmployeeDepartment(){
    return EmployeeDepartment;
     }
      public String  NameOfEmployee(){
    return NameOfEmployee;
     }
       public String  DateOfBirth(){
    return DateOfBirth;
     }
        public String  Date(){
    return Date;
     }

    
}
