package test;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import test.model.Input;
import test.model.Output;

@Mapper
public interface SimpleMapper {
    @Mapping(target = "value")
    Output to(Input in);
}
