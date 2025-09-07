package Exercise14InheritanceEqualsHashNested.problem80;

public class libraryItem {
    private String itemId;
    private String title;
    private String author;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void checkout(){
        System.out.println("Check the this " + itemId + " book");
    }

    public void returnItem(){
        System.out.println("I want to return " + itemId + " book");
    }
}
