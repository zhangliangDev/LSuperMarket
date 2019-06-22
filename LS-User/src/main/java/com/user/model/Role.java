package com.user.model;

public class Role {
    private String objId;

    private String rolename;

    private String rolelevel;

    private String belongroleid;

    private String comments;

    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId == null ? null : objId.trim();
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRolelevel() {
        return rolelevel;
    }

    public void setRolelevel(String rolelevel) {
        this.rolelevel = rolelevel == null ? null : rolelevel.trim();
    }

    public String getBelongroleid() {
        return belongroleid;
    }

    public void setBelongroleid(String belongroleid) {
        this.belongroleid = belongroleid == null ? null : belongroleid.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }
}