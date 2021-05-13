package me.jh.restapidemo.events;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EventTest {

    @Test
    public void builder() {
        Event event = Event.builder()
                .name("Test event")
                .description("event class builder test")
                .build();
        assertThat(event).isNotNull();
    }

    @Test
    public void javaBean() {
        String name = "Event";
        String description = "test";

        Event event = new Event();
        event.setName(name);
        event.setDescription(description);

        assertThat(event.getName()).isEqualTo(name);
        assertThat(event.getDescription()).isEqualTo(description);
    }

}
