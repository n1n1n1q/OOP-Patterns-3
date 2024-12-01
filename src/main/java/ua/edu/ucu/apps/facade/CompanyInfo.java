package ua.edu.ucu.apps.facade;

import org.json.JSONObject;

public class CompanyInfo {
    private JSONObject pdlData;
    private JSONObject webData;
    private JSONObject brandfetchData;

    public void setPdlData(JSONObject pdlData) {
        this.pdlData = pdlData;
    }

    public void setWebData(JSONObject webData) {
        this.webData = webData;
    }

    public void setBrandfetchData(JSONObject brandfetchData) {
        this.brandfetchData = brandfetchData;
    }

    @Override
    public String toString() {
        return "CompanyInfo{" +
                "pdlData=" + pdlData +
                ", webData=" + webData +
                ", brandfetchData=" + brandfetchData +
                '}';
    }
}