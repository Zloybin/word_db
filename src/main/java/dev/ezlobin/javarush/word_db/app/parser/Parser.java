package dev.ezlobin.javarush.word_db.app.parser;

import dev.ezlobin.javarush.word_db.app.word.Word;

import java.util.List;

public interface Parser {
    List<Word> parse(List<String> source);
}
