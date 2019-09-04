package chapter7proj;

public class Text {
	public String title;
	public String authour;
	public int datePublished;
	public int pages;
	
	public Text(String TITLE, String AUTHOUR, int DATE, int PAGES) {
		title = TITLE;
		authour = AUTHOUR;
		datePublished = DATE;
		pages = PAGES;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthour() {
		return authour;
	}
	public int getDatePublished() {
		return datePublished;
	}
	public int getPages() {
		return pages;
	}
}
class Novel extends Text{
	String genre;
	public Novel(String TITLE, String AUTHOUR, String GENRE, int DATE, int PAGES) {
		super(TITLE, AUTHOUR, DATE, PAGES);
		genre = GENRE;
	}
	
}
class Magazine extends Text{
	String issue;
	public Magazine(String TITLE, String AUTHOUR, String ISSUE, int DATE, int PAGES) {
		super(TITLE, AUTHOUR, DATE, PAGES);
		issue = ISSUE;
	}
	
}
class TechnicalJournal extends Text{
	String topicCategory;
	public TechnicalJournal(String TITLE, String AUTHOUR, String TOPIC, int DATE, int PAGES) {
		super(TITLE, AUTHOUR, DATE, PAGES);
		topicCategory = TOPIC;
	}
	
}
class Textbook extends Text{
	String course;
	public Textbook(String TITLE, String AUTHOUR, String COURSE, int DATE, int PAGES) {
		super(TITLE, AUTHOUR, DATE, PAGES);
		course = COURSE;
	}
	
}