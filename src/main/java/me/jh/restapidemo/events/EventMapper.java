package me.jh.restapidemo.events;

import me.jh.restapidemo.config.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper extends BaseMapper<Event, EventDto> {

}
