package me.jh.restapidemo.events;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EventDto {

    @NotEmpty
    private String name; // 이름

    @NotEmpty
    private String description; // 설명

    @NotNull
    private LocalDateTime beginEnrollmentDateTime; // 이벤트 등록 시간

    @NotNull
    private LocalDateTime closeEnrollmentDateTime; // 이벤트 닫은 시간

    @NotNull
    private LocalDateTime beginEventDateTime; // 이벤트 시작 일시

    @NotNull
    private LocalDateTime endEventDateTime; // 이벤트 종료 일시

    private String location; // 위치 (없으면 온라인 모임)

    @Min(0)
    private int basePrice; // 참가비

    @Min(0)
    private int maxPrice; // 참가비

    @Min(0)
    private int limitOfEnrollment; // 최대 참가 인원

}
