package mainClasses;

public class Employee {
    String FullName;
    int IBAN;
    String Address;
    String BankName;
    String Department;
    String startingDate;
    String EmployeeType;
    String PaymentDate;
    int Telephone, Payment;
    boolean Married;

    public String getFullName() {
        return FullName;
    }

    public void setFullname(int Fullname) {
        this.FullName = FullName;
    }

    public int getIBAN() {
        return IBAN;
    }

    public void setIBAN(int IBAN) {
        this.IBAN = IBAN;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getstartingDate() {
        return startingDate;
    }

    public void setstartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public String getEmployeeType() {
        return EmployeeType;
    }

    public void setEmployeeType(String EmployeeType) {
        this.EmployeeType = EmployeeType;
    }


    public String getPaymentDate() {
        return PaymentDate;
    }

    public void setPaymentDate(String PaymentDate) {
        this.PaymentDate = PaymentDate;
    }

    public int getTelephone() {
        return Telephone;
    }

    public void setTelephone(int Telephone) {
        this.Telephone = Telephone;
    }

    public int getPayment() {
        return Payment;
    }

    public void setPayment(int Payment) {
        this.Payment = Payment;
    }

    public boolean getMarried() {
        return Married;
    }

    public void setPayment(boolean Married) {
        this.Married = Married;
    }
}