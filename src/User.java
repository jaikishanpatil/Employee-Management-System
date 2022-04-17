



import java.util.jar.Attributes.Name;

class User {
    
    public int EmployeeID;
    public String EmployeeDepartment,NameOfEmployee,DateOfBirth,PhoneNumber,Email,EmployeeSalary,Address,Gender;
    
    public User(int EmployeeID, String EmployeeDepartment, String NameOfEmployee, String DateOfBirth, String PhoneNumber, String Email, String EmployeeSalary, String Address, String Gender)
    {
    this.EmployeeID=EmployeeID;
    this.EmployeeDepartment=EmployeeDepartment;
    this.NameOfEmployee=NameOfEmployee;
    this.DateOfBirth=DateOfBirth;
    this.PhoneNumber=PhoneNumber;
    this.Email=Email;
    this.EmployeeSalary=EmployeeSalary;
    this.Address=Address;
    this.Gender=Gender;
    
    
    
    }

    User(int Int, String string0, String string1, String string2, String string3, String string4, String string5, String string6) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    User(int aInt, String string, String string0, String string1, String string2) {
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
        public String  PhoneNumber(){
    return PhoneNumber;
     }
           public String  Email(){
    return Email;
     }
            public String  EmployeeSalary(){
    return EmployeeSalary;
            }
              public String  Address(){
    return Address;
     }
                 public String  Gender(){
    return Gender;
     }
               
     
}

