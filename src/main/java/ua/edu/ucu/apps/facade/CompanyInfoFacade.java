// CompanyInfoFacade.java
package ua.edu.ucu.apps.facade;

import org.json.JSONObject;
import java.io.IOException;

public class CompanyInfoFacade {
    private PDLReader pdlReader;
    private WebScraper webScraper;
    private BrandfetchAPI brandfetchAPI;

    public CompanyInfoFacade() {
        pdlReader = new PDLReader();
        webScraper = new WebScraper();
        brandfetchAPI = new BrandfetchAPI();
    }

    public CompanyInfo getCompanyInfo(String website) throws IOException {
        CompanyInfo companyInfo = new CompanyInfo();

        // Get data from PDL
        JSONObject pdlData = pdlReader.getCompanyData(website);
        companyInfo.setPdlData(pdlData);

        // Get data from web scraping + ChatGPT
        JSONObject webData = webScraper.scrapeCompanyData(website);
        companyInfo.setWebData(webData);

        // Get data from Brandfetch
        JSONObject brandfetchData = brandfetchAPI.getCompanyData(website);
        companyInfo.setBrandfetchData(brandfetchData);

        return companyInfo;
    }
}