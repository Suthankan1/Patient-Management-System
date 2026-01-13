package suthankan.patientservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientRequestDTO {
    @NotBlank
    @Size(max = 100, message = "You cannot exceed 100.")
    private String name;

    @NotBlank(message = "Email is required.")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "address is required")
    private String address;

    @NotBlank(message = "Date of birth required")
    private String dateOfBirth;

    @NotBlank(message = "Registered date is required.")
    private String registeredDate;
}
