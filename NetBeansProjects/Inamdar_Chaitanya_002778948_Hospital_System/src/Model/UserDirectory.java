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
public class UserDirectory {
    
    private ArrayList<CreatePerson> createSysAdminHistory;
    private ArrayList<CreatePerson> createHospAdminHistory;
    private ArrayList<CreatePerson> createCommunityAdminHistory;
    private ArrayList<CreatePerson> createDoctorAdminHistory;
    private ArrayList<CreatePerson> createPatientHistory;
            

    public ArrayList<CreatePerson> getCreateSysAdminHistory() {
        return createSysAdminHistory;
    }

    public void setCreateSysAdminHistory(ArrayList<CreatePerson> createSysAdminHistory) {
        this.createSysAdminHistory = createSysAdminHistory;
    }

    public ArrayList<CreatePerson> getCreateHospAdminHistory() {
        return createHospAdminHistory;
    }

    public void setCreateHospAdminHistory(ArrayList<CreatePerson> createHospAdminHistory) {
        this.createHospAdminHistory = createHospAdminHistory;
    }

    public ArrayList<CreatePerson> getCreateCommunityAdminHistory() {
        return createCommunityAdminHistory;
    }

    public void setCreateCommunityAdminHistory(ArrayList<CreatePerson> createCommunityAdminHistory) {
        this.createCommunityAdminHistory = createCommunityAdminHistory;
    }

    public ArrayList<CreatePerson> getCreateDoctorAdminHistory() {
        return createDoctorAdminHistory;
    }

    public void setCreateDoctorAdminHistory(ArrayList<CreatePerson> createDoctorAdminHistory) {
        this.createDoctorAdminHistory = createDoctorAdminHistory;
    }

    public ArrayList<CreatePerson> getCreatePatientHistory() {
        return createPatientHistory;
    }

    public void setCreatePatientHistory(ArrayList<CreatePerson> createPatientHistory) {
        this.createPatientHistory = createPatientHistory;
    }
    
    
    
    
    
}
