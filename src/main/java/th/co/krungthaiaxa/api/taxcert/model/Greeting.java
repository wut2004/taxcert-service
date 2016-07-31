package th.co.krungthaiaxa.api.taxcert.model;

/**
 * Created by Wuttichai on 7/30/2016 AD.
 */
public class Greeting {
    private long id;
    private String content;

    Greeting(){

    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
