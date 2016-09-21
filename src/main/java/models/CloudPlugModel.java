package models;

/**
 * @author Timur Tasci
 * @version 1.0
 * @date 07.09.2016
 * @copyright Timur Tasci, ISW Uni Stuttgart
 */
public class CloudPlugModel {

    private String[] signals;
    private String[][] values;

    public CloudPlugModel() {
    }

    public CloudPlugModel(String[] signals, String[][] values) {
        this.signals = signals;
        this.values = values;
    }

    public String[][] getValues() {
        return values;
    }

    public void setValues(String[][] values) {
        this.values = values;
    }

    public String[] getSignals() {
        return signals;
    }

    public void setSignals(String[] signals) {
        this.signals = signals;
    }
}
