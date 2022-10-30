/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author chaitanya
 */
public class CreateHospital {
    
    private String HospitalName;
    Housing housing;
    private int HospNo;
    
    
    public CreateHospital(String HospitalName,Housing housing,int HospNo)
    {
            this.HospitalName = HospitalName;
            this.housing = housing;
            this.HospNo = HospNo;
    }

    public int getHospNo() {
        return HospNo;
    }

    public void setHospNo(int HospNo) {
        this.HospNo = HospNo;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }
     public Housing getHousing() {
        return housing;
    }

    public void setHousing(Housing housing) {
        this.housing = housing;
    }
    

   

    
    
   @Override
    public String toString(){
        return HospitalName;
    }
    
    
}
