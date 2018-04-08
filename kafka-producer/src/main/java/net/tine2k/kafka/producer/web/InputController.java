package net.tine2k.kafka.producer.web;

import net.tine2k.kafka.producer.output.StreamProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

@RestController
@RequiredArgsConstructor
public class InputController {

    private final StreamProducer streamProducer;

    @GetMapping("/send/{number}")
    @ResponseBody
    public String receiveInput(@PathVariable("number") @NotBlank @Validated int number) throws InterruptedException {
        for (int i = 0; i < number; i++) {
            Thread.sleep(300);
            streamProducer.ticksOutput().send(MessageBuilder.withPayload(i).build());
        }
        return "" + number;
    }
}
