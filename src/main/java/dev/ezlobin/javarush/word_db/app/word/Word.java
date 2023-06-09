package dev.ezlobin.javarush.word_db.app.word;

public class Word {

    private String  word;
    private String translation;
    private String module;

    public Word(String word, String translation, String module) {
        this.word = word;
        this.translation = translation;
        this.module = module;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}
