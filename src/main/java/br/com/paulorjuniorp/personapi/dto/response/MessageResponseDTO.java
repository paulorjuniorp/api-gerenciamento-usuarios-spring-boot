package br.com.paulorjuniorp.personapi.dto.response;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.AssertFalse;

@Builder
@Data
public class MessageResponseDTO {
    private String message;
}
