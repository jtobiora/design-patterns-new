package com.swiftfingers.chain1;

public class TextFileHandler implements Handler {
    private Handler handler;
    private String handlerName;
    public TextFileHandler(String handlerName){
        this.handlerName = handlerName;
    }
    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    //checks the file type if the file type is text, it
   // processes it or it forwards it to the next handler.
    @Override
    public void process(File file) {
        if(file.getFileType().equals("text")){
            System.out.println("Process and saving text file... by "+ handlerName);
        }else if(handler!=null){
            System.out.println(handlerName+" fowards request to "+handler.getHandlerName());
            handler.process(file);
        }else{
            System.out.println("File not supported");
        }
    }
    @Override
    public String getHandlerName() {
        return handlerName;
    }
}
