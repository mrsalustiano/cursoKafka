package br.mrsalustiano.strproducer.resouces;

import br.mrsalustiano.strproducer.services.StringProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/producer")

public class StringProducerResource {

    private final StringProducerService service;

    @PostMapping
    public ResponseEntity<?> sendMessage(@RequestBody String message) {

        service.sendMessage(message);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }
}
