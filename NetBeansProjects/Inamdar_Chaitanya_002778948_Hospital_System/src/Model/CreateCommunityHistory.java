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
public class CreateCommunityHistory {
    
    private ArrayList<CreateCommunity> createCommunityHistory;
    
    public CreateCommunityHistory(){
    
        this.createCommunityHistory = new ArrayList<CreateCommunity>();
       
    
    }

    public ArrayList<CreateCommunity> getCommHistory() {
        return createCommunityHistory;
    }

    public void setCommHistory(ArrayList<CreateCommunity> createCommunityHistory) {
        this.createCommunityHistory = createCommunityHistory;
    }
    
    public CreateCommunity addNewComm(){
         Housing housing= new Housing();
        CreateCommunity newCommRecord = new CreateCommunity(housing);
        createCommunityHistory.add(newCommRecord);
        return newCommRecord;
        
    }
    
    /**
     *
     * @param index
     */
    public void deleteCommRecords(int index){
    
        createCommunityHistory.remove(index);
        
    }
    
}
