 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

/**
 *
 * @author chaitanya
 */
public class CreatePersonHistory {
    
    private ArrayList<CreatePerson> createPersonHistory;
    
    public CreatePersonHistory(){
    
        this.createPersonHistory = new ArrayList<CreatePerson>();
       
    
    }

    public ArrayList<CreatePerson> getHistory() {
        return createPersonHistory;
    }

    public void setHistory(ArrayList<CreatePerson> createPersonHistory) {
        this.createPersonHistory = createPersonHistory;
    }
    
    public CreatePerson addNewPerson(){
        
        CreatePerson newRecord = new CreatePerson();
        createPersonHistory.add(newRecord);
        return newRecord;
        
    }
    
    /**
     *
     * @param e44
     */
    public void deleteRecords(CreatePerson e){
    
        createPersonHistory.remove(e);
        
    }
    
    
    
    public CreatePerson updateNewRecord(){
        
        CreatePerson updateRecord = new CreatePerson();
        createPersonHistory.replaceAll((UnaryOperator<CreatePerson>) updateRecord);
        return updateRecord;
        
    }
      
    
    
    
    
    
    
}
