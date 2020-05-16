import com.mapper.comparison.converter.*;
import com.mapper.comparison.model.dto.ComplexRecord;
import com.mapper.comparison.model.dto.SimpleRecord;
import com.mapper.comparison.model.entity.ComplexEntity;
import com.mapper.comparison.model.entity.SimpleEntity;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConverterTest extends AbstractConverterTest {

    @Test
    void when_use_map_struct_converter_for_simple_model(){
        Converter converter = MapStructConverter.CONVERTER;

        SimpleRecord simpleRecord = simpleBuilder.buildRecord();
        SimpleRecord convertedRecord = converter.toRecord(converter.toEntity(simpleRecord));
        assertThat(convertedRecord).isEqualTo(simpleRecord);

        SimpleEntity simpleEntity = simpleBuilder.buildEntity();
        SimpleEntity convertedEntity = converter.toEntity(converter.toRecord(simpleEntity));
        assertThat(simpleEntity).isEqualTo(convertedEntity);
    }

    @Test
    void when_use_map_struct_converter_for_complex_model(){
        Converter converter = MapStructConverter.CONVERTER;

        ComplexRecord complexRecord = complexBuilder.buildRecord();
        ComplexRecord convertedRecord = converter.toRecord(converter.toEntity(complexRecord));
        assertThat(convertedRecord).isEqualTo(complexRecord);

        ComplexEntity complexEntity = complexBuilder.buildEntity();
        ComplexEntity convertedEntity = converter.toEntity(converter.toRecord(complexEntity));
        assertThat(complexEntity).isEqualTo(convertedEntity);
    }

    @Test
    void when_use_jmapper_converter_for_simple_model(){
        Converter converter = new JMapperConverter();

        SimpleRecord simpleRecord = simpleBuilder.buildRecord();
        SimpleRecord convertedRecord = converter.toRecord(converter.toEntity(simpleRecord));
        assertThat(convertedRecord).isEqualTo(simpleRecord);

        SimpleEntity simpleEntity = simpleBuilder.buildEntity();
        SimpleEntity convertedEntity = converter.toEntity(converter.toRecord(simpleEntity));
        assertThat(simpleEntity).isEqualTo(convertedEntity);
    }

    @Test
    void when_use_jmapper_converter_for_complex_model(){
        Converter converter = new JMapperConverter();

        ComplexRecord complexRecord = complexBuilder.buildRecord();
        ComplexRecord convertedRecord = converter.toRecord(converter.toEntity(complexRecord));
        assertThat(convertedRecord).isEqualTo(complexRecord);

        ComplexEntity complexEntity = complexBuilder.buildEntity();
        ComplexEntity convertedEntity = converter.toEntity(converter.toRecord(complexEntity));
        assertThat(complexEntity).isEqualTo(convertedEntity);
    }

    @Test
    void when_use_dozer_converter_for_simple_model(){
        Converter converter = new DozerConverter();

        SimpleRecord simpleRecord = simpleBuilder.buildRecord();
        SimpleRecord convertedRecord = converter.toRecord(converter.toEntity(simpleRecord));
        assertThat(convertedRecord).isEqualTo(simpleRecord);

        SimpleEntity simpleEntity = simpleBuilder.buildEntity();
        SimpleEntity convertedEntity = converter.toEntity(converter.toRecord(simpleEntity));
        assertThat(simpleEntity).isEqualTo(convertedEntity);
    }

    @Test
    void when_use_dozer_converter_for_complex_model(){
        Converter converter = new DozerConverter();

        ComplexRecord complexRecord = complexBuilder.buildRecord();
        ComplexRecord convertedRecord = converter.toRecord(converter.toEntity(complexRecord));
        assertThat(convertedRecord).isEqualTo(complexRecord);

        ComplexEntity complexEntity = complexBuilder.buildEntity();
        ComplexEntity convertedEntity = converter.toEntity(converter.toRecord(complexEntity));
        assertThat(complexEntity).isEqualTo(convertedEntity);
    }

    @Test
    void when_use_model_mapper_converter_for_simple_model(){
        Converter converter = new ModelMapperConverter();

        SimpleRecord simpleRecord = simpleBuilder.buildRecord();
        SimpleRecord convertedRecord = converter.toRecord(converter.toEntity(simpleRecord));
        assertThat(convertedRecord).isEqualTo(simpleRecord);

        SimpleEntity simpleEntity = simpleBuilder.buildEntity();
        SimpleEntity convertedEntity = converter.toEntity(converter.toRecord(simpleEntity));
        assertThat(simpleEntity).isEqualTo(convertedEntity);
    }

    @Test
    void when_use_model_mapper_converter_for_complex_model(){
        Converter converter = new ModelMapperConverter();

        ComplexRecord complexRecord = complexBuilder.buildRecord();
        ComplexRecord convertedRecord = converter.toRecord(converter.toEntity(complexRecord));
        assertThat(convertedRecord).isEqualTo(complexRecord);

        ComplexEntity complexEntity = complexBuilder.buildEntity();
        ComplexEntity convertedEntity = converter.toEntity(converter.toRecord(complexEntity));
        assertThat(complexEntity).isEqualTo(convertedEntity);
    }
}
