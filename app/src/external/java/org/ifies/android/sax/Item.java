/*
 * Taken from the 'Learning Android' project,;
 * released as Public Domain software at
 * http://github.com/digitalspaghetti/learning-android
 */
package org.ifies.android.sax;

import java.util.Date;

public class Item implements Comparable<Item> {

    private int _id;
    private String title;
    private String link;
    private String description;
    private Date pubDate;
    private String enclosureUrl;
    private String enclosureType;
    private long enclosureLength;

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getPubdate() {
        return this.pubDate;
    }

    public void setPubdate(Date pubdate) {
        this.pubDate = pubdate;
    }

    public String getEnclosureUrl() {
        return this.enclosureUrl;
    }

    public void setEnclosureUrl(String enclosureUrl) {
        this.enclosureUrl = enclosureUrl;
    }

    public String getEnclosureType() {
        return this.enclosureType;
    }

    public void setEnclosureType(String enclosureType) {
        this.enclosureType = enclosureType;
    }

    public long getEnclosureLength() {
        return this.enclosureLength;
    }

    public void setEnclosureLength(long enclosureLength) {
        this.enclosureLength = enclosureLength;
    }

    /**
     * Returns 'the' item link, which preferably is the enclosure url, but otherwise the link (or null if that is empty too)
     *
     * @return A single link url to be used
     */
    public String getTheLink() {
        if (this.getEnclosureUrl() != null) {
            return this.getEnclosureUrl();
        } else {
            return this.getLink();
        }
    }

    /**
     * CompareTo is used to compare (and sort) item based on their publication dates
     */
    @Override
    public int compareTo(Item another) {
        if (another == null || this.pubDate == null || another.getPubdate() == null) {
            return 0;
        }
        return this.pubDate.compareTo(another.getPubdate());
    }

}
