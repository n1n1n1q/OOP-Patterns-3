package ua.edu.ucu.apps.facade;

import org.json.JSONObject;
import java.io.IOException;
import okhttp3.*;

public class BrandfetchAPI {
    private static final String API_KEY = "your_brandfetch_api_key_here";

    public JSONObject getCompanyData(String website) throws IOException {
        OkHttpClient client = new OkHttpClient();

        HttpUrl url = new HttpUrl.Builder()
            .scheme("https")
            .host("api.brandfetch.io")
            .addPathSegment("v2")
            .addPathSegment("brands")
            .addQueryParameter("domain", website)
            .build();

        Request request = new Request.Builder()
            .url(url)
            .get()
            .addHeader("Authorization", "Bearer " + API_KEY)
            .build();

        Response response = client.newCall(request).execute();
        String responseBody = response.body().string();

        return new JSONObject(responseBody);
    }
}