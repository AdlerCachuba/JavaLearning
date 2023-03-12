package org.example.API.tutorial;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class RestApiTutorial {
    public static void main(String[] args) {

        try {
            Transcript transcript = new Transcript();
            transcript.setAudio_url("https://bit.ly/3yxKEIY");

            Gson gson = new Gson();
            String jsonRequest = gson.toJson(transcript);
            System.out.println(jsonRequest);

            HttpRequest postRequest = HttpRequest.newBuilder()
                    .uri(new URI("https://api.assemblyai.com/v2/transcript"))
                    .header("Authorization", Constant.API_KEY)
                    .POST(HttpRequest.BodyPublishers.ofString(jsonRequest))
                    .build();

            HttpClient httpClient = HttpClient.newHttpClient();
            HttpResponse<String> postResponse = httpClient.send(postRequest, BodyHandlers.ofString());
            System.out.println(postResponse.body());

            transcript = gson.fromJson(postResponse.body(), Transcript.class);
            System.out.println(transcript.getId());

            HttpRequest getRequest = HttpRequest.newBuilder()
                    .uri(new URI("https://api.assemblyai.com/v2/transcript/" + transcript.getId()))
                    .header("Authorization", Constant.API_KEY)
                    .GET() //get é o padrão, se não colocar nada já é o Get.
                    .build();


            while (true) {
                HttpResponse<String> getResponse = httpClient.send(getRequest, BodyHandlers.ofString());
                transcript = gson.fromJson(getResponse.body(), Transcript.class);

                System.out.println(transcript.getStatus());
                if ("completed".equals(transcript.getStatus()) || "error".equals(transcript.getStatus())) {
                    break;
                }
                Thread.sleep(1000);
            }


            System.out.println("Transcription Completed");
            System.out.println(transcript.getText());

        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


}
