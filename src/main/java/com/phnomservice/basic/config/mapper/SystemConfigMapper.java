package com.phnomservice.basic.config.mapper;

import com.phnomservice.basic.config.domain.SystemConfig;
import com.phnomservice.basic.config.dto.SystemConfigDTO;
import com.phnomservice.persistence.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SystemConfigMapper extends EntityMapper<SystemConfigDTO, SystemConfig> {
}