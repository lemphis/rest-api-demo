package me.jh.restapidemo.config;

public interface BaseMapper<E, D> {

    E toEntity(D dto);

    D toDto(E entity);

}
