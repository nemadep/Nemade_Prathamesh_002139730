/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author prathameshnemade
 */
public class Person {

    public int profileId;
    public String name;
    public String address;
    public Date dateOfBirth;
    public int telephoneAreaCode;
    public String telephoneNumber;
    public int faxAreaCode;
    public String faxNumber;
    public String email;
    public String linkedinUrl;
    public String profilePicture;
    public Date createdAt;
    private String ssnNumber;
    private int medicalRecordNumber;
    private String healthBeneficiaryNumber;
    private int bankAccountNumber;
    private int certificateNumber;
    private String ipAddress;
    private String vehicleLicenseNumber;
    private String deviceIdentifiers;

    /**
     * @param name
     * @return
     */
    public String validateName(String name) {
        String isValid = "";
        if (name.equals("")) {
            isValid = Messages.NAME_EMPTY;
        } else if (name.length() < 2 || name.length() > 20) {
            isValid = Messages.NAME_CHARACTER_LIMIT;
        } else if (!name.matches("[a-zA-Z ]{2,20}")) {
            isValid = Messages.GENERIC_MESSAGE;
        }
        return isValid;
    }

    /**
     * @param address
     * @return
     */
    public String validateAddress(String address) {
        String isValid = "";
        if (address.equals("")) {
            isValid = Messages.ADDRESS_EMPTY;
        } else if (address.length() < 10 || address.length() > 100) {
            isValid = Messages.ADDRESS_CHARACTER_LIMIT;
        } else if (!address.matches("[a-zA-Z0-9'\\.\\-\\s\\,]{10,100}")) {
            isValid = Messages.GENERIC_MESSAGE;
        }
        return isValid;
    }

