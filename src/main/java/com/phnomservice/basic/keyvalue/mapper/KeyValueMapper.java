package com.phnomservice.basic.keyvalue.mapper;

import com.phnomservice.basic.keyvalue.domain.KeyValue;
import com.phnomservice.basic.keyvalue.dto.KeyValueDTO;
import com.phnomservice.persistence.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KeyValueMapper extends EntityMapper<KeyValueDTO, KeyValue> {
}