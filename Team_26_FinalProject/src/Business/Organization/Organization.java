/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.DIG.PersonBloodType;
import Business.DB4OUtil.DB4OUtil;
import Business.DIG.PersonBloodType;
import Business.EcoSystem;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author anchitha
 */
public abstract class Organization {
    
    private int organizationID;
    private String name;
    private String realName;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    
    private static int counter=0;
    private ArrayList<PersonBloodType> allDIGs;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    
    
    public enum Type{
        Admin("Admin Organization"), 
        
        SystemCoordinator("System Coorinator Organization"),
        Doctor("Doctor Organization"), 
        MedicalTechnician("MedTech Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
     public enum BloodBankType {
         
        BloodBank("Blood Bank Coordinator Organization");
        private String value;

        private BloodBankType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
     }
    
    public enum ThalassemiaCentreType {
         
        ThalassemiaCentre("Thalassemia centre coordinaor Organization");
        private String value;

        private ThalassemiaCentreType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
     }
    
    public enum NGOType {
         
        NGO("NGO Coordinator Organization");
        private String value;

        private NGOType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
     }
    
    
     public enum InsuranceType {
         
        InsuranceOfficer("Insurance Officer Organization");
        private String value;

        private InsuranceType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
     }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        System.out.println("initialise work queue");
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        allDIGs = new ArrayList<PersonBloodType>();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public ArrayList<PersonBloodType> getAllDIGs() {
        return allDIGs;
    }

    public void setAllDIGsList(ArrayList<PersonBloodType> allDIGs) {
        this.allDIGs = allDIGs;
    }
    
    public void addDIG(PersonBloodType dig) {
        this.allDIGs.add(dig);
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    
    
    
    @Override
    public String toString() {
        return name;
    }
    
    
    
}
