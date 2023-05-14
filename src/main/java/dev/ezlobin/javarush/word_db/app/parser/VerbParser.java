package dev.ezlobin.javarush.word_db.app.parser;

public class VerbParser extends AbstractParser implements Parser{
    @Override
    protected String getWord(String[] argumentsArray) {
        return argumentsArray[0];
    }

    @Override
    protected String getTranslation(String[] argumentsArray) {
        return argumentsArray[1];
    }

    @Override
    protected String getModule(String[] argumentsArray) {
        return argumentsArray[2];
    }
}
