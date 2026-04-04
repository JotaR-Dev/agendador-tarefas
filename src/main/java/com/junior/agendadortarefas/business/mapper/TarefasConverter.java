package com.junior.agendadortarefas.business.mapper;

import com.junior.agendadortarefas.business.dto.TarefasDTO;
import com.junior.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefasEntity (TarefasDTO dto);

    TarefasDTO paraTarefasDTO(TarefasEntity entity);

    List<TarefasEntity> paraListaTarefasEntity(List<TarefasDTO> dtos);

    List<TarefasDTO> paraTarefasDTO(List<TarefasEntity> entities);

}
