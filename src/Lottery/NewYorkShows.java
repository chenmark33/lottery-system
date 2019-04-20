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

    /**
     * Returns the show title
     * @return the show title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns the show's cost
     * @return the show's cost.
     */
    public int getCost() {
        return cost;
    }

    /**
     * Sets the cost.
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

}
