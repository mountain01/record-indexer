package server.models;

/**
 * Created by Matt on 10/14/2014.
 */
public class Project {
    int projectid;
    String title;
    int recordsperimage;
    int firstycoord;
    int recordheight;

    /**
     * get the project's id
     * @return
     */
    public int getProjectid() {
        return projectid;
    }

    /**
     * set the project's id
     * @param projectid
     */
    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    /**
     * get the project's title
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * set title of the project
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * get number of images per record
     * @return
     */
    public int getRecordsperimage() {
        return recordsperimage;
    }

    /**
     * set number of records per image
     * @param recordsperimage
     */
    public void setRecordsperimage(int recordsperimage) {
        this.recordsperimage = recordsperimage;
    }

    /**
     * get y coordinate of first record in project
     * @return
     */
    public int getFirstycoord() {
        return firstycoord;
    }

    /**
     * set first y coordinate of record in project
     * @param firstycoord
     */
    public void setFirstycoord(int firstycoord) {
        this.firstycoord = firstycoord;
    }

    /**
     * get height of records in project
     * @return
     */
    public int getRecordheight() {
        return recordheight;
    }

    /**
     * set height of records for project
     * @param recordheight
     */
    public void setRecordheight(int recordheight) {
        this.recordheight = recordheight;
    }
}
