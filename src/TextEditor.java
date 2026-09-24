public class TextEditor {
    //a
    private StringBuilder text = new StringBuilder();
    //c
    TextEditor(){

    }
    //m
    public void insert(String textIn, int position){
        text.insert(position,textIn);
    }
    public void remove(int position, int length){
        text.delete(position, position + length);
    }
    public String getText(){
        return text.toString();
    }
}
