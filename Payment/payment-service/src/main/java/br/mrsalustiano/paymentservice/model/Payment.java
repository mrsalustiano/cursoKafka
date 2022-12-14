package br.mrsalustiano.paymentservice.model;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {

    private Long id;
    private Long idUser;
    private Long idProduct;
    private String cardNumber;

}
