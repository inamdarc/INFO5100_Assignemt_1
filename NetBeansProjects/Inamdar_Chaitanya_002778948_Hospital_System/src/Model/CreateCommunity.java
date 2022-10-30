/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author chaitanya
 */
public class CreateCommunity {
    
    Housing housing;
    
    public CreateCommunity(Housing housing)
    {
        this.housing = housing;
    
    }

    public Housing getHousing() {
        return housing;
    }

    public void setHousing(Housing housing) {
        this.housing = housing;
    }
    
    @Override
    public String toString(){
        return housing.getCommunityName();
    }
}
