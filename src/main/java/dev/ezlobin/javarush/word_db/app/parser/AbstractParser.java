package dev.ezlobin.javarush.word_db.app.parser;

import dev.ezlobin.javarush.word_db.app.word.Word;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractParser {
    private static final String SYMBOL_DELIMMETER = "-";
    public List<Word> parse(List<String> source){
        return source.stream()
                .map(this::parseLine)
                .collect(Collectors.toList());
    }

    private Word parseLine(String line){
        String[] argumentsArray = line.split(SYMBOL_DELIMMETER);
        String word = getWord(argumentsArray);
        String translation = getTranslation(argumentsArray);
        String module = getModule(argumentsArray);
        return new Word(word, translation, module);
    }

    protected abstract String getWord(String[] argumentsArray);
    protected abstract String getTranslation(String[] argumentsArray);
    protected abstract String getModule(String[] argumentsArray);


}
