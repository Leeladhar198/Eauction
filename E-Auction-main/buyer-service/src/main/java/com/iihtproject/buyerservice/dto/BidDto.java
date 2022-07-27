package com.iihtproject.buyerservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class BidDto {
    @NotNull
    @Size(min = 5, max = 30)
    @Schema(type = "string", example = "Leeladhar")
    private String buyerFirstName;

    @NotNull
    @Size(min = 5, max = 30)
    @Schema(type = "string", example = "Reddy")
    private String buyerLastName;

    @Schema(type = "string", example = "22/4, prakash nagr")
    private String buyerAddress;

    @Schema(type = "string", example = "kurnool")
    private String buyerCity;

    @Schema(type = "string", example = "Andhra Pradesh")
    private String buyerState;

    @Schema(type = "string", example = "518004")
    private String buyerPinCode;

    @NotNull
    @Size(min = 10, max = 10)
    @Schema(type = "string", example = "9398447321")
    private String buyerPhone;

    @NotNull
    @Email
    @Schema( type = "string", example = "leeladharreddy198@gmail.com")
    private String buyerEmail;

    @NotNull
    private String productId;

    @NotNull
    private Double bidAmount;
}
