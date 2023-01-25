package database.tables;

import mainClasses.TemporaryEmployee;
import database.DB_Connection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EditTemporaryEmployee extends TemporaryEmployee {

    public void createTemporaryEmployeetable() throws SQLException, ClassNotFoundException {

        Connection con = DB_Connection.getConnection();
        Statement stmt = con.createStatement();
        String query = "CREATE TABLE temporaryemployee"
                + "( IBAN char(12) not null, "
                + " Fullname char(100) default null, "
                + " Address char(100) default null, "
                + " Telephone int(10) default null, "
                + " BankName char(100) default null, "
                + " Department char(100) default null, "
                + " startingDate char(100) default null, "
                + " EmployeeType char(9) default null, "
                + " Married tinyint(1) default null, "
                + " Payment int(60) default null, "
                + " PaymentDate DATE default null, "
                + " startingContractDate DATE default null, "
                + " endingContractDate DATE default null, "
                + "PRIMARY KEY (IBAN))";

        stmt.execute(query);
        stmt.close();
    }

    public void addnewTemporaryEmployee(TemporaryEmployee tempemployee) throws ClassNotFoundException{
        try {
            Connection con = DB_Connection.getConnection();

            Statement stmt = con.createStatement();

            String insertQuery = "INSERT INTO "
                    + " temporaryemployee (IBAN,FullName, Address, Telephone, BankName, Department, startingDate, EmployeeType, Married"
                    + "Payment, PaymentDate, startingContractDate, endingContractDate)"
                    + " VALUES ("
                    + "'" + tempemployee.getIBAN() + "',"
                    + "'" + tempemployee.getFullName() + "',"
                    + "'" + tempemployee.getAddress() + "',"
                    + "'" + tempemployee.getTelephone() + "',"
                    + "'" + tempemployee.getBankName() + "',"
                    + "'" + tempemployee.getDepartment() + "',"
                    + "'" + tempemployee.getstartingDate() + "',"
                    + "'" + tempemployee.getEmployeeType() + "',"
                    + "'" + tempemployee.getMarried() + "',"
                    + "'" + tempemployee.getPayment() + "',"
                    + "'" + tempemployee.getPaymentDate()+ "'"
                    + "'" + tempemployee.getstartingContractDate()+ "'"
                    + "'" + tempemployee.getendingContractDate()+ "'"
                    + ")";
            //stmt.execute(table);
            System.out.println(insertQuery);
            stmt.execute(insertQuery);
            System.out.println("# The temporary employee was successfully added in the database.");

            /* Get the member id from the database and set it to the member */
            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(EditTemporaryEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteTemporaryEmployee(TemporaryEmployee tempemployee) throws ClassNotFoundException{
        try {
            Connection con = DB_Connection.getConnection();

            Statement stmt = con.createStatement();

            String ibantemp = getIBAN();

            String insertQuery = "DROP FROM temporaryemployee WHERE iban=ibantemp";
            //stmt.execute(table);
            System.out.println(insertQuery);
            stmt.executeUpdate(insertQuery);
            System.out.println("# The temporary employee was successfully deleted in the database.");

            /* Get the member id from the database and set it to the member */
            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(EditTemporaryEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
