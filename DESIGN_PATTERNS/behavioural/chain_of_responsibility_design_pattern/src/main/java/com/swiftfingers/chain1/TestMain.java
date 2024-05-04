package com.swiftfingers.chain1;


/*
* In the test, first we created different handlers and chained them. The chain starts from the text handler,
* which is used to process text files, to the doc handler and so on, till the last handler, the image handler.
* Then we created different file objects and passed it to the text handler. If the file can be processed by the text
* handler it does that, otherwise it forwards the file to the next chained handler. You can see in the output how the
* requested file was forwarded by the chained objects until it reached the appropriate handler.
* Also, please note down, we have not created a handler to process a bat file. So, it passes through all the handlers
* and results in the output - "File not supported".
*
*
* */
public class TestMain {
    public static void main(String[] args) {
        File file = null;

        Handler textHandler = new TextFileHandler("Text Handler");
        Handler docHandler = new DocFileHandler("Doc Handler");
        Handler excelHandler = new ExcelFileHandler("Excel Handler");
        Handler audioHandler = new AudioFileHandler("Audio Handler");
        Handler videoHandler = new VideoFileHandler("Video Handler");
        Handler imageHandler = new ImageFileHandler("Image Handler");

        textHandler.setHandler(docHandler);
        docHandler.setHandler(excelHandler);
        excelHandler.setHandler(audioHandler);
        audioHandler.setHandler(videoHandler);
        videoHandler.setHandler(imageHandler);

        file = new File("Abc.mp3", "audio", "C:");
        textHandler.process(file);
        file = new File("Abc.jpg", "video", "C:");
        textHandler.process(file);
        file = new File("Abc.doc", "doc", "C:");
        textHandler.process(file);
        file = new File("Abc.bat", "bat", "C:");
        textHandler.process(file);
    }
}
