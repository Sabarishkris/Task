package AbstractClass.document;

    abstract class Document {
        int count;
        String title;
        public Document(String title){
            this.title=title;
        }

        abstract void documentType();
        public void display(){
            System.out.println("Abstract Method......"+title);
        }
    }

    class PDFDocument extends Document {
        private int pageCount;
        private  String title;

        public PDFDocument(String title, int pageCount) {
            super(title);
            this.pageCount = pageCount;
            this.title=title;
        }
        @Override
        void documentType() {
            System.out.println("PDF Document");
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    class TextDocument extends Document {
        private int wordCount;
        private String title;
         TextDocument(int wordCount,String title){
             super(title);
            this.wordCount=wordCount;
            this.title=title;
        }

        @Override
        void documentType() {
            System.out.println("Text Document");
            System.out.println("Word Count : "+wordCount);
        }
    }

    class ImageDocument extends Document {
        private int resolution;
        private String title;
        public ImageDocument(int resolution,String title){
            super(title);
            this.title=title;
            this.resolution=resolution;
        }

        @Override
        void documentType() {
            System.out.println("Image Document ");
            System.out.println("Resolution : "+resolution);
        }

        public int getResolution() {
            return resolution;
        }

        public void setResolution(int resolution) {
            this.resolution = resolution;
        }

        public String getTitle() {
            return title;
        }


    }

