package com.company;

public class AutoPolicy {

    private int accountNumber; // Αριθμός ασφαλιστηρίου
    private String makeAndModel; // Ασφαλισμένο αυτοκίνητο
    private String state; // Σύντμηση πολιτείας δυο γραμμάτων

    // Συνάρτηση δημιουργίας
    public AutoPolicy(int accountNumber, String makeAndModel, String state){

        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    // Ορίζει το accountNumber
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    // Επιστρέφει το accountNumber
    public int getAccountNumber()
    {
        return accountNumber;
    }

    // Ορίζει το makeAndModel
    public void setMakeAndModel(String makeAndModel)
    {
        this.makeAndModel = makeAndModel;
    }

    // Επιστρέφει το makeAndModel
    public String getMakeAndModel()
    {
        return makeAndModel;
    }

    // Ορίζει την πολιτεία
    public void setState(String state)
    {
        this.state = state;
    }

    // Επιστρέφει την πολιτεία
    public String getState()
    {
        return state;
    }

    // Μέθοδος κατηγόρημα που επιστρέφει αν η πολιτεία υποστηρίζει την αποζημίωση
    public boolean isNoFaultState()
    {
        boolean noFaultState;

        // Προσδιορίζει αν η πολιτεία υποστηρίζει την αποζημίωση
        switch (getState()) // Παίρνει τη σύντμηση της πολιτείας του αντικειμένου AutoPolicy
        {
            case "MA": case "NA": case "NY": case "PA" :
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }

        return noFaultState;
    }
} // Τέλος της κλάσης AutoPolicy
