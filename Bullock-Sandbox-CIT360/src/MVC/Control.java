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
public class Control {
   private Model model;
   private View view;

   public Control(Model model, View view){
      this.model = model;
      this.view = view;
   }

   public void setName(String name){
      model.setName(name);		
   }

   public String getStudentName(){
      return model.getName();		
   }

   public void setStudentRollNo(String rollNo){
      model.setRollNo(rollNo);		
   }

   public String getStudentRollNo(){
      return model.getRollNo();		
   }

   public void updateView(){				
      view.printDetails(model.getName(), model.getRollNo());
   }
}