/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author BULLOJP
 */
public class Demo {
   public static void main(String[] args) {

      //fetch student record based on his roll no from the database
      Model model  = retriveFromDatabase();

      //Create a view : to write student details on console
      View view = new View();

      Control controller = new Control(model, view);

      controller.updateView();

      //update model data
      controller.setName("John");

      controller.updateView();
   }

   private static Model retriveFromDatabase(){
      Model student = new Model();
      student.setName("Robert");
      student.setRollNo("10");
      return student;
   }
}
