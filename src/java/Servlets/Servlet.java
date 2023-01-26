package Servlets;

import database.tables.EditPermanentEmployee;
import database.tables.EditTemporaryEmployee;
import mainClasses.PermanentEmployee;
import mainClasses.TemporaryEmployee;
import database.tables.Utilities;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.*;
import java.sql.*;

@WebServlet(name = "Servlets.Servlet", value = "/Servlets.Servlet")
public class Servlet extends HttpServlet{
    private static final long serialVersionUID = 1L; //https://www.codejava.net/coding/java-servlet-and-jsp-hello-world-tutorial-with-eclipse-maven-and-apache-tomcat

    public Servlet(){
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        if (request.getParameter("tstartofcontract") == null) {
            //writer.println("mphka perm");
            EditPermanentEmployee epe = new EditPermanentEmployee();
            PermanentEmployee pe = new PermanentEmployee();

            String Iban = request.getParameter("piban");
            pe.setIBAN(Iban);

            String Name = request.getParameter("pname");
            pe.setFullname(Name);

            String Address = request.getParameter("paddress");
            pe.setAddress(Address);

            String PhoneNumber = request.getParameter("pphonenumber");
            pe.setTelephone(Long.parseLong((PhoneNumber)));

            String BankName = request.getParameter("pbankname");
            pe.setBankName(BankName);

            String Department = request.getParameter("pdepartment");
            pe.setDepartment(Department);

            String StartingDate = request.getParameter("pstartingdate");
            pe.setstartingDate(StartingDate);

            String EmployeeType = request.getParameter("pemployeetype");
            pe.setEmployeeType(EmployeeType);

            int Married = Integer.parseInt(request.getParameter("pmarried"));
            pe.setMarried(Married);

            int Kids = Integer.parseInt(request.getParameter("pkids"));
            pe.setKids(Kids);

            int PaymentAmount = 0;
            if ("pemployeetype" == "Managing") {
                PaymentAmount = Utilities.calculatePayment(Integer.parseInt(request.getParameter("basicPaymentManaging")));
            }else{
                PaymentAmount = calculatePayment(Integer.parseInt(request.getParameter("basicPaymentEducational")));
            }
            pe.setPayment(PaymentAmount);


            try {
                epe.addnewPermanentEmployee(pe);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        }else{
            //writer.println("mphka temp");
            EditTemporaryEmployee ete = new EditTemporaryEmployee();
            TemporaryEmployee te = new TemporaryEmployee();

            String Iban = request.getParameter("tiban");
            te.setIBAN(Iban);

            String Name = request.getParameter("tname");
            te.setFullname(Name);

            String Address = request.getParameter("taddress");
            te.setAddress(Address);

            String PhoneNumber = request.getParameter("tphonenumber");
            te.setTelephone(Integer.parseInt(PhoneNumber));

            String BankName = request.getParameter("tbankname");
            te.setBankName(BankName);

            String Department = request.getParameter("tdepartment");
            te.setDepartment(Department);

            String StartingDate = request.getParameter("tstartingdate");
            te.setstartingDate(StartingDate);

            String EmployeeType = request.getParameter("temployeetype");
            te.setEmployeeType(EmployeeType);

            int Married = Integer.parseInt(request.getParameter("tmarried"));
            te.setMarried(Married);

            int PaymentAmount = 0;
            if ("temployeetype" == "Managing") {
                PaymentAmount = calculatePayment(Integer.parseInt(request.getParameter("basicPaymentManaging")));
            }else{
                PaymentAmount = calculatePayment(Integer.parseInt(request.getParameter("basicPaymentEducational")));
            }
            te.setPayment(PaymentAmount);

            String StartOfContract = request.getParameter("tstartofcontract");
            te.setstartingContractDate(StartOfContract);

            String EndOfContract = request.getParameter("tendofcontract");
            te.setendingContractDate(EndOfContract);

            int Kids = Integer.parseInt(request.getParameter("tkids"));
            te.setKids(Kids);


            try {
                ete.addnewTemporaryEmployee(te);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }




    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
