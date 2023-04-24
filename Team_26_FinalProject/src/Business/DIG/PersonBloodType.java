/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DIG;

import java.util.ArrayList;

/**
 *
 * @author anchitha
 */
public class PersonBloodType {
    private ArrayList<BloodType> digList = new ArrayList();
    
    public PersonBloodType() {
        digList = new ArrayList<>();
    }
    
    public enum BloodType{
        A("A"),
        B("B"),
        AB("AB"),
        O("O");
        
        private String value;
        private BloodType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public ArrayList<BloodType> getDigList() {
        return digList;
    }
    
    public ArrayList<String> getDigValuesList() {
        ArrayList<String> digValuesList = new ArrayList<String>();
        for(BloodType h : this.digList) {
            digValuesList.add(h.getValue());
        }
        
        return digValuesList;
    }

    public void setDigList(ArrayList<BloodType> digList) {
        this.digList = digList;
    }
    
    public void addDIG(BloodType digType) {
        
        for(BloodType t : this.getDigList()) {
            if(t.getValue().equals(digType.getValue())) {
                System.out.println("DIGType already in patient's DIG List");
                return;
            }
        }
        
        this.getDigList().add(digType);
    }
    
    public void updateDIGlist(String digList) {
        this.digList = new ArrayList<BloodType>();
        try {
            for(String digType: digList.split(",")) {
                this.digList.add(BloodType.valueOf(digType.trim()));
            }
        }
        catch (Exception e){
            System.out.println(e);
            this.digList.add(BloodType.valueOf(digList));
        }
//        return this;
//        return this;
//        return this;
//        return this;
    }
    
    public void removeDIG(BloodType digType) {

        this.getDigList().remove(digType);
    }
    
    public static PersonBloodType createDIG(String digList) {
        PersonBloodType pDIG = new PersonBloodType();
        pDIG.updateDIGlist(digList);
        return pDIG;
    }
    
}
