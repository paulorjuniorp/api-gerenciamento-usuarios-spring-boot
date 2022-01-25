package br.com.paulorjuniorp.personapi.dto.request;

import br.com.paulorjuniorp.personapi.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto implements Serializable {

    private Long id;

    @NotEmpty
    @Size(min = 2,max = 50)
    private String firstName;

    @NotEmpty
    @Size(min = 2,max = 50)
    private String lastName;

    @NotEmpty
    private String cpf;

    private LocalDate birthDate;

    @NotEmpty
    @Valid
    private List<PhoneDto> phones;

}
