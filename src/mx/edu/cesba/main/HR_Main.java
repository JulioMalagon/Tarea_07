/*
 Nombre: Julio Cesar Malagon Mejia
Matricula:2022944
 */
package mx.edu.cesba.main;

import javax.swing.JOptionPane;
import mx.edu.cesba.model.Employee;

public class HR_Main {
    public static void main (String[] args){
        //  Creacion de objetos
        Employee e1=new Employee();
        Employee e2=new Employee();
        
        e1.setId(1);
        
        e1.setfirstName (JOptionPane.showInputDialog("Ingrese el Nombre"));
        e1.setlastName (JOptionPane.showInputDialog("Ingrese el Apellido"));
        e1.setage (Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")));
        e1.setemail(JOptionPane.showInputDialog("Ingrese el Correo"));
        e1.setphoneNumber (Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero telefonico")));
        e1.setsalary (Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario")));
        e1.sethiredate(JOptionPane.showInputDialog("Ingrese la Fecha de Contratacion"));
        
       /* e2.id= 2;
        e2.firstName= JOptionPane.showInputDialog("Ingrese el Nombre");
        e2.lastName= JOptionPane.showInputDialog("Ingrese el Apellido");
        e2.age= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        e2.email=JOptionPane.showInputDialog("Ingrese el Correo");
        e2.phoneNumber=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero telefonico"));
        e2.salary=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));
        e2.hiredate=JOptionPane.showInputDialog("Ingrese la Fecha de Contratacion");
        */
        
     
        
        e1.getDetails();
        System.out.print("------------------------------");
        e2.getDetails();
    }
}
