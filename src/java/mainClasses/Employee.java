package mainClasses;

public class Employee {
    String FullName;
    String IBAN;
    String Address;
    String BankName;
    String Department;
    String startingDate;
    String EmployeeType;
    int Payment, Married, Kids;
    long Telephone;

    public String getFullName() {
        return FullName;
    }

    public void setFullname(String FullName) {
        this.FullName = FullName;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
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

    /*public String getPaymentDate() {
        return PaymentDate;
    }

    public void setPaymentDate(String PaymentDate) {
        this.PaymentDate = PaymentDate;
    }*/

    public long getTelephone() {
        return Telephone;
    }

    public void setTelephone(long Telephone) {
        this.Telephone = Telephone;
    }

    public int getPayment() {
        return Payment;
    }

    public void setPayment(int Payment) {
        this.Payment = Payment;
    }

    public int getMarried() {
        return Married;
    }

    public void setMarried(int Married) {
        this.Married = Married;
    }

    public int getKids(){
        return Kids;
    }

    public void setKids(int kids){
        this.Kids = kids;
    }
}