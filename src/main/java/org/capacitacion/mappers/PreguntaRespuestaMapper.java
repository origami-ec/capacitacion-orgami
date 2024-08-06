package org.capacitacion.mappers;

import org.capacitacion.dto.PreguntaRespuestaDto;
import org.capacitacion.entidad.PreguntaRespuesta;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PreguntaRespuestaMapper {

    PreguntaRespuestaDto toDto(PreguntaRespuesta entity);

    PreguntaRespuesta toEntity(PreguntaRespuestaDto dto);

}
