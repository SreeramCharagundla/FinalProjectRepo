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
    
    public Organization createLegalOrganization(Organization.LegalType legalType, String realName){
        Organization organization = null;
        if (legalType.getValue().equals(Organization.LegalType.LegalOfficer.getValue())){
            organization = new InsuranceOfficerOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
    
     public Organization createLiverOrganization(Organization.LiverBankType liverBankType, String realName){
        Organization organization = null;
        if (liverBankType.getValue().equals(Organization.LiverBankType.LiverBank.getValue())){
            organization = new Blood_Bank_Organization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
     
     public Organization createCirrhosisCentreOrganization(Organization.CirrhosisCentreType cirrhosisType, String realName){
        Organization organization = null;
        if (cirrhosisType.getValue().equals(Organization.CirrhosisCentreType.CirrhosisCentre.getValue())){
            organization = new Thalassemia_Centre_Organization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
     
      public Organization createGovernmentOrganization(Organization.GovernmentType govtType, String realName){
        Organization organization = null;
        if (govtType.getValue().equals(Organization.GovernmentType.Government.getValue())){
            organization = new NGOOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
     
}
