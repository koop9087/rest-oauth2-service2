package by.agsr.restoauth2service.task;

import by.agsr.restoauth2service.model.Patient;
import lombok.extern.slf4j.Slf4j;
import net.minidev.json.JSONObject;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

@Slf4j
public class EntityCreateTask {

    private static final String CLIENT_ID = "customsecurity";
    private static final String TOKEN_URL = "http://localhost:8080/realms/agsr/protocol/openid-connect/token";
    private static final String API_URL = "http://localhost:8081/agsr/api/patients";
    private static final Random RANDOM = new Random();
    private static final String CLIENT_SECRET = "2Cn1N6P9I7r2a4dV6f8h0J3l5n7Q9r2t";

    public static void main(String[] args) {
        String accessToken = getAccessToken();
        if (accessToken != null) {
            generatePatients(accessToken);
        } else {
            log.info("Ошибка при получении токена безопасности");
        }
    }

    private static String getAccessToken() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> map= new LinkedMultiValueMap<>();
        map.add("client_id", CLIENT_ID);
        map.add("username", "sidorovIvan");
        map.add("password", "sidorov");
        map.add("client_secret", CLIENT_SECRET);
        map.add("grant_type", "password");

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);

        RestTemplate restTemplate = new RestTemplate();
        JSONObject response = restTemplate.postForEntity(TOKEN_URL, request, JSONObject.class).getBody();
        return response != null ? (String) response.get("access_token") : "";
    }

    private static void generatePatients(String accessToken) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(accessToken);

        for (int i = 0; i < 100; i++) {
            Patient patient = new Patient();
            patient.setId(UUID.randomUUID().toString());
            patient.setName("Patient number = " + i);
            patient.setGender("male");
            patient.setBirthDate(new Date());

            HttpEntity<Patient> request = new HttpEntity<>(patient, headers);

            ResponseEntity<Patient> response = restTemplate.postForEntity(API_URL, request, Patient.class);

            if (response.getStatusCode().is2xxSuccessful() && response.getBody() != null) {
                log.info("Пациент успешно создан с id " + response.getBody().getId());
            } else {
                log.info("Не получилось создать пациента " + i);
            }
        }
    }
}