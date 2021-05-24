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
    public void testFree() {
        Event event = Event.builder()
                .basePrice(0)
                .maxPrice(0)
                .build();

        event.update();

        assertThat(event.isFree()).isTrue();

        event = Event.builder()
                .basePrice(100)
                .maxPrice(0)
                .build();

        event.update();

        assertThat(event.isFree()).isFalse();

        event = Event.builder()
                .basePrice(0)
                .maxPrice(100)
                .build();

        event.update();

        assertThat(event.isFree()).isFalse();
    }

    @Test
    public void testOffline() {
        Event event = Event.builder()
                .location("Naver")
                .build();

        event.update();

        assertThat(event.isOffline()).isTrue();

        event = Event.builder()
                .build();

        event.update();

        assertThat(event.isOffline()).isFalse();
    }

}
