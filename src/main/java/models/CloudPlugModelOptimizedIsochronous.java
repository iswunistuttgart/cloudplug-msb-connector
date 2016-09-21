package models;

/**
 * @author Timur Tasci
 * @version 1.0
 * @date 21.09.2016
 * @copyright Timur Tasci, ISW Uni Stuttgart
 */
public class CloudPlugModelOptimizedIsochronous {
    private String devId;
    private String projectId;
    private Sensors[] sensors;

    public CloudPlugModelOptimizedIsochronous() {
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Sensors[] getSensors() {
        return sensors;
    }

    public void setSensors(Sensors[] sensors) {
        this.sensors = sensors;
    }
}
