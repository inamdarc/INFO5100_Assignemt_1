/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author chaitanya
 */
public class CreateHospitalHistory {
    
    private ArrayList<CreateHospital> createHospitalHistory;
    
    public CreateHospitalHistory(){
    
        this.createHospitalHistory = new ArrayList<CreateHospital>();
       
    
    }

    public ArrayList<CreateHospital> getHospHistory() {
        return createHospitalHistory;
    }

    public void setHospHistory(ArrayList<CreateHospital> createHospitalHistory) {
        this.createHospitalHistory = createHospitalHistory;
    }
    
    public CreateHospital addNewHosp(){
         Housing housing= new Housing();
        CreateHospital newHospRecord = new CreateHospital("",housing,0);
        createHospitalHistory.add(newHospRecord);
        return newHospRecord;
        
    }
    
    /**
     *
     * @param index
     */
    public void deleteHospRecords(int index){
    
        createHospitalHistory.remove(index);
        
    }
    
    
    
   
    
}
