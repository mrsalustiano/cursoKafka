package br.mrsalustiano.jsonconsumer.model;


import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Payment implements Serializable {

    private Long id;
    private Long idUser;
    private Long idProduct;
    private String cardNumber;

}
