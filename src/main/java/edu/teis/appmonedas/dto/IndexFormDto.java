package edu.teis.appmonedas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndexFormDto {
    private float importe;
    private String divisaOrigen;
    private String divisaDestino;

}
