package org.example.API.solidWay.Controllers;

import com.google.gson.Gson;
import org.example.API.solidWay.DTO.TranscriptRequest;
import org.example.API.solidWay.Utils.Constant;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;

public class TranscriptRequestController {


    public static HttpRequest createTranscriptPostRequest(Gson gson, TranscriptRequest transcriptRequest) throws URISyntaxException {

        String jsonRequest = gson.toJson(transcriptRequest);

        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(new URI("https://api.assemblyai.com/v2/transcript"))
                .header("Authorization", Constant.API_KEY)
                .POST(HttpRequest.BodyPublishers.ofString(jsonRequest))
                .build();

        return postRequest;
    }

    public static HttpRequest getTranscriptIdRequest(TranscriptRequest transcriptRequest) throws URISyntaxException {
        return HttpRequest.newBuilder()
                .uri(new URI("https://api.assemblyai.com/v2/transcript/" + transcriptRequest.getId()))
                .header("Authorization", Constant.API_KEY)
                .build();
    }

}
