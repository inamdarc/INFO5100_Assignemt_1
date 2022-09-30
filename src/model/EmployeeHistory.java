/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.util.ArrayList;

/**
 *
 * @author chaitanya
 */
public class EmployeeHistory {
    
    private ArrayList<Employee> history;
    
    public EmployeeHistory(){
    
        this.history = new ArrayList<Employee>();
       
    
    }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
    
    public Employee addNewRecord(){
        
        Employee newRecord = new Employee();
        history.add(newRecord);
        return newRecord;
        
    }
    
    /**
     *
     * @param e
     */
    public void deleteRecords(Employee e){
    
        history.remove(e);
        
    }
    
    
}
