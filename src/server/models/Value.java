package server.models;

/**
 * Created by Matt on 10/14/2014.
 */
public class Value {
    int valueid;
    String name;
    int recordid;
    int fieldid;

    /**
     * Get the valueId
     * @return
     */
    public int getValueid() {
        return valueid;
    }

    /**
     * Sets the valueid of the value
     * @param valueid
     */
    public void setValueid(int valueid) {
        this.valueid = valueid;
    }

    /**
     * get name of value
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Set name of Value
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get Recordid of Value
     * @return
     */
    public int getRecordid() {
        return recordid;
    }

    /**
     * set Recordid of Value
     * @param recordid
     */
    public void setRecordid(int recordid) {
        this.recordid = recordid;
    }

    /**
     * get fieldid of value
     * @return
     */
    public int getFieldid() {
        return fieldid;
    }

    /**
     * set field id of Value
     * @param fieldid
     */
    public void setFieldid(int fieldid) {
        this.fieldid = fieldid;
    }
}
