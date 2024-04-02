package AbstractClass.document;

public class Documents {

    public static void main(String[] args) {
Document d=new PDFDocument("Java",30);
d.display();
d.documentType();
d=new ImageDocument(1080,"Java Pic");
d.display();
d.documentType();
d=new TextDocument(500,"Android");
d.display();
d.documentType();
    }
}
