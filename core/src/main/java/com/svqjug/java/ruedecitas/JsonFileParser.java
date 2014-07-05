package com.svqjug.java.ruedecitas;

import com.svqjug.java.ruedecitas.domain.Event;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class JsonFileParser {

    public List<Event> parse(final File file) {
        ObjectMapper mapper = new ObjectMapper();
        List<Event> events = Collections.emptyList();
        try {
            events = mapper.readValue(file, new TypeReference<List<Event>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return events;
    }

}
