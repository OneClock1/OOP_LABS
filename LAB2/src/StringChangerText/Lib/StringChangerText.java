package StringChangerText.Lib;

public class StringChangerText {
    protected StringBuilder text;

    public StringChangerText(String text){
        this.text = new StringBuilder(text);
    }
    public String getInsertLineAfterNumber(int number, String line){
        return text.insert(text.indexOf(String.valueOf(number)) + 1,line).toString();
    }
    public String getText(){
        return text.toString();
    }

}
