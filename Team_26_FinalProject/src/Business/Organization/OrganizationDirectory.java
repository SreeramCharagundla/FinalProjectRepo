/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author pravallika
 */
public class OrganizationDirectory {
      private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type, String realName){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.SystemCoordinator.getValue())){
            organization = new SystemCoordinatorOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.MedicalTechnician.getValue())){
            organization = new MedicalTechnicianOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
    
    public Organization createInsuranceOrganization(Organization.InsuranceType legalType, String realName){
        Organization organization = null;
        if (legalType.getValue().equals(Organization.InsuranceType.InsuranceOfficer.getValue())){
            organization = new InsuranceOfficerOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
    
     public Organization createBloodOrganization(Organization.BloodBankType liverBankType, String realName){
        Organization organization = null;
        if (liverBankType.getValue().equals(Organization.BloodBankType.BloodBank.getValue())){
            organization = new Blood_Bank_Organization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
     
     public Organization createThalassemiaCentreOrganization(Organization.ThalassemiaCentreType thalassemiaType, String realName){
        Organization organization = null;
        if (thalassemiaType.getValue().equals(Organization.ThalassemiaCentreType.ThalassemiaCentre.getValue())){
            organization = new Thalassemia_Centre_Organization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
     
      public Organization createNGOOrganization(Organization.NGOType ngoType, String realName){
        Organization organization = null;
        if (ngoType.getValue().equals(Organization.NGOType.NGO.getValue())){
            organization = new NGOOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
     
}
