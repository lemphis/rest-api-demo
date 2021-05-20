package me.jh.restapidemo;

public interface BaseMapper<E, D> {

    E toEntity(D dto);

    D toDto(E entity);

}
