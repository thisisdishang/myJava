/* Write a Java program to create an interface Searchable with a method search(String keyword) that searches for a given keyword in
a text document. Create two classes Document and WebPage that implement the Searchable interface and provide their own implementations
of the search() method. */

interface Searchable {
    void search(String keyword);
}

class Document implements Searchable {
    private String str;

    public Document(String str) {
        this.str = str;
    }

    public void search(String keyword) {
        if (str.contains(keyword)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found!!");
        }
    }
}

class WebPage implements Searchable {
    private String url;
    private String pageContent;

    public WebPage(String url, String pageContent) {
        this.url = url;
        this.pageContent = pageContent;
    }

    public void search(String keyword) {
        if (pageContent.contains(keyword)) {
            System.out.println("Keyword '" + keyword + "' found in the web page at URL: " + url);
        } else {
            System.out.println("Keyword '" + keyword + "' not found in the web page at URL: " + url);
        }
    }
}

class Q9 {
    public static void main(String[] args) {
        Searchable document = new Document("This is a sample document with some text.");
        Searchable webPage = new WebPage("http://example.com", "This is a sample web page content.");

        document.search("sample");
        document.search("Java");

        webPage.search("web");
        webPage.search("Java");
    }
}