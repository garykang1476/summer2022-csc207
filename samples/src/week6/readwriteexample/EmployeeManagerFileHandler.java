package week6.readwriteexample;

import week6.Employee;
import week6.EmployeeManager;

import java.io.*;

public class EmployeeManagerFileHandler {

    public static final String EMP_FILENAME = "employees.txt";


    public EmployeeManager readEMFile(String fileName){

        EmployeeManager em = new EmployeeManager();

        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            Employee emp;
            String[] s;

            while ((line = bufferedReader.readLine()) != null){
                s = line.split(",");
                emp = new Employee(s[0], Integer.parseInt(s[1]));
                em.addEmployee(emp);
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return em;
    }

    public void saveEmployeeManager(EmployeeManager em, String fileName) throws IOException {

        FileWriter writer = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        for(Employee emp: em){
            bufferedWriter.write(emp.getName() + "," + emp.getSalary().toString());
            bufferedWriter.newLine();

        }
        bufferedWriter.close();
        writer.close();

    }


    public static void main(String[] args){

        EmployeeManagerFileHandler emfh = new EmployeeManagerFileHandler();
        EmployeeManager em = emfh.readEMFile(EMP_FILENAME);
        System.out.println(em);
        em.addEmployee(new Employee("Martin", 3000));
        em.addEmployee(new Employee("JoJo", 100));
        try {
            emfh.saveEmployeeManager(em, EMP_FILENAME);
        } catch (IOException e) {
            System.err.println("File is not saved");
        }

    }

}
