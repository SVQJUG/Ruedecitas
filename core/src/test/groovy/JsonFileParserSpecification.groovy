import com.svqjug.java.ruedecitas.domain.Event
import com.svqjug.java.ruedecitas.JsonFileParser
import spock.lang.Specification
import spock.lang.Subject

class JsonFileParserSpecification extends Specification{

    @Subject
    JsonFileParser jsonFileParser = new JsonFileParser()

    def 'Should parse a file properly'() {
        given:
        List<Event> events = jsonFileParser.parse(new File("core/src/test/resources/events.json"))

        expect:
        events.size() == 3
    }
}
