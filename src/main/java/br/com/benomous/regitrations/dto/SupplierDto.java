package br.com.benomous.regitrations.dto;

import br.com.benomous.regitrations.domains.enums.PersonType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public record SupplierDto(UUID id,
                          String fullName,
                          String tradeName,
                          PersonType type,
                          String identifierSupplierCode,
                          String generalRegistryCode,
                          LocalDate generalRegistryCodeIssuingDate,
                          String generalRegistryIssuingAuthority,
                          boolean active,
                          LocalDateTime createAt,
                          LocalDateTime updateAt,
                          String address,
                          String phoneNumber,
                          String email,
                          String note
) {
}
