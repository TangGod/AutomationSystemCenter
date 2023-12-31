/*
 * This file is generated by jOOQ.
*/
package tanggod.github.io.config.database.repository.wish.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User implements Serializable {

    private static final long serialVersionUID = 713384328;

    private String id;
    private String _Name;
    private Long   filesize;

    public User() {}

    public User(User value) {
        this.id = value.id;
        this._Name = value._Name;
        this.filesize = value.filesize;
    }

    public User(
        String id,
        String _Name,
        Long   filesize
    ) {
        this.id = id;
        this._Name = _Name;
        this.filesize = filesize;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String get_Name() {
        return this._Name;
    }

    public void set_Name(String _Name) {
        this._Name = _Name;
    }

    public Long getFilesize() {
        return this.filesize;
    }

    public void setFilesize(Long filesize) {
        this.filesize = filesize;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User (");

        sb.append(id);
        sb.append(", ").append(_Name);
        sb.append(", ").append(filesize);

        sb.append(")");
        return sb.toString();
    }
}
