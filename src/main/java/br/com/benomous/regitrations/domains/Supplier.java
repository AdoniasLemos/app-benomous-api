package br.com.benomous.regitrations.domains;

import br.com.benomous.regitrations.domains.enums.PersonType;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String fullName;

    private String tradeName;

    private PersonType type;

    private String identifierSupplierCode;

    private String generalRegistryCode;

    private LocalDate generalRegistryCodeIssuingDate;

    private String generalRegistryIssuingAuthority;

    private boolean active;

    private LocalDateTime createAt;

    private LocalDateTime updateAt;

    private String address;

    private String phoneNumber;

    private String email;

    private String note;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public PersonType getType() {
        return type;
    }

    public void setType(PersonType type) {
        this.type = type;
    }

    public String getIdentifierSupplierCode() {
        return identifierSupplierCode;
    }

    public void setIdentifierSupplierCode(String identifierSupplierCode) {
        this.identifierSupplierCode = identifierSupplierCode;
    }

    public String getGeneralRegistryCode() {
        return generalRegistryCode;
    }

    public void setGeneralRegistryCode(String generalRegistryCode) {
        this.generalRegistryCode = generalRegistryCode;
    }

    public LocalDate getGeneralRegistryCodeIssuingDate() {
        return generalRegistryCodeIssuingDate;
    }

    public void setGeneralRegistryCodeIssuingDate(LocalDate generalRegistryCodeIssuingDate) {
        this.generalRegistryCodeIssuingDate = generalRegistryCodeIssuingDate;
    }

    public String getGeneralRegistryIssuingAuthority() {
        return generalRegistryIssuingAuthority;
    }

    public void setGeneralRegistryIssuingAuthority(String generalRegistryIssuingAuthority) {
        this.generalRegistryIssuingAuthority = generalRegistryIssuingAuthority;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
