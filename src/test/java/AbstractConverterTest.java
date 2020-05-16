import com.mapper.comparison.bulder.ComplexBuilder;
import com.mapper.comparison.bulder.SimpleBuilder;
import com.github.javafaker.Faker;

public abstract class AbstractConverterTest {

    private Faker faker = Faker.instance();
    protected SimpleBuilder simpleBuilder = new SimpleBuilder(faker);
    protected ComplexBuilder complexBuilder = new ComplexBuilder(faker, simpleBuilder);
}