    /**
     * @param date
     * @return
     */
    public String validateDOB(String date) {
        String isValid = "";
        DateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dateFormatter.setLenient(false);
            Date dob = dateFormatter.parse(date);
            if (dob.compareTo((new Date())) > 0) {
                isValid = Messages.DOB_DATE_LARGE;
            }
        } catch (ParseException e) {
            isValid = Messages.DOB_INVALID;
        }
        return isValid;
    }

    /**
     * @param value
     * @return
     */
    public String validPhoneFax(String value) {
        String isValid = "";
        String[] tempValue = value.split("-");
        String areaCode = tempValue[0];
        String rand1 = tempValue[1];
        String rand2 = tempValue[2];
        try {
            Integer.parseInt(areaCode);
            Integer.parseInt(rand1);
            Integer.parseInt(rand2);
            if (areaCode.length() != 3 || rand1.length() != 3 || rand2.length() != 4 || areaCode.equals("000") || rand1.equals("000")) {
                isValid = Messages.GENERIC_MESSAGE;
            }
        } catch (Exception e) {
            isValid = Messages.GENERIC_MESSAGE;
        }
        return isValid;
    }

    /**
     * @param address
     * @return
     */
    public String validateEmail(String email) {
        String isValid = "";
        if (email.equals("")) {
            isValid = Messages.EMAIL_EMPTY;
        } else if (email.length() < 2) {
            isValid = Messages.EMAIL_CHARACTER_LIMIT;
        } else if (!email.matches("[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$")) {
            isValid = Messages.GENERIC_MESSAGE;
        }
        return isValid;
    }

    /**
     * @param ssn
     * @return
     */
    public String validateSSN(String ssn) {
        String isValid = "";
        String[] tempValue = ssn.split("-");
        String part1 = tempValue[0];
        String part2 = tempValue[1];
        String part3 = tempValue[2];
        try {
            int intPart1 = Integer.parseInt(part1);
            int intPart2 = Integer.parseInt(part2);
            int intPart3 = Integer.parseInt(part3);
            if ((part1 + part2 + part3).length() != 9 || part1.length() != 3 || part2.length() != 2 || part3.length() != 4) {
                isValid = Messages.SSN_CHARACTER_LIMIT;
            }
            if (intPart1 == 000 || intPart1 == 666 || (intPart1 > 900 && intPart1 < 999)) {
                isValid = Messages.GENERIC_MESSAGE;
            }
        } catch (Exception e) {
            isValid = Messages.GENERIC_MESSAGE;
        }

        return isValid;
    }

    /**
     * @param medicalNo
     * @return
     */
    public String validateMedicalNumber(String medicalNo) {
        String isValid = "";
        try {
            int intPart1 = Integer.parseInt(medicalNo);

            if (medicalNo.length() != 8) {
                isValid = Messages.MEDICAL_NUMBER_CHARACTER_LIMIT;
            }
            if (intPart1 == 0) {
                isValid = Messages.MEDICAL_NUMBER_ZERO;
            }
        } catch (Exception e) {
            isValid = Messages.MEDICAL_NUMBER_NOA;
        }

        return isValid;
    }

    /**
     * @param heahealthNolthNo
     * @return
     */
    public String validateHealthBeneficiary(String healthNo) {
        String isValid = "";
        if (healthNo.equals("")) {
            isValid = Messages.HEALTH_BENEFICIARY_EMPTY;
        } else if (healthNo.length() < 4 || healthNo.length() > 10) {
            isValid = Messages.HEALTH_BENEFICIARY_CHARCTER_LIMIT;
        } else if (!healthNo.matches("[a-zA-Z0-9]{4,10}")) {
            isValid = Messages.GENERIC_MESSAGE;
        }
        return isValid;
    }

    /**
     * @param accountNo
     * @return
     */
    public String validateBankAccount(String accountNo) {
        String isValid = "";
        try {
            int tempCertificateNo = Integer.parseInt(accountNo);
            if (accountNo.equals("")) {
                isValid = Messages.BANK_ACCOUNT_EMPTY;
            } else if (accountNo.length() != 7) {
                isValid = Messages.BANK_ACCOUNT_CHARACTER_LIMIT;
            } else if (tempCertificateNo < 1) {
                isValid = Messages.GENERIC_MESSAGE;
            }
        } catch (Exception e) {
            isValid = Messages.BANK_ACCOUNT_NOA;
        }
        return isValid;
    }

    /**
     * @param accountNo
     * @return
     */
    public String validateCertificateNo(String certificateNo) {
        String isValid = "";
        try {
            int tempCertificateNo = Integer.parseInt(certificateNo);
            if (certificateNo.equals("")) {
                isValid = Messages.CERTIFICATE_NUMBER_EMPTY;
            } else if (certificateNo.length() != 8) {
                isValid = Messages.CERTIFICATE_NUMBER_CHARACTER_LIMIT;
            } else if (tempCertificateNo < 1) {
                isValid = Messages.GENERIC_MESSAGE;
            }
        } catch (Exception e) {
            isValid = Messages.CERTIFICATE_NUMBER_NOA;
        }
        return isValid;
    }

    /**
     * @param url
     * @return
     */
    public String validateLinkedInUrl(String url) {
        String isValid = "";
        if (url.equals("")) {
            isValid = Messages.LINKEDIN_URL_EMPTY;
        } else if (url.length() < 3 || url.length() > 20) {
            isValid = Messages.LINKEDIN_URL_CHARACTER_LIMIT;
        } else if (url.contains(" ")) {
            isValid = Messages.GENERIC_MESSAGE;
        } else if (!url.matches("[a-zA-Z0-9]{4,10}")) {
            isValid = Messages.GENERIC_MESSAGE;
        }
        return isValid;
    }

    /**
     * @param url
     * @return
     */
    public String validateIP(String ip) {
        String isValid = "";
        if (ip.equals("")) {
            isValid = Messages.IP_PLATE_EMPTY;
        } else if (!ip.matches("^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)(\\.(?!$)|$)){4}$")) {
            isValid = Messages.IP_EXAMPLE;
        } else if (ip.contains(" ")) {
            isValid = Messages.GENERIC_MESSAGE;
        }
        return isValid;
    }

    /**
     * @param licenseNo
     * @return
     */
    public String validateLicensePlate(String licenseNo) {
        String isValid = "";
        if (licenseNo.equals("")) {
            isValid = Messages.LICENSE_PLATE_EMPTY;
        } else if (!licenseNo.matches("^[^+_=/*?@#$%&()'\"|â„;:{}.,`~<>}{][^\\\\]{1,20}$")) {
            isValid = Messages.GENERIC_MESSAGE;
        } else if (licenseNo.contains(" ")) {
            isValid = Messages.GENERIC_MESSAGE;
        }
        return isValid;
    }

    /**
     * @param macAddress
     * @return
     */
    public String validateDeviceIdentification(String macAddress) {
        String isValid = "";
        if (macAddress.equals("")) {
            isValid = Messages.LICENSE_PLATE_EMPTY;
        } else if (!macAddress.matches("^([[:xdigit:]]{2}[:.-]?){5}[[:xdigit:]]{2}$")) {
            isValid = Messages.GENERIC_MESSAGE;
        } else if (macAddress.contains(" ")) {
            isValid = Messages.GENERIC_MESSAGE;
        }
        return isValid;
    }

    /**
     * @param profileId the profileId to set
     */
    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @param telephoneAreaCode the telephoneAreaCode to set
     */
    public void setTelephoneAreaCode(int telephoneAreaCode) {
        this.telephoneAreaCode = telephoneAreaCode;
    }

    /**
     * @return the telephoneNumber
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * @param telephoneNumber the telephoneNumber to set
     */
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    /**
     * @param faxAreaCode the faxAreaCode to set
     */
    public void setFaxAreaCode(int faxAreaCode) {
        this.faxAreaCode = faxAreaCode;
    }

    /**
     * @return the faxNumber
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * @param faxNumber the faxNumber to set
     */
    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param linkedinUrl the linkedinUrl to set
     */
    public void setLinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
    }

    /**
     * @return the ssnNumber
     */
    public String getSsnNumber() {
        return ssnNumber;
    }

    /**
     * @param ssnNumber the ssnNumber to set
     */
    public void setSsnNumber(String ssnNumber) {
        this.ssnNumber = ssnNumber;
    }

    /**
     * @return the medicalRecordNumber
     */
    public int getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    /**
     * @param medicalRecordNumber the medicalRecordNumber to set
     */
    public void setMedicalRecordNumber(int medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    /**
     * @return the healthBeneficiaryNumber
     */
    public String getHealthBeneficiaryNumber() {
        return healthBeneficiaryNumber;
    }

    /**
     * @param healthBeneficiaryNumber the healthBeneficiaryNumber to set
     */
    public void setHealthBeneficiaryNumber(String healthBeneficiaryNumber) {
        this.healthBeneficiaryNumber = healthBeneficiaryNumber;
    }

    /**
     * @return the bankAccountNumber
     */
    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * @param bankAccountNumber the bankAccountNumber to set
     */
    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    /**
     * @return the certificateNumber
     */
    public int getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * @param certificateNumber the certificateNumber to set
     */
    public void setCertificateNumber(int certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    /**
     * @return the ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * @param ipAddress the ipAddress to set
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * @return the vehicleLicenseNumber
     */
    public String getVehicleLicenseNumber() {
        return vehicleLicenseNumber;
    }

    /**
     * @param vehicleLicenseNumber the vehicleLicenseNumber to set
     */
    public void setVehicleLicenseNumber(String vehicleLicenseNumber) {
        this.vehicleLicenseNumber = vehicleLicenseNumber;
    }

    /**
     * @return the deviceIdentifiers
     */
    public String getDeviceIdentifiers() {
        return deviceIdentifiers;
    }

    /**
     * @param deviceIdentifiers the deviceIdentifiers to set
     */
    public void setDeviceIdentifiers(String deviceIdentifiers) {
        this.deviceIdentifiers = deviceIdentifiers;
    }
}
