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
public class PersonDIGType {
    private ArrayList<DIGType> digList = new ArrayList();
    
    public PersonDIGType() {
        digList = new ArrayList<>();
    }
    
    public enum DIGType{
        DIAG_A("DIAG_A"),
        DIAG_B("DIAG_B"),
        DIAG_C("DIAG_C"),
        DIAG_DR("DIAG_DR"),
        DIAG_DBQ1("DIAG_DBQ1");
        
        private String value;
        private DIGType(String value){
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

    public ArrayList<DIGType> getDigList() {
        return digList;
    }
    
    public ArrayList<String> getDigValuesList() {
        ArrayList<String> digValuesList = new ArrayList<String>();
        for(DIGType h : this.digList) {
            digValuesList.add(h.getValue());
        }
        
        return digValuesList;
    }

    public void setDigList(ArrayList<DIGType> digList) {
        this.digList = digList;
    }
    
    public void addDIG(DIGType digType) {
        
        for(DIGType t : this.getDigList()) {
            if(t.getValue().equals(digType.getValue())) {
                System.out.println("DIGType already in patient's DIG List");
                return;
            }
        }
        
        this.getDigList().add(digType);
    }
    
    public void updateDIGlist(String digList) {
        this.digList = new ArrayList<DIGType>();
        try {
            for(String digType: digList.split(",")) {
                this.digList.add(DIGType.valueOf(digType.trim()));
            }
        }
        catch (Exception e){
            System.out.println(e);
            this.digList.add(DIGType.valueOf(digList));
        }
//        return this;
//        return this;
//        return this;
//        return this;
    }
    
    public void removeDIG(DIGType digType) {

        this.getDigList().remove(digType);
    }
    
    public static PersonDIGType createDIG(String digList) {
        PersonDIGType pDIG = new PersonDIGType();
        pDIG.updateDIGlist(digList);
        return pDIG;
    }
    
}
