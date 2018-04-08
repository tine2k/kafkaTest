package net.tine2k.kafka.consumer.config;

import net.tine2k.kafka.consumer.input.StreamConsumer;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding({StreamConsumer.class})
public class StreamConfig {
}
