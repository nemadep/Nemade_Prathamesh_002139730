/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment04;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author prathameshnemade
 */
public class Patient extends Person {

    public static int PATIENT_ID = 1000;

    public Person personDetails;
    public EncounterHistory allVisitsHistory;
    public VitalSigns vitalSigns;
    public int patientIdentifier;
    
    public Patient() {
        allVisitsHistory = new EncounterHistory();
    }

}
