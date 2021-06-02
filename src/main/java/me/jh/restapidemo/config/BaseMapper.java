package me.jh.restapidemo.config;

import org.mapstruct.MappingTarget;

public interface BaseMapper<E, D> {

    E toEntity(D dto);

    void toEntity(D dto, @MappingTarget E entity);

    D toDto(E entity);

}
