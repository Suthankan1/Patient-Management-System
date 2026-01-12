package suthankan.patientservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import suthankan.patientservice.dto.PatientResponseDTO;
import suthankan.patientservice.mapper.PatientMapper;
import suthankan.patientservice.model.Patient;
import suthankan.patientservice.repository.PatientRepository;

import java.util.List;

@Service
public class PatientService {

    private PatientRepository patientRepository;

    public List<PatientResponseDTO> getPatients(){
        List<Patient> patients = patientRepository.findAll();

        List<PatientResponseDTO> patientResponseDTOS =
                patients.stream().map(PatientMapper::toDTO).toList();

        return patientResponseDTOS;
    }
}
