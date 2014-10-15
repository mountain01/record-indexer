package server.models;

/**
 * Created by Matt on 10/14/2014.
 */
public class Batch {
    int batchid;
    int projectid;
    String imagefilepath;
    boolean complete;

    /**
     * get the batch's id
     * @return
     */
    public int getBatchid() {
        return batchid;
    }

    /**
     * set the batch's id
     * @param batchid
     */
    public void setBatchid(int batchid) {
        this.batchid = batchid;
    }

    /**
     * get the batch's associated project id
     * @return
     */
    public int getProjectid() {
        return projectid;
    }

    /**
     * set the batch's associated project id
     * @param projectid
     */
    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    /**
     * get the file path for the batch's image
     * @return
     */
    public String getImagefilepath() {
        return imagefilepath;
    }

    /**
     * set the file path for the batch's image
     * @param imagefilepath
     */
    public void setImagefilepath(String imagefilepath) {
        this.imagefilepath = imagefilepath;
    }

    /**
     * check to see if the batch has been completed or not
     * @return
     */
    public boolean isComplete() {
        return complete;
    }

    /**
     * set batch's completed flag
     * @param complete
     */
    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
