package Java.grundlagen.j2.labs.oop.realEstateCompany;

import java.util.ArrayList;
import java.util.List;

public class RentalAgreements {

    private int howManyDaysTillAgreementexpired;
    private int monthlyPrice;
    private String whosAgreement;
    private String agreementForEstate;
    private String agreementForApartmentNumber;
    private String agreementID;

    public RentalAgreements(int howManyDaysTillAgreementexpired, int monthlyPrice, String whosAgreement, String agreementForEstate, String agreementForApartmentNumber, String agreementID) {
        this.howManyDaysTillAgreementexpired = howManyDaysTillAgreementexpired;
        this.monthlyPrice = monthlyPrice;
        this.whosAgreement = whosAgreement;
        this.agreementForEstate = agreementForEstate;
        this.agreementForApartmentNumber = agreementForApartmentNumber;
        this.agreementID = agreementID;
    }

    public int getHowManyDaysTillAgreementexpired() {
        return howManyDaysTillAgreementexpired;
    }

    public int getMonthlyPrice() {
        return monthlyPrice;
    }

    public String getWhosAgreement() {
        return whosAgreement;
    }

    public String getAgreementForEstate() {
        return agreementForEstate;
    }

    public String getAgreementForApartmentNumber() {
        return agreementForApartmentNumber;
    }

    public String getAgreementID() {
        return agreementID;
    }

    public static List<RentalAgreements> allAgreements = new ArrayList<>();

    public static void allAgreementsMethod() {
        allAgreements.add(new RentalAgreements(365, 1500, "#1", "RS_1", "12", "AID_1"));
        allAgreements.add(new RentalAgreements(243, 4000, "#2", "RS_2", "17", "AID_2"));
        allAgreements.add(new RentalAgreements(672, 2000, "#7", "RS_3", "6", "AID_3"));
    }
}
