/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.business;

/**
 *
 * @author Sandiso
 */
public class personProcessor {
    private person person;

    public personProcessor(person person) {
        this.person = person;
    }
    
    public String determineTitle(){
        String title="Ms.";
        
        if (Character.toUpperCase(person.getGender().charAt(0))=='M'){
            title="Mr.";
        }
        return title;
    }
    
    public String determineAge(){
        String tokens[]=person.getDob().split("-");
        int birthYear=Integer.parseInt(tokens[0]);
        Integer age = 2024-birthYear;
        
        
        return  age.toString();
    }
    
}
