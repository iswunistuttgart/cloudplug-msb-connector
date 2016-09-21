package models;

/**
 * @author Timur Tasci
 * @version 1.0
 * @date 21.09.2016
 * @copyright Timur Tasci, ISW Uni Stuttgart
 */
public class Sensors {
    String id;
    String[][] data;

    public Sensors() {
    }

    public Sensors(String id, String[][] data) {
        this.id = id;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }
}
