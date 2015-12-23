package test;

import org.junit.Test;
import org.mapstruct.factory.Mappers;
import test.model.Input;

import static org.junit.Assert.assertEquals;

public class UnitTest {
    @Test
    public void run() {
        final SimpleMapper mapper = Mappers.getMapper(SimpleMapper.class);
        final Input in = new Input();
        in.setValue("test");
        assertEquals("ok", mapper.to(in).getValue());
    }
}
