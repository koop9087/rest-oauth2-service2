package by.agsr.restoauth2service.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@Schema(description = "Модель данных для предоставлении сведений о пациенте")
@JsonPropertyOrder({"id", "name", "gender", "birthDate"})
public class PatientDto {

    @Schema(description = "id пациента")
    @JsonProperty("id")
    String id;

    @Schema(description = "Имя пациента")
    @JsonProperty("name")
    String name;

    @Schema(description = "Пол пациента")
    @JsonProperty("gender")
    String gender;

    @Schema(description = "Дата рождения пациента")
    @JsonProperty("birthDate")
    String birthDate;

}
