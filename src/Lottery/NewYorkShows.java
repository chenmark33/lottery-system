package Lottery;

/**
 * This class represents a show
 * @author Mark Chen
 */
public class NewYorkShows {

    private String title;
    private int cost;

    /**
     * Constructs a new show.
     * @param title title of the show
     * @param cost the cost of the show
     */
    public NewYorkShows(String title, int cost) {
        this.title = title;
        this.cost = cost;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

}
