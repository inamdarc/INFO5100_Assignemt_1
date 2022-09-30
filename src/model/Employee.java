package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chaitanya
 */
public class Employee {
    
    private String Name;
    private String Employee_ID;
    private String Age;
    private String Gender;
    private String Start_Date;
    private String Level;
    private String Team_Info;
    private String Position_Title;
    private String Cell_Phone_Number;
    private String Email_Address;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmployee_ID() {
        return Employee_ID;
    }

    public void setEmployee_ID(String Employee_ID) {
        this.Employee_ID = Employee_ID;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getStart_Date() {
        return Start_Date;
    }

    public void setStart_Date(String Start_Date) {
        this.Start_Date = Start_Date;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public String getTeam_Info() {
        return Team_Info;
    }

    public void setTeam_Info(String Team_Info) {
        this.Team_Info = Team_Info;
    }

    public String getPosition_Title() {
        return Position_Title;
    }

    public void setPosition_Title(String Position_Title) {
        this.Position_Title = Position_Title;
    }

    public String getCell_Phone_Number() {
        return Cell_Phone_Number;
    }

    public void setCell_Phone_Number(String Cell_Phone_Number) {
        this.Cell_Phone_Number = Cell_Phone_Number;
    }

    public String getEmail_Address() {
        return Email_Address;
    }

    public void setEmail_Address(String Email_Address) {
        this.Email_Address = Email_Address;
    }
    
    @Override
    public String toString(){
        return Name;
    }

}  