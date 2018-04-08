package net.tine2k.kafka.producer.config;

import net.tine2k.kafka.producer.output.StreamProducer;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding({StreamProducer.class})
public class StreamConfig {
}
