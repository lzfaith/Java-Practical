package com.zhelin.model;

public class Duties {

    // Duties: title, ID
    private String dutiesTitle;
    private String dutiesID;

    /**
     * Constructor - Duties
     * @param dutiesTitle: Duties' title
     * @param dutiesID: Duties' ID
     */
    public Duties(String dutiesTitle, String dutiesID){
        this.setTitle(dutiesTitle);
        this.setDutiesID(dutiesID);
    }

    public String getTitle() {
        return dutiesTitle;
    }

    public void setTitle(String dutiesTitle) {
        this.dutiesTitle = dutiesTitle;
    }

    public String getDutiesID() {
        return dutiesID;
    }

    public void setDutiesID(String dutiesID) {
        this.dutiesID = dutiesID;
    }
}
