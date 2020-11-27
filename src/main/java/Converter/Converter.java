package Converter;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author 1851594 王思桐
 * @param <T>   Source class
 * @param <U>   Dest. class
 */
public class Converter<T, U> {

    private final Function<T, U> fromDto;
    private final Function<U, T> fromEntity;

    /**
     * Constructor.
     *
     * @param fromDto    Function that converts given dto entity into the domain entity.
     * @param fromEntity Function that converts given domain entity into the dto entity.
     */
    public Converter(final Function<T, U> fromDto, final Function<U, T> fromEntity) {
        this.fromDto = fromDto;
        this.fromEntity = fromEntity;
    }

    /**
     * Converts DTO to Entity.
     *
     * @param dto DTO entity
     * @return The domain representation - the result of the converting function application on dto
     *     entity.
     */
    public final U convertFromDto(final T dto) {
        return fromDto.apply(dto);
    }

    /**
     * Converts Entity to DTO.
     *
     * @param entity domain entity
     * @return The DTO representation - the result of the converting function application on domain
     *     entity.
     */
    public final T convertFromEntity(final U entity) {
        return fromEntity.apply(entity);
    }

    /**
     * Converts list of DTOs to list of Entities.
     *
     * @param dtos collection of DTO entities
     * @return List of domain representation of provided entities retrieved by mapping each of them
     *     with the conversion function
     */
    public final List<U> createFromDtos(final Collection<T> dtos) {
        return dtos.stream().map(this::convertFromDto).collect(Collectors.toList());
    }

    /**
     * Converts list of Entities to list of DTOs.
     *
     * @param entities collection of domain entities
     * @return List of domain representation of provided entities retrieved by mapping each of them
     *     with the conversion function
     */
    public final List<T> createFromEntities(final Collection<U> entities) {
        return entities.stream().map(this::convertFromEntity).collect(Collectors.toList());
    }

}
