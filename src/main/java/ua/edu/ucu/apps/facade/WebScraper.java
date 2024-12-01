package ua.edu.ucu.apps.facade;

import org.json.JSONObject;
import java.io.IOException;
import okhttp3.*;

public class WebScraper {
    private static final String OPENAI_API_KEY = "your_openai_api_key_here";

    public JSONObject scrapeCompanyData(String website) throws IOException {
        String scrapedData = scrapeWebsite(website);
        String parsedData = useChatGPT(scrapedData);
        return new JSONObject(parsedData);
    }

    private String scrapeWebsite(String website) {
        String scrapedText = "Scraped data from " + website;
        return scrapedText;
    }

    private String useChatGPT(String text) throws IOException {
        OkHttpClient client = new OkHttpClient();

        JSONObject json = new JSONObject()
            .put("model", "text-davinci-003")
            .put("prompt", "Extract company information from the following text:\n" + text)
            .put("max_tokens", 500);

        RequestBody body = RequestBody.create(
            json.toString(),
            MediaType.parse("application/json; charset=utf-8")
        );

        Request request = new Request.Builder()
            .url("https://api.openai.com/v1/completions")
            .post(body)
            .addHeader("Authorization", "Bearer " + OPENAI_API_KEY)
            .addHeader("Content-Type", "application/json")
            .build();

        Response response = client.newCall(request).execute();
        String responseBody = response.body().string();
        JSONObject responseJson = new JSONObject(responseBody);

        String generatedText = responseJson
            .getJSONArray("choices")
            .getJSONObject(0)
            .getString("text")
            .trim();

        return generatedText;
    }
}