package week6.serializableExample;

import week6.Employee;
import week6.EmployeeManager;

import java.io.*;
import java.util.ArrayList;

public class EmployeeManagerS extends EmployeeManager {

    public EmployeeManagerS() {

        // Deserialization
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream("employees.bin");
            ObjectInputStream in = new ObjectInputStream(file);

            // TODO: deserialization of object



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
            FileOutputStream file = new FileOutputStream("employees.bin");
            ObjectOutputStream out = new ObjectOutputStream(file);

            // TODO: serialization of object


            out.close();
            file.close();

            System.out.println("Object has been serialized");

        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
    }


}
