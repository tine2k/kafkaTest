package net.tine2k.kafka.producer.output;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface StreamProducer {

    @Output("ticksOutput")
    MessageChannel ticksOutput();
}
