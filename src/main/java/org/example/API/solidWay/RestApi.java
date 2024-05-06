package org.example.API.solidWay;

import com.google.gson.Gson;
import org.example.API.solidWay.Controllers.TranscriptRequestController;
import org.example.API.solidWay.Controllers.TranscriptResponseController;
import org.example.API.solidWay.DTO.TranscriptRequest;
import org.example.API.solidWay.DTO.TranscriptResponse;
import org.example.API.solidWay.Utils.Constant;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import static org.example.API.solidWay.Utils.Constant.AUDIO_URL;
import static org.example.API.solidWay.Utils.Constant.PROCESSING;

public class RestApi {
    public static void main(String[] args) {
        try {
            HttpClient httpClient = HttpClient.newHttpClient();
            TranscriptResponse transcriptResponse = new TranscriptResponse();
            TranscriptRequest transcriptRequest = new TranscriptRequest();
            transcriptRequest.setAudio_url(AUDIO_URL);
            Gson gson = new Gson();

            HttpRequest postRequest = TranscriptRequestController.createTranscriptPostRequest(gson, transcriptRequest);
            HttpResponse<String> postResponse = httpClient.send(postRequest, BodyHandlers.ofString());

            transcriptRequest = gson.fromJson(postResponse.body(), TranscriptRequest.class);
            HttpRequest getIdRequest = TranscriptRequestController.getTranscriptIdRequest(transcriptRequest);

            while (PROCESSING) {
                HttpResponse<String> getResponse = httpClient.send(getIdRequest, BodyHandlers.ofString());
                transcriptResponse = gson.fromJson(getResponse.body(), TranscriptResponse.class);

                showStatusOfTranscript(transcriptResponse);
                if (transcriptCompletedOrError(transcriptResponse)) {
                    break;
                }
                Thread.sleep(1000);
            }
            showResult(transcriptResponse);
        } catch (URISyntaxException | IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean transcriptCompletedOrError(TranscriptResponse transcriptResponse) {
        return "completed".equals(transcriptResponse.getStatus()) || "error".equals(transcriptResponse.getStatus());
    }

    private static void showStatusOfTranscript(TranscriptResponse transcriptResponse) {
        System.out.println("Status: " + transcriptResponse.getStatus());
    }

    private static void showResult(TranscriptResponse transcriptResponse) {
        if (!"error".equals(transcriptResponse.getStatus())) {
            System.out.println("Transcription Completed");
            System.out.println(transcriptResponse.getText());
        } else {
            System.out.println("Transcription Error");
        }
    }
}
