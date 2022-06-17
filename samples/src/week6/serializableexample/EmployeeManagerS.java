package week6.serializableexample;

import week6.Employee;
import week6.EmployeeManager;

import java.io.*;
import java.util.ArrayList;

public class EmployeeManagerS extends EmployeeManager {

    public static final String EMP_FILENAME = "employees.bin";

    private static EmployeeManagerS ems;

    private EmployeeManagerS() {

        // Deserialization
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(EMP_FILENAME);
            ObjectInputStream in = new ObjectInputStream(file);

            // TODO: deserialization of object
            employees = (ArrayList<Employee>) in.readObject();


            in.close();
            file.close();
            System.out.println("Object has been deserialized ");
        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
    }

    private void saveToSerFile(){
        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(EMP_FILENAME);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // TODO: serialization of object
            out.writeObject(employees);


            out.close();
            file.close();

            System.out.println("Object has been serialized");

        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
    }

    @Override
    public void addEmployee(Employee employee) {
        super.addEmployee(employee);
        saveToSerFile();
    }



    public static EmployeeManagerS getInstance(){
        if (ems == null){
            ems = new EmployeeManagerS();
        }
        return ems;
    }


    public static void main(String[] args) {
        EmployeeManagerS ems = EmployeeManagerS.getInstance();
        EmployeeManagerS ems2 = EmployeeManagerS.getInstance();
        EmployeeManagerS ems3 = EmployeeManagerS.getInstance();
        System.out.println(ems == ems2);
        System.out.println(ems == ems3);

    }
}
