package net.tine2k.kafka.consumer.input;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface StreamConsumer {

    @Input("ticksInput")
    SubscribableChannel ticksInput();
}
