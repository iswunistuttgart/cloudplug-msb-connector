package models;

/**
 * @author Timur Tasci
 * @version 1.0
 * @date 07.09.2016
 * @copyright Timur Tasci, ISW Uni Stuttgart
 */
public class CloudPlugModelLegacy {

    private String[] signals;
    private String[][] values;

    public CloudPlugModelLegacy() {
    }

    public CloudPlugModelLegacy(String[] signals, String[][] values) {
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
