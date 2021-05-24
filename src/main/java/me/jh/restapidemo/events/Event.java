package me.jh.restapidemo.events;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
@Entity
public class Event {

    @Id
    @GeneratedValue
    private Long id;

    private String name; // 이름

    private String description; // 설명

    private LocalDateTime beginEnrollmentDateTime; // 이벤트 등록 시간

    private LocalDateTime closeEnrollmentDateTime; // 이벤트 닫은 시간

    private LocalDateTime beginEventDateTime; // 이벤트 시작 일시

    private LocalDateTime endEventDateTime; // 이벤트 종료 일시

    private String location; // 위치 (없으면 온라인 모임)

    private int basePrice; // 참가비

    private int maxPrice; // 참가비

    private int limitOfEnrollment; // 최대 참가 인원

    private boolean offline;

    private boolean free;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private EventStatus eventStatus = EventStatus.DRAFT;

    public void update() {
        this.free = this.basePrice == 0 && this.maxPrice == 0;
        this.offline = this.location != null && !this.location.isBlank();
    }

}
