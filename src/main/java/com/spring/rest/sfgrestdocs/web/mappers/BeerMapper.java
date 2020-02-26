package com.spring.rest.sfgrestdocs.web.mappers;

import com.spring.rest.sfgrestdocs.domain.Beer;
import com.spring.rest.sfgrestdocs.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
